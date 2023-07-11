package com.example.test;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    private Button login;
    private ImageView google;
    private ImageView gmail;
    private ImageView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user=findViewById(R.id.userName);
        pass=findViewById(R.id.password);
        login=findViewById(R.id.login2);
        google=findViewById(R.id.googlebtn);
        gmail=findViewById(R.id.gmailbtn);
        facebook=findViewById(R.id.facebookbtn);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        login.setOnClickListener(new View.OnClickListener() {

            Intent intent = new Intent(MainActivity.this, RecycleView1.class);
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals("")) {
                    user.setHint("Please Enter The User Name!");
                    user.setHintTextColor(getResources().getColor(R.color.red));


                }
                if (pass.getText().toString().equals("")) {
                    pass.setHint("Please Enter The User Name!");
                    pass.setHintTextColor(getResources().getColor(R.color.red));

                } else if (!user.getText().toString().equals("") && !pass.getText().toString().equals("")) {



                    CollectionReference collectionRef = FirebaseFirestore.getInstance().collection("login");
                    collectionRef.get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                        @Override
                        public void onSuccess(QuerySnapshot querySnapshot) {

                            for (DocumentSnapshot documentSnapshot : querySnapshot) {
                                String documentId = documentSnapshot.getId();

                                String username = documentSnapshot.getString("Username");
                                String password = documentSnapshot.getString("Password");

                                if (user.getText().toString().equals(username)) {
                                    if (pass.getText().toString().equals(password)) {
                                        Intent intent = new Intent(MainActivity.this, RecycleView1.class);
                                        startActivity(intent);
                                        return;
                                    }
                                }
                            }

                            // If the loop completes without finding a match, show an error message
                            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(MainActivity.this);
                            dlgAlert.setMessage("Invalid email or password");
                            dlgAlert.setTitle("Error Message...");
                            dlgAlert.setPositiveButton("OK", null);
                            dlgAlert.setCancelable(true);
                            dlgAlert.create().show();
                        }
                    });

                }

            }

        });

    }
    protected void onResume() {
        super.onResume();
        // Fetching the stored data from the SharedPreference
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("user", "");
        String a = sh.getString("pass", "");

        // Setting the fetched data in the EditTexts
        user.setText(s1);
        pass.setText(a);
    }

    // Store the data in the SharedPreference in the onPause() method
    // When the user closes the application onPause() will be called and data will be stored
    @Override
    protected void onPause() {
        super.onPause();
        // Creating a shared pref object with a file name "MySharedPref" in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        myEdit.putString("user", user.getText().toString());
        myEdit.putString("pass", pass.getText().toString());
        myEdit.apply();
    }


    public void openSignUpActivity(View view) {
        Intent intent=new Intent(this,login.class);
        startActivity(intent);

    }
}