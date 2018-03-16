package com.example.rodneytressler.week1assessment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class android_is_fun extends AppCompatActivity {
    private TextView love;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_is_fun);
        love = findViewById(R.id.love_textView);

    }
    private void nameLove(){
        love.setText( "Loves Android!!!");
    }

}
