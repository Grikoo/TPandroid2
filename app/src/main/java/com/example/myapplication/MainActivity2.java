package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends MainActivityAbstract {
    int testint = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abstract2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        
    }
    public void goToBase2(View view){
        Intent intent = new Intent(view.getContext(),MainActivity3.class);
        view.getContext().startActivity(intent);
    };
    public void MainActivity(View view){
        Intent intent = new Intent(view.getContext(),MainActivity.class);
        view.getContext().startActivity(intent);
    };


    @Override
    public int myView() {

        return myView();
    }

    @Override
    public void activityCreated() {

    }

    public void add (View view){
        testint++;
        TextView text = findViewById(R.id.textView);
        text.setText(String.valueOf(testint));
    }
    public void moin (View view){
        testint--;
        TextView text = findViewById(R.id.textView);
        text.setText(String.valueOf(testint));
    }
    public void addstatic (View view){
        test++;
        TextView text = findViewById(R.id.textView1);
        text.setText(String.valueOf(test));
    }
    public void moinstatic (View view){
        test--;
        TextView text = findViewById(R.id.textView1);
        text.setText(String.valueOf(test));
    }

}
