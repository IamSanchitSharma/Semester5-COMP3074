package com.example.assignment1_101331806;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring ViewGroup elements for the Main Activity
    private Button submit_button;
    private EditText hourly_rate, no_of_hours;
    private TextView total_pay, tax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating all the ViewGroup elements
        submit_button = findViewById(R.id.submit_data);
        hourly_rate = findViewById(R.id.hourly_rate);
        no_of_hours = findViewById(R.id.no_of_hours);
        total_pay = findViewById(R.id.total_pay_output);
        tax = findViewById(R.id.full_name_box);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hours, rate, employee_pay, employee_tax;
//                try{
//                    hours = Double.parseDouble(no_of_hours.getText().toString());
//                    rate = Double.parseDouble(hourly_rate.getText().toString());
//                }
//                catch (Exception e){
//                    hours = 0;
//                    rate = 0;
//                }
                if(no_of_hours.getText().toString().isEmpty() || hourly_rate.getText().toString().isEmpty()){
                    hours = 0;
                    rate = 0;
                }
                else{
                    hours = Double.parseDouble(no_of_hours.getText().toString());
                    rate = Double.parseDouble(hourly_rate.getText().toString());
                }

                if(hours <= 40){
                    employee_pay = hours * rate;
                }
                else{
                    employee_pay = (hours-40) * rate * 1.5 + 40 * rate;
                }
                employee_tax = employee_pay * 0.18;
                total_pay.setText("Total Pay: $" + String.format("%.2f", employee_pay));
                tax.setText("Tax:           $"+ String.format("%.2f", employee_tax));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.application_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.about_activity_item:
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}