package com.example.test;

public class Hotels {
    private String name;
    private int imageID;

    public static final Hotels[] subject ={
            new Hotels("Merador hotel",R.drawable.merdao),
            new Hotels("casablanca hotel",R.drawable.casblanca),
            new Hotels(" royal cort  hotel",R.drawable.royalcort),
            new Hotels("melenom hotel",R.drawable.melenom),
            new Hotels("Grand park hotel",R.drawable.grandpark),
            new Hotels("Karmel hotel",R.drawable.karmel)

    };
    private Hotels(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}