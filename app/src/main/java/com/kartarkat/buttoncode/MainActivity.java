package com.kartarkat.buttoncode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b1 (View view){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }

    //this codes works greatly
}
