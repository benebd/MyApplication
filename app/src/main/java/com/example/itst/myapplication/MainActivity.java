package com.example.itst.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText text1 =findViewById(R.id.iMake);
        final EditText text2 = findViewById(R.id.iYear);
        final Button button = findViewById(R.id.submitbtn);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context =getApplicationContext();
                Toast.makeText(context,"Your car is a"+" "+text1.getText()+"built in" +
                        " "+text2.getText(),Toast.LENGTH_SHORT).show();

            }
        });




    }
}
