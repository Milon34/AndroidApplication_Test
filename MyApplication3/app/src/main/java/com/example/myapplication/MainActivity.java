package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckbox,sugarCheckBox,waterCheckBox;
    private Button showButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkCheckbox=findViewById(R.id.milkCheck);
        sugarCheckBox=findViewById(R.id.sugarCheck);
        waterCheckBox=findViewById(R.id.waterCheck);
        showButton=findViewById(R.id.showButtonid);
        resultTextView=findViewById(R.id.resultText);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder=new StringBuilder();
                if (milkCheckbox.isChecked()){
                    String value=milkCheckbox.getText().toString();
                    stringBuilder.append(value+" Is Ordered \n");
                } if (sugarCheckBox.isChecked()){
                    String value=sugarCheckBox.getText().toString();
                    stringBuilder.append(value+" Is Ordered \n");
                } if (waterCheckBox.isChecked()){
                    String value=waterCheckBox.getText().toString();
                    stringBuilder.append(value+" Is Ordered ");
                }
                resultTextView.setText(stringBuilder);
            }
        });


    }
}