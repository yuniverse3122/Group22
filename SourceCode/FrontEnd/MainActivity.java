package com.example.boxing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signOut;
    private Button history, preSelectedWorkout,freeMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signOut = findViewById(R.id.SignOut);
        history = findViewById(R.id.History);
        preSelectedWorkout = findViewById(R.id.Pre_selected);
        freeMode = findViewById(R.id.Free_Mode);

        history.setOnClickListener(this);
        signOut.setOnClickListener(this);
        preSelectedWorkout.setOnClickListener(this);
        freeMode.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.SignOut:
                FirebaseAuth.getInstance().signOut();//logout
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
                break;
            case R.id.Pre_selected:
                startActivity(new Intent(MainActivity.this, Preselect_workout.class));
                break;
            case R.id.Free_Mode:
                startActivity(new Intent(MainActivity.this, Freeworkout.class));
                break;
            case R.id.History:
                startActivity(new Intent(MainActivity.this, History.class));
                break;
        }
    }
}