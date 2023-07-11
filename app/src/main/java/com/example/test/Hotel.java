package com.example.test;

public class Hotel {
    private String name;
    private String info;
    private int[][] numberOfRoom;

    public Hotel(String name, String info, int[][] numberOfRoom) {
        this.name = name;
        this.info = info;
        this.numberOfRoom = numberOfRoom;

    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int[][] getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setNumberOfRoom(int[][] numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }


    public boolean isVailed(int number){
        if(numberOfRoom[number-1][1]!=0){

            return  true;
        }
        else{
            return false;
        }
    }

    public void insertData(){
        if(name.equals("marac")){
            numberOfRoom= new int[][]{{0, 2}, {1, 3}, {2, 5}};//using data base
        }
        else{
            ///contunie
        }



    }


}
