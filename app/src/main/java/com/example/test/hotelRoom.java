package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class hotelRoom extends AppCompatActivity {
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private Button btn1;
    private Button btn2;
    private Reservation reser1=new Reservation("Merado Hotel",60);
    private Reservation reser2=new Reservation("Casablanca Hotel",70);
    private Reservation reser3=new Reservation("RoyalCort Hotel",110);
    private Reservation reser4=new Reservation("meleniom Hotel",218);
    private Reservation reser5=new Reservation("GrandPark Hotel",154);
    private Reservation reser6=new Reservation("Karmel Hotel",120);
    private int [][] x=new int[6][3];

    private Room [][]room=new Room[6][60];

    private int [][]firsthot=new int[3][60];
    private int [][]secthot=new int[3][70];
    private int [][]thirdthot=new int[3][110];
    private int [][]fourthhot=new int[3][218];
    private int [][]fifththot=new int[3][154];
    private int [][]sixththot=new int[3][120];
    private String hotname;
    private String flag;
    public static int counter=1;
    public static int j=0,a=0,b=0,c=0,d=0,e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_room);
        Bundle bundle12 = getIntent().getExtras();
        flag=(bundle12.getString("flag"));
        hotname = bundle12.getString("ddd");

        txt1=findViewById(R.id.welctxt);
        txt2=findViewById(R.id.roomnum);
        txt3=findViewById(R.id.pric);
        txt4=findViewById(R.id.from);
        txt5=findViewById(R.id.To);
        btn1=findViewById(R.id.reserve);
        btn2=findViewById(R.id.rege);

        int merado[][] = new int[60][4];
        Random rn = new Random();
        Random pc = new Random();
        //int answer = rn.nextInt(10) + 1;
        for (int i = 0; i < 60; i++) {

            merado[i][0] = i + 1;
            merado[i][1] = rn.nextInt(5) + 1;
            merado[i][2] = 9;
            merado[i][3] = pc.nextInt(300) + 1;
            while(merado[i][3]<100){
                merado[i][3] = pc.nextInt(300) + 1;
            }
            if (merado[i][1] == 1) {
                x[0][0]+=1;
//                firsthot[0][j]=i;
                //System.out.println(firsthot[0][j]);
            } else if (merado[i][1] == 2) {
                x[0][1]+=1;
//                firsthot[1][j]=i;
            } else {
                x[0][2]+=1;
//                firsthot[2][j]=i;
            }
//            j++;
            room[0][i] = new Room("Merador hotel", 60, merado[i][0], merado[i][1], i / 6, merado[i][2], merado[i][3]);
        }


            int Casablanca[][]=new int [70][4];
             rn = new Random();
             pc = new Random();
            room[1]=new Room[70];
            //int answer = rn.nextInt(10) + 1;
            for(int i=0;i<70;i++)
            {
                Casablanca[i][0]= i+1;
                Casablanca[i][1]= rn.nextInt(5) + 1;
                Casablanca[i][2]= 9;
                Casablanca[i][3]= pc.nextInt(300) + 1;
                while(Casablanca[i][3]<100){
                    Casablanca[i][3] = pc.nextInt(300) + 1;
                }
                if(Casablanca[i][1]==1){
                    x[1][0]++;
//                    secthot[0][a]=i;
                }
                else if(Casablanca[i][1]==2){
                    x[1][1]++;
//                    secthot[1][a]=i;
                }
                else{
                    x[1][2]++;
//                    secthot[2][a]=i;
                }
//                a++;
                room[1][i]=new Room("Casablanca hotel",70,Casablanca[i][0],Casablanca[i][1],i/7,Casablanca[i][2],Casablanca[i][3]);
            }





            int RoyalCort[][]=new int [110][4];
             rn = new Random();
             pc = new Random();
            room[2]=new Room[110];
            //int answer = rn.nextInt(10) + 1;
            for(int i=0;i<110;i++)
            {
                RoyalCort[i][0]= i+1;
                RoyalCort[i][1]= rn.nextInt(5) + 1;
                RoyalCort[i][2]= 9;
                RoyalCort[i][3]= pc.nextInt(300) + 1;
                while(RoyalCort[i][3]<100){
                    RoyalCort[i][3] = pc.nextInt(300) + 1;
                }
                if(RoyalCort[i][1]==1){
                    x[2][0]++;
//                    thirdthot[0][b]=i;
                }
                else if(RoyalCort[i][1]==2){
                    x[2][1]++;
//                    thirdthot[1][b]=i;
                }
                else{
                    x[2][2]++;
//                    thirdthot[2][b]=i;
                }
//                b++;
                room[2][i]=new Room("Royal cort hotel",110,RoyalCort[i][0],RoyalCort[i][1],i/9,RoyalCort[i][2],RoyalCort[i][3]);
            }




            room[3]=new Room[218];
            int meleniom[][]=new int [218][4];
             rn = new Random();
             pc = new Random();
            //int answer = rn.nextInt(10) + 1;
            for(int i=0;i<218;i++)
            {
                meleniom[i][0]= i+1;
                meleniom[i][1]= rn.nextInt(5) + 1;
                meleniom[i][2]= 9;
                meleniom[i][3]= pc.nextInt(300) + 1;
                while(meleniom[i][3]<100){
                    meleniom[i][3] = pc.nextInt(300) + 1;
                }
                if(meleniom[i][1]==1){
                    x[3][0]++;
//                    fourthhot[0][c]=i;
                }
                else if(meleniom[i][1]==2){
                    x[3][1]++;
//                    fourthhot[1][c]=i;
                }
                else{
                    x[3][2]++;
//                    fourthhot[2][c]=i;
                }
//                c++;
                room[3][i]=new Room("Melenoem hotel",218,meleniom[i][0],meleniom[i][1],i/11,meleniom[i][2],meleniom[i][3]);
            }




            int GrandPark[][]=new int [154][4];
             rn = new Random();
             pc = new Random();
            room[4]=new Room[154];
            //int answer = rn.nextInt(10) + 1;
            for(int i=0;i<154;i++)
            {
                GrandPark[i][0]= i+1;
                GrandPark[i][1]= rn.nextInt(5) + 1;
                GrandPark[i][2]= 9;
                GrandPark[i][3]= pc.nextInt(300) + 1;
                while(GrandPark[i][3]<100){
                    GrandPark[i][3] = pc.nextInt(300) + 1;
                }
                if(GrandPark[i][1]==1){
                    x[4][0]++;
//                    fifththot[0][d]=i;
                }
                else if(GrandPark[i][1]==2){
                    x[4][1]++;
//                    fifththot[1][d]=i;
                }
                else{
                    x[4][2]++;
//                    fifththot[0][d]=i;
                }
//                d++;
                room[4][i]=new Room("Grand park hotel",154,GrandPark[i][0],GrandPark[i][1],i/10,GrandPark[i][2],GrandPark[i][3]);
            }


            int Karmel[][]=new int [120][4];
            room[5]=new Room[120];
             rn = new Random();
             pc = new Random();
            //int answer = rn.nextInt(10) + 1;
            for(int i=0;i<120;i++)
            {
                Karmel[i][0]= i+1;
                Karmel[i][1]= rn.nextInt(5) + 1;
                Karmel[i][2]= 9;
                Karmel[i][3]= pc.nextInt(300) + 1;
                while(Karmel[i][3]<100){
                    Karmel[i][3] = pc.nextInt(300) + 1;
                }
                if(Karmel[i][1]==1){
                    x[5][0]++;
//                    sixththot[0][e]=i;
                }
                else if(Karmel[i][1]==2){
                    x[5][1]++;
//                    sixththot[1][e]=i;
                }
                else{
                    x[5][2]++;
//                    sixththot[2][e]=i;
                }
//                e++;
                room[5][i]=new Room("Karmel hotel",120,Karmel[i][0],Karmel[i][1],i/6,Karmel[i][2], Karmel[i][3]);
            }


    }

    public void regenerate(View view) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        if (Integer.parseInt(flag) == 0) {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            if (hotname.equals("Merador hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[0][0]);
                txt3.setText("The price of this room is: " + room[0][counter].getPrice());
            } else if (hotname.equals("Casablanca hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[1][0]);
                txt3.setText("The price of this room is: " + room[1][counter].getPrice());
            } else if (hotname.equals("Royal cort hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[2][0]);
                txt3.setText("The price of this room is: " + room[2][counter].getPrice());
            } else if (hotname.equals("Melenoem hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[3][0]);
                txt3.setText("The price of this room is: " + room[3][counter].getPrice());
            } else if (hotname.equals("Grand park hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[4][0]);
                txt3.setText("The price of this room is: " + room[4][counter].getPrice());
            } else if (hotname.equals("Karmel hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[5][0]);
                txt3.setText("The price of this room is: " + room[5][counter].getPrice());
            }
            counter++;
        }
        else if(Integer.parseInt(flag)==1){
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            if (hotname.equals("Merador hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[0][1]);
                txt3.setText("The price of this room is: " + room[0][counter].getPrice());
            } else if (hotname.equals("Casablanca hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[1][1]);
                txt3.setText("The price of this room is: " + room[1][counter].getPrice());
            } else if (hotname.equals("Royal cort hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[2][1]);
                txt3.setText("The price of this room is: " + room[2][counter].getPrice());
            } else if (hotname.equals("Melenoem hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[3][1]);
                txt3.setText("The price of this room is: " + room[3][counter].getPrice());
            } else if (hotname.equals("Grand park hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[4][1]);
                txt3.setText("The price of this room is: " + room[4][counter].getPrice());
            } else if (hotname.equals("Karmel hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[5][1]);
                txt3.setText("The price of this room is: " + room[5][counter].getPrice());
            }
            counter++;
        }
        else{
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            if (hotname.equals("Merador hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[0][2]);
                txt3.setText("The price of this room is: " + room[0][counter].getPrice());
            } else if (hotname.equals("Casablanca hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+"Avaiable rooms: " + x[1][2]);
                txt3.setText("The price of this room is: " + room[1][counter].getPrice());
            } else if (hotname.equals("Royal cort hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+"Avaiable rooms: " + x[2][2]);
                txt3.setText("The price of this room is: " + room[2][counter].getPrice());
            } else if (hotname.equals("Melenoem hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+"Avaiable rooms: " + x[3][2]);
                txt3.setText("The price of this room is: " + room[3][counter].getPrice());
            } else if (hotname.equals("Grand park hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+"Avaiable rooms: " + x[4][2]);
                txt3.setText("The price of this room is: " + room[4][counter].getPrice());
            } else if (hotname.equals("Karmel hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: " +counter+"\n"+ "Avaiable rooms: " + x[5][2]);
                txt3.setText("The price of this room is: " + room[5][counter].getPrice());
            }
            counter++;
        }

    }

    public void Reserve(View view) {

    }

    public void ser(View view) {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        if (Integer.parseInt(flag) == 0) {
            if (hotname.equals("Merador hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +   "\n" + "Avaiable rooms: " + x[0][0]);
                txt3.setText("The price of this room is: " + room[0][0].getPrice());
            } else if (hotname.equals("Casablanca hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[1][0]);
                txt3.setText("The price of this room is: " + room[1][0].getPrice());
            } else if (hotname.equals("Royal cort hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[2][0]);
                txt3.setText("The price of this room is: " + room[2][0].getPrice());
            } else if (hotname.equals("Melenoem hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[3][0]);
                txt3.setText("The price of this room is: " + room[3][0].getPrice());
            } else if (hotname.equals("Grand park hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[4][0]);
                txt3.setText("The price of this room is: " + room[4][0].getPrice());
            } else if (hotname.equals("Karmel hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0"+"\n" + "Avaiable rooms: " + x[5][0]);
                txt3.setText("The price of this room is: " + room[5][0].getPrice());
            }
            }
        else if (Integer.parseInt(flag) == 1) {
            if (hotname.equals("Merador hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +  "\n" + "Avaiable rooms: " + x[0][1]);
                txt3.setText("The price of this room is: " + room[0][1].getPrice());
            } else if (hotname.equals("Casablanca hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[1][1]);
                txt3.setText("The price of this room is: " + room[1][1].getPrice());
            } else if (hotname.equals("Royal cort hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0"  +"\n"+ "Avaiable rooms: " + x[2][1]);
                txt3.setText("The price of this room is: " + room[2][1].getPrice());
            } else if (hotname.equals("Melenoem hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[3][1]);
                txt3.setText("The price of this room is: " + room[3][1].getPrice());
            } else if (hotname.equals("Grand park hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[4][1]);
                txt3.setText("The price of this room is: " + room[4][1].getPrice());
            } else if (hotname.equals("Karmel hotel")) {
                txt1.setText("Welcome to " + hotname + " hotel");
                txt2.setText("The room number: 0" +"\n"+ "Avaiable rooms: " + x[5][1]);
                txt3.setText("The price of this room is: " + room[5][1].getPrice());
            }
            }
         else{
        if(hotname.equals("Merador hotel")){
        txt1.setText("Welcome to "+hotname+" hotel");
        txt2.setText("The room number: 0"+"\n"+"Avaiable rooms: "+x[0][2]);
        txt3.setText("The price of this room is: "+room[0][2].getPrice());
        }else if(hotname.equals("Casablanca hotel")){
        txt1.setText("Welcome to "+hotname+" hotel");
        txt2.setText("The room number: 0"+"\n"+"Avaiable rooms: "+x[1][2]);
        txt3.setText("The price of this room is: "+room[1][2].getPrice());
        }else if(hotname.equals("Royal cort hotel")){
        txt1.setText("Welcome to "+hotname+" hotel");
        txt2.setText("The room number: 0"+"\n"+"Avaiable rooms: "+x[2][2]);
        txt3.setText("The price of this room is: "+room[2][2].getPrice());
        }else if(hotname.equals("Melenoem hotel")){
        txt1.setText("Welcome to "+hotname+" hotel");
        txt2.setText("The room number: 0"+"\n"+"Avaiable rooms: "+x[3][2]);
        txt3.setText("The price of this room is: "+room[3][2].getPrice());
        }else if(hotname.equals("Grand park hotel")){
        txt1.setText("Welcome to "+hotname+" hotel");
        txt2.setText("The room number: 0"+"\n"+"Avaiable rooms: "+x[4][2]);
        txt3.setText("The price of this room is: "+room[4][2].getPrice());
        }else if(hotname.equals("Karmel hotel")){
        txt1.setText("Welcome to "+hotname+" hotel");
        txt2.setText("The room number: 0"+"\n"+"Avaiable rooms: "+x[5][2]);
        txt3.setText("The price of this room is: "+room[5][2].getPrice());

        }
        }

        }

}
