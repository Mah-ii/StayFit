package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        button1=findViewById(R.id.under18btn);
        button2=findViewById(R.id.after18btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Before18.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,After18.class);
            }
        });


    }



    public void beforeage18(View view)
    {

        Intent intent=new Intent(MainActivity.this,Before18.class);
        startActivity(intent);



    }

    public void afterage18(View view){


        Intent intent=new Intent(MainActivity.this,After18.class);
        startActivity(intent);



    }

    public void food(View view){


        Intent intent=new Intent(MainActivity.this,NutritionTips.class);
        startActivity(intent);



    }
}