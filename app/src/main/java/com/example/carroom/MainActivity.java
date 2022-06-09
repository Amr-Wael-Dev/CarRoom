package com.example.carroom;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carroom.Home;
import com.example.carroom.R;
import com.example.carroom.SignUp;
import com.example.carroom.User;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    TextView signupLink;
    EditText inputEmail;
    EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.login_button);
        signupLink = findViewById(R.id.signup_link);
        inputEmail = findViewById(R.id.login_email);
        inputPassword = findViewById(R.id.login_password);

        loginBtn.setOnClickListener(view -> {
            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();

            if (email.trim().length() != 0 && password.trim().length() != 0) {
                DBUser db = new DBUser(this, null);
                User user = new User("", email.trim(), password.trim(), false);

                if (db.get(user) != null) {
                    Intent intent = new Intent(this, Home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "E-mail or Password Incorrect", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        });

        signupLink.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignUp.class);
            startActivity(intent);
        });
    }
}