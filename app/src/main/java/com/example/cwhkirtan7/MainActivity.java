package com.example.cwhkirtan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "successfull.activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);

        EditText edittext= findViewById(R.id.editTextTextPersonName);
        EditText edittext2= findViewById(R.id.editTextTextPersonName2);
        EditText edittext3= findViewById(R.id.editTextTextPersonName3);

        String message = edittext.getText().toString() + "\n"
                        +edittext2.getText().toString() +"\n"
                        +edittext3.getText().toString();


        intent.putExtra(MSG,message);


        startActivity(intent);
    }
}