package com.sahith.builderDesign;
public class RestaurantBooking
{
    int numberOfPeople;
    String starters;
    String mainCourse;
    String beverages;
    String desserts;

    public RestaurantBooking(int numberOfPeople , String starters , String mainCourse , String beverages , String desserts)
    {
        this.numberOfPeople = numberOfPeople;
        this.starters = starters;
        this.mainCourse = mainCourse;
        this.beverages = beverages;
        this.desserts = desserts;
    }

    public String toString()
    {
        return "Table is successfully booked........." +
                " Details[Number of people :" + numberOfPeople + " , Starters : " + starters + " , Main Course : " + mainCourse +
                " , Beverages : " + beverages + " , Desserts : " + desserts + "]";

    }
}
