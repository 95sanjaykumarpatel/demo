package com.info.test;

import com.info.test.PojoClass.Dashboard;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
 
    String BASE_URL = "http://tenspark.com/tenfills_new/Api/";

    @GET("deshboard")
    Call<Dashboard> getDashboard();
 
}