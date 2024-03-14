package com.example.lab5_6_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
    }
    public void btnNext(View view)
    {
        Intent intent;
        if(ActivityHandler.currentId<ActivityHandler.nrActivities) {
            intent = new Intent(getApplicationContext(), ActivityHandler.ids[++ActivityHandler.currentId]);
            startActivity(intent);
        }
        else {}
        System.out.println(ActivityHandler.currentId);
    }

    public void btnBack(View view) {
        Intent intent;
        if(ActivityHandler.currentId>0) {
            intent = new Intent(this, ActivityHandler.ids[--ActivityHandler.currentId]);
            startActivity(intent);
        }
        System.out.println(ActivityHandler.currentId);
    }
}
