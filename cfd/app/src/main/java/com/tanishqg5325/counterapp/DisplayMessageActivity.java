package com.tanishqg5325.counterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
      //  int bo = Integer.parseInt(intent.getStringExtra(MainActivity.EXTRA_MESSAGE2));
        if(message.equals("Player 1 wins")){
            ImageView layout = (ImageView) findViewById(R.id.imageView2);
            layout.setBackgroundResource(R.mipmap.plus);
        }
        else{
            ImageView layout = (ImageView) findViewById(R.id.imageView2);
            layout.setBackgroundResource(R.mipmap.minus);
        }
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView3);
        textView.setText(message);
    }
}
