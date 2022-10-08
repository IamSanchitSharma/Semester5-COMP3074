package com.example.labweek2_classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // All the data types are the type of elements we used in display view
        // To make an activity we have to first make reference to the elements we made or we can say bring them here in this class/code

        Button btn = findViewById(R.id.button);
        EditText input = findViewById(R.id.input);
        TextView out = findViewById(R.id.output);

        // Hardcoding of the empty value using the resources
        out.setText(R.string.empty);

        // Setting up event lister for the button
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Converting the numbers form the text box to String
                String txt = input.getText().toString();
                if(txt.isEmpty()){
                    txt = "0";
                }
                float val = Float.valueOf(txt);
                float res = val * 100;
                out.setText(res + "cm");


            }
        });


    }
}