package com.example.carroom;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carroom.Home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    Button signupBtn;
    TextView loginLink;
    EditText inputName;
    EditText inputEmail;
    EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signupBtn = findViewById(R.id.signup_button);
        loginLink = findViewById(R.id.login_link);
        inputName = findViewById(R.id.signup_name);
        inputEmail = findViewById(R.id.signup_email);
        inputPassword = findViewById(R.id.signup_password);

        signupBtn.setOnClickListener(view -> {
            String name = inputName.getText().toString();
            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();

            if (emailValid(email.trim()) && name.trim().length() != 0 && password.trim().length() != 0) {
                DBUser db = new DBUser(this, null);
                User user = new User(name.trim(), email.trim(), password.trim(), true);

                if (db.add(user)) {
                    Intent intent = new Intent(this, Home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "This user already exists", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
            }
        });

        loginLink.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }

    private static boolean emailValid(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}