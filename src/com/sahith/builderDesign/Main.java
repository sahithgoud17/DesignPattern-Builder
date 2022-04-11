package com.sahith.builderDesign;

public class Main
{
    public static void main(String[] args)
    {
        BookingBuilder bd = new BookingBuilder();
        RestaurantBooking restaurant = bd.setNumberOfPeople(4).setStarters("Chicken Tikka").setMainCourse("Hyderabadi Chicken Biryani").getDetails();
        System.out.println(restaurant);
    }
}
