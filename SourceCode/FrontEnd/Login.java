package com.example.boxing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.boxing.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText  editTextEmail, editTextPassword ;
    private Button sign_in, register;
    private ProgressBar bar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sign_in = findViewById(R.id.login);
        sign_in.setOnClickListener(this);

        register = findViewById(R.id.register);
        register.setOnClickListener(this);

        editTextEmail = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.password);

        bar= findViewById(R.id.loginProgressBar);
        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    // two buttons on login page
    public void onClick(View v){
        switch (v.getId()){
            case R.id.login:
                checkSignIn();
                break;
            case R.id.register:
                startActivity(new Intent(Login.this, Register.class));
                break;
        }
    }

    public void checkSignIn(){
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        // check if input validate
        if(email.isEmpty()){
            editTextEmail.setError("Email is required.");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Email is required.");
            editTextPassword.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Please enter valid email.");
            editTextEmail.requestFocus();
            return;
        }

        bar.setVisibility(View.VISIBLE);

        //check fire base if account exist
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Login.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }else {
                    Toast.makeText(Login.this, "Error ! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    bar.setVisibility(View.GONE);
                }

            }
        });

        }

}