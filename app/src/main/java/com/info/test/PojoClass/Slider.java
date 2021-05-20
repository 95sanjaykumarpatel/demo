package com.info.test.PojoClass;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Slider {

@SerializedName("title")
@Expose
private String title;
@SerializedName("image")
@Expose
private String image;
@SerializedName("type")
@Expose
private String type;
@SerializedName("status")
@Expose
private String status;

/**
* No args constructor for use in serialization
*
*/
public Slider() {
}

/**
*
* @param image
* @param title
* @param type
* @param status
*/
public Slider(String title, String image, String type, String status) {
super();
this.title = title;
this.image = image;
this.type = type;
this.status = status;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

}