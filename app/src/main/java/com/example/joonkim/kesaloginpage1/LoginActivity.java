package com.example.joonkim.kesaloginpage1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Chalk_font.ttf");
        TextView myTextView = (TextView)findViewById(R.id.textView1);
        myTextView.setTypeface(myTypeface);
    }
}
