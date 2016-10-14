package com.nbs.app.modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class adapting_to_display_orientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapting_to_display_orientation);
        getSupportActionBar().setTitle("Adapting to Display Orientation");
    }
}
