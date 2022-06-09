package com.example.carroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class car_types extends AppCompatActivity
{
ImageView kia_button , merceeds_button ,toyota_button , back1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_types);

        kia_button=findViewById(R.id.imageView9);
        merceeds_button=findViewById(R.id.imageView10);
        toyota_button=findViewById(R.id.imageView11);
        back1=findViewById(R.id.imageView2);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(car_types.this,Home.class));

            }
        });

        kia_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(car_types.this,kia.class));
            }
        });
        merceeds_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(car_types.this,mercedes.class));

            }
        });
        toyota_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(car_types.this,toyota.class));

            }
        });

    }
}