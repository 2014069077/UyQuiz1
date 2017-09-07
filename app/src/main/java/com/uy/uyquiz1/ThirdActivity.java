package com.uy.uyquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void callMainScreen (View view) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    public void callSecondActivity (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void callFourthActivity (View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}
