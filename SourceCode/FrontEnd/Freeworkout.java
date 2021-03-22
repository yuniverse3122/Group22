package com.example.boxing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Freeworkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeworkout);
    }
    
     @Override
    public void onclick(View v){
      WorkoutData data = new Workout(System.currentTimeMillis());
      switch (v.getID()){
        case R.id.Beginner:
        data.workoutType = "Beginner Free Workout";
        break;
        case R.id.Intermediate:
        data.workoutType = "Intermediate Free Workout";
        break;
        case R.id.Advanced:
        data.workoutType = "Advanced Free Workout";
        break;
      }
}
