package com.example.carroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class toyota extends AppCompatActivity
{
    ImageView back4;
    ImageView toyota1 , toyota2 , toyota3 , toyota4;
    AlertDialog.Builder alert , alert2 , alert3 , alert4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota);

        toyota1=findViewById(R.id.imageView26);
        toyota2=findViewById(R.id.imageView27);
        toyota3=findViewById(R.id.imageView28);
        toyota4=findViewById(R.id.imageView29);

        alert =new AlertDialog.Builder(toyota.this);
        alert2=new AlertDialog.Builder(toyota.this);
        alert3=new AlertDialog.Builder(toyota.this);
        alert4=new AlertDialog.Builder(toyota.this);

        alert.setTitle("Toyota Land Cruiser");
        alert.setMessage(
                "Engine capacity : 3500 CC\n" +
                        "Horse Power : 409\n" +
                        "Maximum Speed : 230\n" +
                        "Seats: 7\n" +
                        "Fuel tank capacity : 110\n" +
                        "Origin country : Japan\n");
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert2.setTitle("Toyota Prado");
        alert2.setMessage(
                "Engine capacity : 2700 CC\n" +
                        "Horse Power : 163\n" +
                        "Maximum Speed : 175\n" +
                        "Seats: 7\n" +
                        "Fuel tank capacity : 150\n" +
                        "Origin country : Japan\n");
        alert2.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert3.setTitle("Toyota Camry");
        alert3.setMessage(
                "Engine capacity : 2500 CC\n" +
                        "Horse Power : 178\n" +
                        "Maximum Speed : 183\n" +
                        "Seats: 5\n" +
                        "Fuel tank capacity : 60\n" +
                        "Origin country : Japan\n");
        alert3.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert4.setTitle("Toyota Fortuner");
        alert4.setMessage(
                "Engine capacity : 2700 CC\n" +
                        "Horse Power : 163\n" +
                        "Maximum Speed : 176\n" +
                        "Seats: 7\n" +
                        "Fuel tank capacity : 80\n" +
                        "Origin country : Japan\n");
        alert4.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });




        toyota1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert.create();
                alert1.show();
            }
        });
        toyota2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert2.create();
                alert1.show();

            }
        });
        toyota3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert3.create();
                alert1.show();

            }
        });
        toyota4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert4.create();
                alert1.show();

            }
        });



        back4=findViewById(R.id.imageView25);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(toyota.this,car_types.class));

            }
        });
    }
}