package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Before18 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before18);

        //  Toolbar toolbar = findViewById(R.id.toolbar);
        // setActionBar(toolbar);

        newArray = new int[]{
                R.id.mountain_pose, R.id.crunch_pose, R.id.plank_pose, R.id.plank_leg_pose, R.id.russian_pose, R.id.sit_pose,
                R.id.up_pose


        };


    }


    public void ImageBtn(View view) {

        for (int i = 0; i < newArray.length; i++) {
            int value = i + 1;
            Log.i("FIRST", String.valueOf(value));
            Intent intent = new Intent(Before18.this, Details.class);
            intent.putExtra("value", String.valueOf(value));
            startActivity(intent);
        }


    }

}