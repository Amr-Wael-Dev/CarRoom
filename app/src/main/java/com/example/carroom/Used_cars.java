package com.example.carroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Used_cars extends AppCompatActivity
{
    ImageView back5;
    ImageView used1 , used2 , used3 , used4 , used5 , used6 ;
    AlertDialog.Builder alert , alert2 , alert3 , alert4 ,  alert5 , alert6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_used_cars);



        used1=findViewById(R.id.imageView31);
        used2=findViewById(R.id.imageView32);
        used3=findViewById(R.id.imageView33);
        used4=findViewById(R.id.imageView34);
        used5=findViewById(R.id.imageView35);
        used6=findViewById(R.id.imageView36);

        alert =new AlertDialog.Builder(Used_cars.this);
        alert2=new AlertDialog.Builder(Used_cars.this);
        alert3=new AlertDialog.Builder(Used_cars.this);
        alert4=new AlertDialog.Builder(Used_cars.this);
        alert5=new AlertDialog.Builder(Used_cars.this);
        alert6=new AlertDialog.Builder(Used_cars.this);



        alert.setTitle("Mercedes C 180");
        alert.setMessage(
                "Engine capacity : 1500 CC\n" +
                        "Horse Power : 156\n" +
                        "Maximum Speed : 225\n" +
                        "Seats : 5\n" +
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

        alert2.setTitle("Mercedes GLA");
        alert2.setMessage(
                "Engine capacity : 1400 CC\n" +
                        "Horse Power : 163\n" +
                        "Maximum Speed : 210\n" +
                        "Seats : 5\n" +
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

        alert3.setTitle("Kia Sportage");
        alert3.setMessage(
                "Engine capacity : 1600 CC\n" +
                        "Horse Power : 140\n" +
                        "Maximum Speed : 180\n" +
                        "Seats : 5\n" +
                        "Fuel tank capacity : 62\n" +
                        "Origin country : Korea\n");
        alert3.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert4.setTitle("Fiat Tipo");
        alert4.setMessage(
                "Engine capacity : 1600 CC\n" +
                        "Horse Power : 110\n" +
                        "Maximum Speed : 192\n" +
                        "Seats : 5\n" +
                        "Fuel tank capacity : 45\n" +
                        "Origin country : Italy\n");
        alert4.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert5.setTitle("Fiat 500");
        alert5.setMessage(
                "Engine capacity : 1400 CC\n" +
                        "Horse Power : 100\n" +
                        "Maximum Speed : 182\n" +
                        "Seats : 4\n" +
                        "Fuel tank capacity : 35\n" +
                        "Origin country : Italy\n");
        alert5.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert6.setTitle("Nissan sunny");
        alert6.setMessage(
                "Engine capacity : 1500 CC\n" +
                        "\n" +
                        "Horse Power : 108\n" +
                        "Maximum Speed : 180\n" +
                        "Seats : 5\n" +
                        "Fuel tank capacity : 41\n" +
                        "Origin country : Japan\n");
        alert6.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });


        used1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert.create();
                alert1.show();
            }
        });
        used2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert2.create();
                alert1.show();

            }
        });
        used3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert3.create();
                alert1.show();

            }
        });
        used4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert4.create();
                alert1.show();

            }
        });
        used5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert5.create();
                alert1.show();

            }
        });
        used6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert6.create();
                alert1.show();

            }
        });



        back5=findViewById(R.id.imageView30);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Used_cars.this,Home.class));

            }
        });
    }
}