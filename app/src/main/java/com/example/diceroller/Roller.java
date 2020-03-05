package com.example.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Roller extends MainActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ImageView diceone = (ImageView) findViewById(R.id.imageView);
        diceone.setImageResource(R.drawable.question);

        ImageView dicetwo = (ImageView) findViewById(R.id.imageView2);
        dicetwo.setImageResource(R.drawable.question);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = getDiceOne(1,6) + getDiceTwo(1,6);
                int total2 = (int)total;
                Total = (TextView) findViewById(R.id.Total);
                Total.setText(String.valueOf(total2));
            }
        });

    }
}
