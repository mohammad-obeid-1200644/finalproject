package com.example.test;

import java.util.Random;

public class Room extends Reservation{
    private int roomnum;
    private int roomcap;
    private int floor;
    private int avail;
    private int price;

    public Room(String hotelname, int capacity,int roomnum,int roomcap,int floor ,int available,int price) {
        super(hotelname, capacity);
        this.roomnum=roomnum;
        this.roomcap=roomcap;
        this.floor=floor;
        this.avail=available;
        this.price=price;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public int getRoomcap() {
        return roomcap;
    }

    public void setRoomcap(int roomcap) {
        this.roomcap = roomcap;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomnum=" + roomnum +
                ", roomcap=" + roomcap +
                ", floor=" + floor +
                ", avail=" + avail +
                ", price=" + price +
                '}';
    }
}
