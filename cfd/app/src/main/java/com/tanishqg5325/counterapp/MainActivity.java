package com.tanishqg5325.counterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int counter=5;
    public static final String EXTRA_MESSAGE = "com.tanishqg5325.counterapp.MESSAGE";
    private TextView ctrDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctrDisplay = findViewById(R.id.ctr_display);
        Button btn = (Button)findViewById(R.id.ins);
        ctrDisplay.setText(Integer.toString(counter));
    }

    public void display(int counter) {
        ctrDisplay.setText(Integer.toString(counter));
        if(counter==10) {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            String message = "Player 1 wins";
            intent.putExtra(EXTRA_MESSAGE, message);
            counter=5;
            startActivity(intent);
        }
        else if(counter==0){
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            String message = "Player 2 wins";
            intent.putExtra(EXTRA_MESSAGE, message);
            counter=5;
            startActivity(intent);
        }
    }

    public void dec(View view) {
        if(counter!=0) {
            counter--;
            display(counter);
        }
        else{
            Toast.makeText(this, "Counter cannot be decreased beyond 0 !", Toast.LENGTH_SHORT).show();
        }
    }
    public void inc(View view) {
        counter++;
        display(counter);
    }
    public void reset(View view) {
        counter=5;
        display(counter);
    }
    public void inst(View view) {
        startActivity(new Intent(MainActivity.this, in.class));
    }
}
