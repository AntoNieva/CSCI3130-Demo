package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
public class MainActivity extends AppCompatActivity {
   EditText editText;
   TextView text;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= findViewById(R.id.viewAntoNieva);
        button= findViewById(R.id.btnAntoNieva);
        editText=findViewById(R.id.txtAntoNieva);
        button.setOnClickListener(new View.OnClickListener(){
     @Override
            public void onClick(View view){
         String str=editText.getText().toString();

             text.setText(str);
     }
        });
    }
}
