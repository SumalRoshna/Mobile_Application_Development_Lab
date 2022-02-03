package com.example.linearcode;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll= new LinearLayout(this);
        t = new TextView(this);
        b = new Button(this);
        LinearLayout.LayoutParams dim = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(dim);

        LinearLayout.LayoutParams vdim = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        vdim.setMargins(0,50,0,0);
        t.setLayoutParams(vdim);
        b.setLayoutParams(vdim);

        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setVerticalGravity(Gravity.CENTER);
        t.setText("HELLO GUYS... HAVE A NICE DAY!");
        t.setGravity(Gravity.CENTER);
        t.setTextSize(35);
        t.setTextColor(Color.RED);
        t.setTypeface(Typeface.DEFAULT_BOLD);
        b.setText("Hi Button");
        b.setBackgroundColor(Color.CYAN);
        ll.addView(t);
        ll.addView(b);
        setContentView(ll);


    //setContentView(R.layout.activity_main);
    }
}