package com.example.assignment1_101331806;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button submit_button
    // Instantiating all the ViewGroup elements
    Button getSubmit_button = findViewById(R.id.submit_data);
    EditText hourly_rate = findViewById(R.id.hourly_rate);
    EditText no_of_hours = findViewById(R.id.no_of_hours);
    TextView total_pay = findViewById(R.id.total_pay_output);
    TextView tax = findViewById(R.id.tax_output);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    View.OnClickListener
}