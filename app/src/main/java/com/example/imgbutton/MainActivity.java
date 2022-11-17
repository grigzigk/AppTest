package com.example.imgbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start the code from here
        setTitle("Image Button Function");

        String url1 = "https://www.kastra.eu/pics/serres12.jpg";
        String url2 = "https://foititisonline.gr/wp-content/uploads/2018/03/koilada-serrwn2.jpg";
        String url3 = "https://www.ertnews.gr/wp-content/uploads/2020/11/dioikhthrio-e-vima.jpg";

        TextView CityName = findViewById(R.id.textView);
        ImageView img = findViewById(R.id.imageView);
        ImageButton imgButton1 = findViewById(R.id.imageButton);
        ImageButton imgButton2 = findViewById(R.id.imageButton2);
        ImageButton imgButton3 = findViewById(R.id.imageButton3);
        Button btn =findViewById(R.id.button);


        CityName.setText("City name: "+"Serres");
        //Picasso.with(this).load(url1).resize(600,300).into(img);
        Picasso.with(this).load(url1).resize(200,100).into(imgButton1);
        Picasso.with(this).load(url2).resize(200,100).into(imgButton2);
        Picasso.with(this).load(url3).resize(200,100).into(imgButton3);

        //-----------------------------------
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(getApplicationContext()).load(url1).resize(600,300).into(img);
            }
        });

        //-----------------------------------
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(getApplicationContext()).load(url2).resize(600,300).into(img);
            }
        });

        //------------------------------------
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(MainActivity.this).load(url3).resize(600,300).into(img);
            }
        });


    }
}