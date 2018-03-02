package com.example.swain.androidtablayouttest;

import android.content.ClipData;

/**
 * Created by swain on 3/1/18.
 */

public class RestaurantInfo {
    public String name;
    public String address;
    public int rating;
    public int imageID;

    public RestaurantInfo(String name, String address, int rating, int imageID){
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.imageID = imageID;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setRating(int rating) {
        this.rating = rating;
    }

    void setImageID(int ID) {
        imageID = ID;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    int getRating(){
        return rating;
    }

    int getImageID() {
        return imageID;
    }

}
