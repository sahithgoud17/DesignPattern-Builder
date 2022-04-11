package com.sahith.builderDesign;

public class BookingBuilder
{
    int numberOfPeople;
    String starters;
    String mainCourse;
    String beverages;
    String desserts;

    public BookingBuilder setNumberOfPeople(int numberOfPeople)
    {
        this.numberOfPeople = numberOfPeople;
        return this;
    }

    public BookingBuilder setStarters(String starters)
    {
        this.starters = starters;
        return this;
    }

    public BookingBuilder setMainCourse(String mainCourse)
    {
        this.mainCourse = mainCourse;
        return this;
    }

    public BookingBuilder setBeverages(String beverages)
    {
        this.beverages = beverages;
        return this;
    }

    public BookingBuilder setDesserts(String desserts)
    {
        this.desserts= desserts;
        return this;
    }

    public RestaurantBooking getDetails()
    {
        return new RestaurantBooking(numberOfPeople , starters , mainCourse , beverages , desserts);
    }
}
