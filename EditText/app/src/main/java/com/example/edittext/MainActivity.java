package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edittext1;
    private EditText edittext2;
    private Button addButton,subButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1=findViewById(R.id.EditText1);
        edittext2=findViewById(R.id.EditText2);

        addButton=findViewById(R.id.addButtonId);
        subButton=findViewById(R.id.subButtonId);
        resultTextView=findViewById(R.id.resultTextView);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
    try {
    String num1= edittext1.getText().toString();
    String num2= edittext2.getText().toString();
    double number1=Double.parseDouble(num1);
    double number2=Double.parseDouble(num2);

    if (view.getId()==R.id.addButtonId){
        double sum=number1+number2;
        resultTextView.setText("Result is:"+sum);
    } if (view.getId()==R.id.subButtonId){
        double sub=number1-number2;
        resultTextView.setText("Result is:"+sub);
    }
}catch (Exception e){
        Toast.makeText(MainActivity.this,"Please Enter Number",Toast.LENGTH_SHORT).show();
}

    }
}