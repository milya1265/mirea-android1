package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import kotlinx.coroutines.ObsoleteCoroutinesApi;

public class MainActivity extends AppCompatActivity {
    static String tag = "pipi pupu";

    @Override
    protected void onPause() {
        Log.i(tag, "onPause");
        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();
        super.onPause();
        Log.e(tag, "ERROR!!!!!");
    }

    @Override
    protected void onResume() {
        Log.i(tag, "onResume");
        Log.d(tag, "debug lol kek");

        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.i(tag, "onDestroy");
        Toast.makeText(this, "on destroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.i(tag, "onStop");
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.i(tag, "onStart");
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(tag, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}