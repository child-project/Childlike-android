package com.example.childlike.retrofit.retrofitdata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestChildrenPost {
    @SerializedName("age")
    @Expose
    private String age;

    @SerializedName("gender")
    @Expose
    private String gender;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("uid")
    @Expose
    private String uid;

    public RequestChildrenPost(String age, String gender, String name, String image, String uid) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.image = image;
        this.uid = uid;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getUid() {
        return uid;
    }
}
