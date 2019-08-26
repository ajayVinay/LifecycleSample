package com.example.lifecycleexample;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String  TAG = "MainActivity";
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_second = findViewById(R.id.btn_second_fragment);
        next = findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SampleActivity.class);
                startActivity(intent);
            }
        });
        btn_second.setVisibility(View.VISIBLE);
        Log.e(TAG,"onCreate Call");
            NormalFragment normalFragment = new NormalFragment();
            FragmentManager fragmentManager =  getSupportFragmentManager();
            FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.layoutContainer,normalFragment);
            fragmentTransaction.commit();

    }
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TAG, "onAttachFragment call");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: call " );
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG, "onResume: call" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: call" );
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: call" );
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: call" );
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: call");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState: call " );
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState: call" );
    }
}
