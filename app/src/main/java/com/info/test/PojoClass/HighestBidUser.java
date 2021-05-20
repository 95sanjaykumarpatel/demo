package com.info.test.PojoClass;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class HighestBidUser {

@SerializedName("id")
@Expose
private String id;
@SerializedName("user_id")
@Expose
private String userId;
@SerializedName("product_id")
@Expose
private String productId;
@SerializedName("bid_price")
@Expose
private String bidPrice;
@SerializedName("total_bid")
@Expose
private String totalBid;
@SerializedName("bid_start")
@Expose
private String bidStart;
@SerializedName("date")
@Expose
private String date;
@SerializedName("created_date")
@Expose
private String createdDate;
@SerializedName("user_fname")
@Expose
private String userFname;
@SerializedName("user_lname")
@Expose
private String userLname;
@SerializedName("username")
@Expose
private String username;
@SerializedName("user_email")
@Expose
private String userEmail;
@SerializedName("user_contact")
@Expose
private String userContact;
@SerializedName("user_password")
@Expose
private String userPassword;
@SerializedName("user_image")
@Expose
private String userImage;
@SerializedName("gender")
@Expose
private String gender;
@SerializedName("user_address")
@Expose
private String userAddress;
@SerializedName("user_status")
@Expose
private String userStatus;
@SerializedName("user_otp")
@Expose
private String userOtp;
@SerializedName("remember_token")
@Expose
private String rememberToken;
@SerializedName("you_have")
@Expose
private String youHave;
@SerializedName("country")
@Expose
private String country;
@SerializedName("state")
@Expose
private String state;
@SerializedName("city")
@Expose
private String city;
@SerializedName("area")
@Expose
private String area;
@SerializedName("block")
@Expose
private String block;
@SerializedName("street")
@Expose
private String street;
@SerializedName("jadah")
@Expose
private String jadah;
@SerializedName("house")
@Expose
private String house;
@SerializedName("otp")
@Expose
private String otp;
@SerializedName("login_status")
@Expose
private String loginStatus;

/**
* No args constructor for use in serialization
*
*/
public HighestBidUser() {
}

/**
*
* @param date
* @param country
* @param userLname
* @param userPassword
* @param userStatus
* @param gender
* @param city
* @param house
* @param totalBid
* @param userImage
* @param street
* @param userEmail
* @param userOtp
* @param block
* @param id
* @param state
* @param area
* @param productId
* @param bidStart
* @param youHave
* @param otp
* @param userContact
* @param loginStatus
* @param userId
* @param bidPrice
* @param userAddress
* @param createdDate
* @param jadah
* @param rememberToken
* @param userFname
* @param username
*/
public HighestBidUser(String id, String userId, String productId, String bidPrice, String totalBid, String bidStart, String date, String createdDate, String userFname, String userLname, String username, String userEmail, String userContact, String userPassword, String userImage, String gender, String userAddress, String userStatus, String userOtp, String rememberToken, String youHave, String country, String state, String city, String area, String block, String street, String jadah, String house, String otp, String loginStatus) {
super();
this.id = id;
this.userId = userId;
this.productId = productId;
this.bidPrice = bidPrice;
this.totalBid = totalBid;
this.bidStart = bidStart;
this.date = date;
this.createdDate = createdDate;
this.userFname = userFname;
this.userLname = userLname;
this.username = username;
this.userEmail = userEmail;
this.userContact = userContact;
this.userPassword = userPassword;
this.userImage = userImage;
this.gender = gender;
this.userAddress = userAddress;
this.userStatus = userStatus;
this.userOtp = userOtp;
this.rememberToken = rememberToken;
this.youHave = youHave;
this.country = country;
this.state = state;
this.city = city;
this.area = area;
this.block = block;
this.street = street;
this.jadah = jadah;
this.house = house;
this.otp = otp;
this.loginStatus = loginStatus;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getUserId() {
return userId;
}

public void setUserId(String userId) {
this.userId = userId;
}

public String getProductId() {
return productId;
}

public void setProductId(String productId) {
this.productId = productId;
}

public String getBidPrice() {
return bidPrice;
}

public void setBidPrice(String bidPrice) {
this.bidPrice = bidPrice;
}

public String getTotalBid() {
return totalBid;
}

public void setTotalBid(String totalBid) {
this.totalBid = totalBid;
}

public String getBidStart() {
return bidStart;
}

public void setBidStart(String bidStart) {
this.bidStart = bidStart;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public String getCreatedDate() {
return createdDate;
}

public void setCreatedDate(String createdDate) {
this.createdDate = createdDate;
}

public String getUserFname() {
return userFname;
}

public void setUserFname(String userFname) {
this.userFname = userFname;
}

public String getUserLname() {
return userLname;
}

public void setUserLname(String userLname) {
this.userLname = userLname;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getUserEmail() {
return userEmail;
}

public void setUserEmail(String userEmail) {
this.userEmail = userEmail;
}

public String getUserContact() {
return userContact;
}

public void setUserContact(String userContact) {
this.userContact = userContact;
}

public String getUserPassword() {
return userPassword;
}

public void setUserPassword(String userPassword) {
this.userPassword = userPassword;
}

public String getUserImage() {
return userImage;
}

public void setUserImage(String userImage) {
this.userImage = userImage;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getUserAddress() {
return userAddress;
}

public void setUserAddress(String userAddress) {
this.userAddress = userAddress;
}

public String getUserStatus() {
return userStatus;
}

public void setUserStatus(String userStatus) {
this.userStatus = userStatus;
}

public String getUserOtp() {
return userOtp;
}

public void setUserOtp(String userOtp) {
this.userOtp = userOtp;
}

public String getRememberToken() {
return rememberToken;
}

public void setRememberToken(String rememberToken) {
this.rememberToken = rememberToken;
}

public String getYouHave() {
return youHave;
}

public void setYouHave(String youHave) {
this.youHave = youHave;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getArea() {
return area;
}

public void setArea(String area) {
this.area = area;
}

public String getBlock() {
return block;
}

public void setBlock(String block) {
this.block = block;
}

public String getStreet() {
return street;
}

public void setStreet(String street) {
this.street = street;
}

public String getJadah() {
return jadah;
}

public void setJadah(String jadah) {
this.jadah = jadah;
}

public String getHouse() {
return house;
}

public void setHouse(String house) {
this.house = house;
}

public String getOtp() {
return otp;
}

public void setOtp(String otp) {
this.otp = otp;
}

public String getLoginStatus() {
return loginStatus;
}

public void setLoginStatus(String loginStatus) {
this.loginStatus = loginStatus;
}

}