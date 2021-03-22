package com.example.boxing;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.boxing.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText  editTextEmail, editTextPassword ;
    private Button sign_in, register, connect;
    private ProgressBar bar;
    private FirebaseAuth mAuth;

    private String deviceName = null;
    private String deviceAddress;
    public static Handler handler;
    public static BluetoothSocket mmSocket;
    /*
    public static ConnectedThread connectedThread;
    public static CreateConnectThread createConnectThread;
     */

    private final static int CONNECTING_STATUS = 1;
    private final static int MESSAGE_READ = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*
        final Button buttonConnect = findViewById(R.id.buttonConnect);

        final Toolbar toolbar = findViewById(R.id.toolbar);

        deviceName = getIntent().getStringExtra("deviceName");
        if(deviceName != null) {
            deviceAdress = getIntent().getStringExtra("deviceAddress");
            toolbar.setSubtitle("Connecting to " + deviceName + "...");
            buttonConnect.setEnabled(false);

            BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            createConnectThread = new CreateConnectThread(bluetoothAdapter, deviceAddress);
            createConnectThread.start();
            */
        sign_in = findViewById(R.id.login);
        sign_in.setOnClickListener(this);

        register = findViewById(R.id.register);
        register.setOnClickListener(this);

        connect = (Button) findViewById(R.id.button);
        connect.setOnClickListener(this);



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
            case R.id.button:
                startActivity(new Intent(Login.this, SelectDeviceActivity.class));
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
