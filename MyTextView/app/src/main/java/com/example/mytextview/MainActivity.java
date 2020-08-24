package com.example.mytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView=(TextView)findViewById(R.id.nameTextId);
        ageTextView=(TextView)findViewById(R.id.ageTextAge);
        nameTextView.setText("milon");
        ageTextView.setText("20 Years old");
    }
}