package com.example.misikirmehari.image_and_graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Paint paint = new Paint();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final ImageView circleview = (ImageView)findViewById(R.id.circleview);

        circleview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = (int) Math.random()*100;
                float radius = 300;
                Bitmap bitmap = Bitmap.createBitmap(750,750,Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas (bitmap);
                paint.setColor(Color.rgb(i,i,i));

                canvas.drawCircle(bitmap.getWidth()/2, bitmap.getHeight()/2,radius, paint);
                circleview.setImageBitmap(bitmap);

                //  paint.setColor(Color.rgb(12,12,12));
                // paint.setStyle(Paint.Style.FILL_AND_STROKE);
                Log.i("test","test");

            }
        });








       // paint.setColor(Color.BLACK);
        //paint.setStyle(Paint.Style.FILL_AND_STROKE);



    }
    }