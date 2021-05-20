package com.info.test.PojoClass;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Dashboard {

@SerializedName("status")
@Expose
private String status;
@SerializedName("data")
@Expose
private Data data;
@SerializedName("message")
@Expose
private String message;

/**
* No args constructor for use in serialization
*
*/
public Dashboard() {
}

/**
*
* @param data
* @param message
* @param status
*/
public Dashboard(String status, Data data, String message) {
super();
this.status = status;
this.data = data;
this.message = message;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public Data getData() {
return data;
}

public void setData(Data data) {
this.data = data;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

}