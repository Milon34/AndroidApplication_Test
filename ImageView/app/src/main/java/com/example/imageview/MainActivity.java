package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView1id,imageView2id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1id=findViewById(R.id.ImageView1Id);
        imageView2id=findViewById(R.id.ImageView2Id);
        imageView1id.setOnClickListener(this);
        imageView2id.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.ImageView1Id){
            Toast.makeText(MainActivity.this,"All Student",Toast.LENGTH_SHORT).show();
        }else if (view.getId()==R.id.ImageView2Id){
            Toast.makeText(MainActivity.this,"Yes Girls and Boys All Student",Toast.LENGTH_SHORT).show();
        }
    }
}