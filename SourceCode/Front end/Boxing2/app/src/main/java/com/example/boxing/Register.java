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
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;
    private Button finishRegister;
    private EditText RegisterEmail,RegisterPassword, RegisterConfirmPassword;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        RegisterEmail =findViewById(R.id.editTextTextEmail);
        RegisterPassword = findViewById(R.id.editTextTextPassword);
        RegisterConfirmPassword= findViewById(R.id.editTextTextPassword2);
        progressBar = findViewById(R.id.progressBar);
        finishRegister = findViewById(R.id.signUp);
        finishRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkRegister();
            }
        });



    }


    // check all input validate: all field should be filled,
    // two password should match
    // password should be at least 8 characters long
    public void checkRegister(){
        String email = RegisterEmail .getText().toString().trim();
        String password = RegisterPassword.getText().toString().trim();
        String confirmPassword = RegisterConfirmPassword.getText().toString().trim();

        if(email.isEmpty()){
            RegisterEmail.setError("Please enter email.");
            RegisterEmail.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            RegisterEmail.setError("Please enter valid email.");
            RegisterEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            RegisterPassword.setError("Please enter password.");
            RegisterPassword.requestFocus();
            return;
        }
        if(password.length() < 8){
            RegisterPassword.setError("Minimum password required 8 characters long.");
            RegisterPassword.requestFocus();
            return;
        }

        if(confirmPassword.isEmpty()){
            RegisterConfirmPassword.setError("Please enter confirm password.");
            RegisterConfirmPassword.requestFocus();
            return;
        }


        if(!password.equals(confirmPassword)){
            RegisterConfirmPassword.setError("Password is not matched.");
            RegisterConfirmPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(
                new OnCompleteListener <AuthResult> (){

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    User user = new User(email,password);

                    FirebaseDatabase.getInstance().getReference("Users").
                            child(FirebaseAuth.getInstance().getCurrentUser().getUid()).
                            setValue(user).addOnCompleteListener(new OnCompleteListener<Void>(){

                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                 Toast.makeText(com.example.boxing.Register.this, "User has been successfully registered.",Toast.LENGTH_LONG).show();
                                 progressBar.setVisibility(View.VISIBLE);
                                 startActivity(new Intent(com.example.boxing.Register.this, Login.class));
                                 finish();
                            }
                            else
                            {
                                Toast.makeText(com.example.boxing.Register.this, "User fail to register. Try again!",Toast.LENGTH_LONG).show();
                                progressBar.setVisibility(View.GONE);
                            }
                        }
                    });
                }
                else{

                        Toast.makeText(com.example.boxing.Register.this, "User fail to register. Try again!",Toast.LENGTH_LONG).show();
                        progressBar.setVisibility(View.GONE);

                }
            }
        });


    }


}