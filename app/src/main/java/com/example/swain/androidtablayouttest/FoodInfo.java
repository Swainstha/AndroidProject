package com.example.swain.androidtablayouttest;

/**
 * Created by swain on 3/5/18.
 */

public class FoodInfo {
    private String foodName;
    private String foodDescription;
    private int foodPictureID;

    public FoodInfo(String foodName, String foodDescription, int foodPictureID) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPictureID = foodPictureID;
    }
    public String getFoodName() {
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }
    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodPictureID() {
        return this.foodPictureID;
    }
}
