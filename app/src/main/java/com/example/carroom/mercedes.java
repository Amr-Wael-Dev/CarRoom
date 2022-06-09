package com.example.carroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mercedes extends AppCompatActivity
{
    ImageView back3;
    ImageView mercedes1 , mercedes2 , mercedes3 , mercedes4;
    AlertDialog.Builder alert , alert2 , alert3 , alert4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercedes);

        back3=findViewById(R.id.imageView15);

        mercedes1=findViewById(R.id.imageView17);
        mercedes2=findViewById(R.id.imageView18);
        mercedes3=findViewById(R.id.imageView19);
        mercedes4=findViewById(R.id.imageView20);

        alert =new  AlertDialog.Builder(mercedes.this);
        alert2=new AlertDialog.Builder(mercedes.this);
        alert3=new AlertDialog.Builder(mercedes.this);
        alert4=new AlertDialog.Builder(mercedes.this);



        alert.setTitle("Mercedes A 180");
        alert.setMessage(
                "Engine capacity : 1300 CC\n" +
                        "Horse Power : 136\n" +
                        "Maximum Speed : 205\n" +
                        "Wheel Base : 2729\n" +
                        "Fuel tank capacity : 43\n" +
                        "Origin country : Germany\n");
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert2.setTitle("Mercedes B 180");
        alert2.setMessage(
                "Engine capacity : 1300 CC\n" +
                        "Horse Power : 136\n" +
                        "Maximum Speed : 212\n" +
                        "Wheel Base : 2729\n" +
                        "Fuel tank capacity : 43\n" +
                        "Origin country : Germany\n");
        alert2.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert3.setTitle("Mercedes CLA 180");
        alert3.setMessage(
                "Engine capacity : 1300 CC\n" +
                        "Horse Power : 136\n" +
                        "Maximum Speed : 216\n" +
                        "Wheel Base : 2729\n" +
                        "Fuel tank capacity : 43\n" +
                        "Origin country : Germany\n");
        alert3.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert4.setTitle("Mercedes C 300");
        alert4.setMessage(
                "Engine capacity : 2000 CC\n" +
                        "Horse Power : 258\n" +
                        "Maximum Speed : 250\n" +
                        "Wheel Base : 2840\n" +
                        "Fuel tank capacity : 60\n" +
                        "Origin country : Germany\n");
        alert4.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });




        mercedes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert.create();
                alert1.show();
            }
        });
        mercedes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert2.create();
                alert1.show();

            }
        });
        mercedes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert3.create();
                alert1.show();

            }
        });
        mercedes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert4.create();
                alert1.show();

            }
        });





        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(mercedes.this,car_types.class));

            }
        });
    }
}