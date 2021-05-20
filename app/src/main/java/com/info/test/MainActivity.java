package com.info.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.moeidbannerlibrary.banner.BannerLayout;
import com.example.moeidbannerlibrary.banner.BaseBannerAdapter;
import com.info.test.PojoClass.Dashboard;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ImageView item_img;
    private BannerLayout banner;
    List<String> urls ;
    private TextView product_nameTV,
            product_deailsTV,
            current_priceTV,
            minimum_priceTV,
            bid_priceTV,
            timer1TV;
    private ToggleButton toggleButton1;
    private ImageView viewIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item_img = findViewById(R.id.item_img);
        product_nameTV = findViewById(R.id.product_nameTV);
        product_deailsTV = findViewById(R.id.product_deailsTV);
        current_priceTV = findViewById(R.id.current_priceTV);
        minimum_priceTV = findViewById(R.id.minimum_priceTV);
        viewIMG = findViewById(R.id.viewIMG);
        bid_priceTV = findViewById(R.id.bid_priceTV);
        toggleButton1 = findViewById(R.id.chkState);
        timer1TV = findViewById(R.id.timer1TV);
        banner=(BannerLayout) findViewById(R.id.Banner);
        getHeroes();

        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Status "+isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        viewIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getHeroes() {
        Call<Dashboard> call = RetrofitClient.getInstance().getMyApi().getDashboard();
        call.enqueue(new Callback<Dashboard>() {
            @Override
            public void onResponse(Call<Dashboard> call, Response<Dashboard> response) {
                Dashboard dashboard = response.body();

                Log.d("sanjay",""+dashboard.getStatus());

                Picasso.get().load(dashboard.getData().getSlider().get(1).getImage()).into(item_img);
                //Picasso.get().load(dashboard.getData().getLiveProducts().get(0).getImage()).into(item_img);
                product_nameTV.setText(dashboard.getData().getLiveProducts().get(0).getProductName());
                current_priceTV.setText(dashboard.getData().getLiveProducts().get(0).getCurrentPrice()+" KD");
                bid_priceTV.setText(dashboard.getData().getLiveProducts().get(0).getHighestBidUser().getBidPrice()+" KD");
                Timmer(dashboard.getData().getLiveProducts().get(0).getTimer());
              //  product_deailsTV.setText(dashboard.getData().getLiveProducts().get(1).getProductName());
               /* urls = new ArrayList<>();
                for (int i = 0 ; i < dashboard.getData().getSlider().size() ; i++){
                    urls.add(dashboard.getData().getSlider().get(i).getImage());
                }
                if (urls.size()>0){
                    BaseBannerAdapter webBannerAdapter=new BaseBannerAdapter(MainActivity.this,urls);
                    webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
                        @Override
                        public void onItemClick(int position)
                        {}
                    });
                    banner.setAdapter(webBannerAdapter);
                }*/

               /* //Creating an String array for the ListView
                String[] heroes = new String[heroList.size()];

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < heroList.size(); i++) {
                    heroes[i] = heroList.get(i).getName();
                }

                //displaying the string array into listview
                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, heroes));*/
            }

            @Override
            public void onFailure(Call<Dashboard> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Timmer(String timer){
        long timer1 = Long.parseLong(timer);
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer1TV.setText(millisUntilFinished / 1000+" s");
                Log.d("sanjay",""+millisUntilFinished / 1000+" s");
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
              //  mTextField.setText("done!");
            }

        }.start();
    }
}