package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView Total;
    public Button button;
    public ImageView imageView;
    public ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public static double getDiceOne(double min, double max){
        double diceOne = (int)(Math.random()*((max-min)+1)) + min;
        return diceOne;
    }

    public static double getDiceTwo(double min, double max){
        double diceTwo = (int)(Math.random()*((max-min) +1)) + min;
        return diceTwo;
    }

    public void rollDice(View view) {
       double total = getDiceOne(1,6) + getDiceTwo(1,6);
       Total = (TextView) findViewById(R.id.Total);
       int total2 = (int)total;
       Total.setText(String.valueOf(total2));

    }

    public void rollDice2 (View view){
        ImageView diceone = (ImageView) findViewById(R.id.imageView);
        ImageView dicetwo = (ImageView) findViewById(R.id.imageView2);

        double d1 = getDiceOne(1,6);
        int d11 = (int)d1;
        double d2 = getDiceOne(1,6);
        int d21 = (int)d2;
        int total = d11 + d21;

        Total = (TextView) findViewById(R.id.Total);
        Total.setText(String.valueOf(total));

        if (d21 == 1){
            dicetwo.setImageResource(R.drawable.one);
        };
        if (d21 == 2){
            dicetwo.setImageResource(R.drawable.two);
        };
        if (d21 == 3){
            dicetwo.setImageResource(R.drawable.three);
        };
        if (d21 == 4){
            dicetwo.setImageResource(R.drawable.four);
        };
        if (d21 == 5){
            dicetwo.setImageResource(R.drawable.five);
        };
        if (d21 == 6){
            dicetwo.setImageResource(R.drawable.six);
        };
        if (d11 == 1){
            diceone.setImageResource(R.drawable.one);
        };
        if (d11 == 2){
            diceone.setImageResource(R.drawable.two);
        };
        if (d11 == 3){
            diceone.setImageResource(R.drawable.three);
        };
        if (d11 == 4){
            diceone.setImageResource(R.drawable.four);
        };
        if (d11 == 5){
            diceone.setImageResource(R.drawable.five);
        };
        if (d11 == 6){
            diceone.setImageResource(R.drawable.six);
        };

    }

}
