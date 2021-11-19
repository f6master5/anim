package com.example.blankactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.blankactivity.databinding.ActivityMain2Binding;

public class MainActivity2 extends Activity {


    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}