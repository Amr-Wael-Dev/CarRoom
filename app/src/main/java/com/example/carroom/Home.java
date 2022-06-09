package com.example.carroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity
{
    ImageView  new_button , used_button , contact_button , about_button ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new_button=findViewById(R.id.imageView5) ;
        used_button =findViewById(R.id.imageView3) ;
        contact_button =findViewById(R.id.imageView6) ;
        about_button=findViewById(R.id.imageView7) ;

        new_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Home.this,car_types.class));
            }
        });
        used_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Home.this,Used_cars.class));

            }
        });
        contact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Home.this,contact_us.class));

            }
        });
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Home.this,About.class));

            }
        });

    }
}