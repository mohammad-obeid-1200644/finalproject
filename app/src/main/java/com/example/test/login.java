package com.example.test;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {

    private EditText userName;
    private EditText pass;
    private EditText passver;
    private EditText email;
    private Button showhide;
    private Button login;
    private int flag=0;
    private static int counter=0;
    private FirebaseFirestore database = FirebaseFirestore.getInstance();

    private FirebaseFirestore databasein = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName=findViewById(R.id.userName2);
        pass=findViewById(R.id.pass);
        passver=findViewById(R.id.passver);
        email=findViewById(R.id.email);
        showhide=findViewById(R.id.showhideid);
        login=findViewById(R.id.btnsign);

    }

    public void btnOnCLick(View view) {

        databasein.collection("login")
                .add(new User(userName.getText().toString(), email.getText().toString(), pass.getText().toString()));

        String name=userName.getText().toString();
        String email2=email.getText().toString();
        String password=pass.getText().toString();
        String pass2=passver.getText().toString();
        if(!password.equals(pass2)){
            pass.setText("");
            passver.setText("");
            Toast.makeText(login.this,"Password is different",Toast.LENGTH_SHORT
            ).show();
        }
        if(userName.getText().toString().equals("")){
            userName.setHint("Please Enter The User Name!");
            userName.setHintTextColor(getResources().getColor(R.color.red));
        }
        if(email.getText().toString().equals("")){
            email.setHint("Please Enter The User Email!");
            email.setHintTextColor(getResources().getColor(R.color.red));
        }
        if(pass.getText().toString().equals("")){
            pass.setHint("Please Enter The User Password!");
            pass.setHintTextColor(getResources().getColor(R.color.red));
        }
        if(passver.getText().toString().equals("")){
            passver.setHint("Please Repeat The Password");
            passver.setHintTextColor(getResources().getColor(R.color.red));
        }


        if(password.equals(pass2) && !userName.getText().toString().equals("") && !email.getText().toString().equals("")
                && !pass.getText().toString().equals("") && !passver.getText().toString().equals("")) {
            Map<String, String> map = new HashMap<>();

            map.put("Username", name);
            map.put("Password", password + "");
            map.put("Email", email2);


            database.collection("login")
                    .document(counter + "")
                    .set(map)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(login.this,
                                    "Data Added Successfully!", Toast.LENGTH_SHORT
                            ).show();
                            counter++;
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(login.this,
                                    "Error Adding !", Toast.LENGTH_SHORT
                            ).show();
                            Log.d("Mainac", e.toString());
                        }
                    });


            Intent intent = new Intent(getBaseContext(), RecycleView1.class);
            startActivity(intent);
        }

    }

    public void backOnCLick(View view) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }

    public void showhide(View view) {
        if (flag == 0) {
            showhide.setBackground(getResources().getDrawable(R.drawable.view));
            flag = 1;
            pass.setInputType(InputType.TYPE_CLASS_TEXT);
            passver.setInputType(InputType.TYPE_CLASS_TEXT);

        } else if (flag == 1){
            showhide.setBackground(getResources().getDrawable(R.drawable.hide));
            pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            passver.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            flag = 0;
    }
    }
}