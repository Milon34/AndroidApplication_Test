package com.example.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton, logoutButton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = findViewById(R.id.loginButtonId);
        logoutButton = findViewById(R.id.logoutButtonId);
        textView = findViewById(R.id.textViewId);


    }
public void showMessage(View v){
        if (v.getId()==R.id.loginButtonId){

            Log.v("tag","Login Button is Clicked");
        }
        else if (v.getId()==R.id.logoutButtonId){

            Log.d("tag","Logout Button is Clicked");
        }

}

}
//        Handler handler=new Handler();
//
//
//        loginButton.setOnClickListener(handler);
//        logoutButton.setOnClickListener(handler);



//        loginButton.setOnClickListener(this);
//        logoutButton.setOnClickListener(this);

//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                textView.setText("Login Button is Clicked..");
//            }
//        });
//        logoutButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView.setText("Logout Button Is Clicked...");
//            }
//        });


//    @Override
//    public void onClick(View view) {
//        if (view.getId()==R.id.loginButtonId){
//            textView.setText("Login Button is Clicked...");
//        }
//        else  {
//            textView.setText("Logout Button is Clicked...");
//        }
//
//    }
