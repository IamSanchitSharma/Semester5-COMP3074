package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        EditText input = findViewById(R.id.input);
        TextView out = findViewById(R.id.output);

        out.setText(R.string.empty);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Here we are getting the text and converting it into a string first
                String input_txt = input.getText().toString();
                /* Making a new variable and storing the uppercase format of the input text
                   Could also have done like:
                   input_txt = input_txt.toUpperCase(Locale.ROOT);
                   out.setText(input_txt);
                 */
                String output_txt = input_txt.toUpperCase(Locale.ROOT);
                out.setText(output_txt);
            }
        });
    }

}