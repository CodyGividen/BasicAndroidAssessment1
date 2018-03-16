package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    protected TextView textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.button_submit);
        textInput = findViewById(R.id.text_input_edit_text);
        onClickListener();
    }

    protected void onClickListener(){
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Android is fun!!!!!!", Toast.LENGTH_LONG).show();
                textInput.setText("");
                startmenu();
            }
        });
    }
    private void startmenu(){
        Intent android = new Intent(this, android_is_fun.class);
        startActivity(android);
        finish();
    }
}
