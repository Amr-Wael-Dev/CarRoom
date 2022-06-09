package com.example.carroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class kia extends AppCompatActivity
{
    ImageView back2;
    ImageView kia1 , kia2 , kia3 , kia4;
    AlertDialog.Builder alert , alert2 , alert3 , alert4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kia);

        back2=findViewById(R.id.imageView16);
        kia1=findViewById(R.id.imageView21);
        kia2=findViewById(R.id.imageView22);
        kia3=findViewById(R.id.imageView23);
        kia4=findViewById(R.id.imageView24);

        alert=new AlertDialog.Builder(kia.this);
        alert2=new AlertDialog.Builder(kia.this);
        alert3=new AlertDialog.Builder(kia.this);
        alert4=new AlertDialog.Builder(kia.this);


        alert.setTitle("The kia Grand Cerato");
        alert.setMessage(
                "Engine capacity : 1600 CC\n" +
                        "Horse Power : 130\n" +
                        "Maximum Speed : 190\n" +
                        "Wheel Base : 2700\n" +
                        "Fuel tank capacity : 50\n" +
                        "Origin Country : Korea\n");
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert2.setTitle("The kia Grand Cerato Hl");
        alert2.setMessage(
                "Engine capacity : 1600 CC\n" +
                        "Horse Power : 130\n" +
                        "Maximum Speed : 190\n" +
                        "Wheel Base : 2700\n" +
                        "Fuel tank capacity : 50\n" +
                        "Origin Country : Korea\n");
        alert2.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert3.setTitle("Kia soul");
        alert3.setMessage(
                "Engine capacity : 1400 CC\n" +
                        "Horse Power : 95\n" +
                        "Maximum Speed : 180\n" +
                        "Wheel Base : 2570\n" +
                        "Fuel tank capacity : 43\n" +
                        "Origin Country : Korea\n");
        alert3.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        alert4.setTitle("Kia Rio");
        alert4.setMessage(
                "Engine capacity : 1600 CC\n" +
                        "Horse Power : 123\n" +
                        "Maximum Speed : 188\n" +
                        "Wheel Base : 2580\n" +
                        "Fuel tank capacity : 92\n" +
                        "Origin Country : Mexico\n");
        alert4.setPositiveButton("ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });



        kia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert.create();
                alert1.show();
            }
        });
        kia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert2.create();
                alert1.show();

            }
        });
        kia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert3.create();
                alert1.show();

            }
        });
        kia4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                AlertDialog alert1= alert4.create();
                alert1.show();

            }
        });




        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(kia.this,car_types.class));

            }
        });
    }
}