package com.example.eggapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

             counter = 10;
             TextView counterTextView = findViewById(R.id.textview_counter);
             counterTextView.setText(""+counter);
        }

    public void knock(View view) {
        if(counter>0){
            counter--;
            TextView counterTextView = findViewById(R.id.textview_counter);
            counterTextView.setText(""+counter);
            if(counter ==0){
                ImageView eggImageView = findViewById(R.id.imageview_egg);
                eggImageView.setImageResource(R.drawable.rickandmortyimage);
            }
        }
    }

    public void reset(View view) {
        counter=10;
        TextView counterTextView = findViewById(R.id.textview_counter);
        counterTextView.setText(""+counter);
        ImageView eggImageView = findViewById(R.id.imageview_egg);
        eggImageView.setImageResource(R.drawable.redeggimage);
    }

}
