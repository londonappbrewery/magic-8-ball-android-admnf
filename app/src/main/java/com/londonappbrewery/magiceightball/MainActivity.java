package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final TextView resultDisplay = (TextView) findViewById(R.id.textView2);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final String[] resultArray = new String[] {
                "Hahaha, no luck today",
                "Wake Up! Stop believing!",
                "Yeah, you got it!",
                "..."
        };

        Button myButton = (Button) findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);

                if(number == 1) {
                    resultDisplay.setText(resultArray[0]);
                }
                else if(number == 0) {
                    resultDisplay.setText(resultArray[1]);
                }
                else if(number == 4 && number == 2) {
                    resultDisplay.setText(resultArray[2]);
                }
                else
                    resultDisplay.setText(resultArray[3]);

            }
        });
    }
}
