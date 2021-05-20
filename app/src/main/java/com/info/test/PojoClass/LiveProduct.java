package com.info.test.PojoClass;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LiveProduct {

@SerializedName("product_id")
@Expose
private String productId;
@SerializedName("product_name")
@Expose
private String productName;
@SerializedName("product_name_arabic")
@Expose
private String productNameArabic;
@SerializedName("current_price")
@Expose
private String currentPrice;
@SerializedName("minimum_bit_interst")
@Expose
private String minimumBitInterst;
@SerializedName("price")
@Expose
private String price;
@SerializedName("image")
@Expose
private String image;
@SerializedName("end_date")
@Expose
private String endDate;
@SerializedName("end_time")
@Expose
private String endTime;
@SerializedName("start_date")
@Expose
private String startDate;
@SerializedName("start_time")
@Expose
private String startTime;
@SerializedName("timer")
@Expose
private String timer;
@SerializedName("highest_bid_user")
@Expose
private HighestBidUser highestBidUser;

/**
* No args constructor for use in serialization
*
*/
public LiveProduct() {
}

/**
*
* @param image
* @param productNameArabic
* @param productId
* @param endDate
* @param minimumBitInterst
* @param currentPrice
* @param productName
* @param highestBidUser
* @param timer
* @param price
* @param startTime
* @param endTime
* @param startDate
*/
public LiveProduct(String productId, String productName, String productNameArabic, String currentPrice, String minimumBitInterst, String price, String image, String endDate, String endTime, String startDate, String startTime, String timer, HighestBidUser highestBidUser) {
super();
this.productId = productId;
this.productName = productName;
this.productNameArabic = productNameArabic;
this.currentPrice = currentPrice;
this.minimumBitInterst = minimumBitInterst;
this.price = price;
this.image = image;
this.endDate = endDate;
this.endTime = endTime;
this.startDate = startDate;
this.startTime = startTime;
this.timer = timer;
this.highestBidUser = highestBidUser;
}

public String getProductId() {
return productId;
}

public void setProductId(String productId) {
this.productId = productId;
}

public String getProductName() {
return productName;
}

public void setProductName(String productName) {
this.productName = productName;
}

public String getProductNameArabic() {
return productNameArabic;
}

public void setProductNameArabic(String productNameArabic) {
this.productNameArabic = productNameArabic;
}

public String getCurrentPrice() {
return currentPrice;
}

public void setCurrentPrice(String currentPrice) {
this.currentPrice = currentPrice;
}

public String getMinimumBitInterst() {
return minimumBitInterst;
}

public void setMinimumBitInterst(String minimumBitInterst) {
this.minimumBitInterst = minimumBitInterst;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getEndDate() {
return endDate;
}

public void setEndDate(String endDate) {
this.endDate = endDate;
}

public String getEndTime() {
return endTime;
}

public void setEndTime(String endTime) {
this.endTime = endTime;
}

public String getStartDate() {
return startDate;
}

public void setStartDate(String startDate) {
this.startDate = startDate;
}

public String getStartTime() {
return startTime;
}

public void setStartTime(String startTime) {
this.startTime = startTime;
}

public String getTimer() {
return timer;
}

public void setTimer(String timer) {
this.timer = timer;
}

public HighestBidUser getHighestBidUser() {
return highestBidUser;
}

public void setHighestBidUser(HighestBidUser highestBidUser) {
this.highestBidUser = highestBidUser;
}

}