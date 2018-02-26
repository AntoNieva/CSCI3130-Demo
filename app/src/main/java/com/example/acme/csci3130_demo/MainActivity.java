package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   EditText oldPass;
   EditText newPass;
   TextView name;
   TextView info1;
   TextView state1;
   TextView state2;
   TextView state3;
   TextView pass1;
   TextView pass2;
   Button state;
   Button info;
   Button pass;
   Button modify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        state= findViewById(R.id.state);
        info= findViewById(R.id.info);
        pass= findViewById(R.id.pass);
        modify= findViewById(R.id.confirm);
        name=findViewById(R.id.viewAntoNieva);
        info1=findViewById(R.id.textView);
        state1=findViewById(R.id.textView2);
        state2=findViewById(R.id.textView3);
        state3=findViewById(R.id.textView4);
        pass1=findViewById(R.id.textView5);
        pass2=findViewById(R.id.textView6);
        oldPass=findViewById(R.id.editText2);
        newPass=findViewById(R.id.editText3);
    }
    public void menonClick(View v){
        switch (v.getId()){
            case R.id.info:{
                state1.setVisibility(View.INVISIBLE);
                state2.setVisibility(View.INVISIBLE);
                state3.setVisibility(View.INVISIBLE);
                pass1.setVisibility(View.INVISIBLE);
                pass2.setVisibility(View.INVISIBLE);
                modify.setVisibility(View.INVISIBLE);
                info1.setVisibility(View.VISIBLE);
                oldPass.setVisibility(View.INVISIBLE);
                newPass.setVisibility(View.INVISIBLE);
                modify.setVisibility((View.INVISIBLE));
                break;
            }
            case R.id.state:{

                info1.setVisibility(View.INVISIBLE);
                state1.setVisibility(View.VISIBLE);
                state2.setVisibility(View.VISIBLE);
                state3.setVisibility(View.VISIBLE);
                pass1.setVisibility(View.INVISIBLE);
                pass2.setVisibility(View.INVISIBLE);
                oldPass.setVisibility(View.INVISIBLE);
                newPass.setVisibility(View.INVISIBLE);
                modify.setVisibility((View.INVISIBLE));
                break;
            }
            case R.id.pass:{
                info1.setVisibility(View.INVISIBLE);
                state1.setVisibility(View.INVISIBLE);
                state2.setVisibility(View.INVISIBLE);
                state3.setVisibility(View.INVISIBLE);
                pass1.setVisibility(View.VISIBLE);
                pass2.setVisibility(View.VISIBLE);
                oldPass.setVisibility(View.VISIBLE);
                newPass.setVisibility(View.VISIBLE);
                modify.setVisibility((View.VISIBLE));
                break;
            }
            default:
                break;
        }
    }
       // text= findViewById(R.id.viewAntoNieva);
        //button= findViewById(R.id.btnAntoNieva);
       // editText=findViewById(R.id.txtAntoNieva);
       // button.setOnClickListener(new View.OnClickListener(){
     //@Override
            //public void onClick(View view){
         //String str=editText.getText().toString();

             //text.setText(str);

       // });
    }
//}
