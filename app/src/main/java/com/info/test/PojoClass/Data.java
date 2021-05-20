package com.info.test.PojoClass;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

@SerializedName("slider")
@Expose
private List<Slider> slider = null;
@SerializedName("live_products")
@Expose
private List<LiveProduct> liveProducts = null;
@SerializedName("ready_products")
@Expose
private List<Object> readyProducts = null;
@SerializedName("coming_soon_products")
@Expose
private List<Object> comingSoonProducts = null;
@SerializedName("user_bid")
@Expose
private String userBid;

/**
* No args constructor for use in serialization
*
*/
public Data() {
}

/**
*
* @param slider
* @param readyProducts
* @param comingSoonProducts
* @param userBid
* @param liveProducts
*/
public Data(List<Slider> slider, List<LiveProduct> liveProducts, List<Object> readyProducts, List<Object> comingSoonProducts, String userBid) {
super();
this.slider = slider;
this.liveProducts = liveProducts;
this.readyProducts = readyProducts;
this.comingSoonProducts = comingSoonProducts;
this.userBid = userBid;
}

public List<Slider> getSlider() {
return slider;
}

public void setSlider(List<Slider> slider) {
this.slider = slider;
}

public List<LiveProduct> getLiveProducts() {
return liveProducts;
}

public void setLiveProducts(List<LiveProduct> liveProducts) {
this.liveProducts = liveProducts;
}

public List<Object> getReadyProducts() {
return readyProducts;
}

public void setReadyProducts(List<Object> readyProducts) {
this.readyProducts = readyProducts;
}

public List<Object> getComingSoonProducts() {
return comingSoonProducts;
}

public void setComingSoonProducts(List<Object> comingSoonProducts) {
this.comingSoonProducts = comingSoonProducts;
}

public String getUserBid() {
return userBid;
}

public void setUserBid(String userBid) {
this.userBid = userBid;
}

}