package com.example.countapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv_data);
        if (savedInstanceState!=null && savedInstanceState.containsKey("ap")){
            count=savedInstanceState.getInt("ap");
            tv.setText(String.valueOf(count));
        }
    }

    public void showToast(View view) {
        /*Toast is a short messages displys on the UI Screen*/
        //Toast.makeText(this,"Hello Toast",Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Hello Apssdc", Toast.LENGTH_SHORT).show();
    }

    public void increaseCount(View view) {
        count++;
        tv.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ap",count);
    }
}