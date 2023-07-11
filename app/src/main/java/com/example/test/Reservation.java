package com.example.test;

import java.util.Random;

public class Reservation {
    private String hotelname;
    private int capacity;

    public Reservation(String hotelname, int capacity) {
        this.hotelname = hotelname;
        this.capacity = capacity;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



}
