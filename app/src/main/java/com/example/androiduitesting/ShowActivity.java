package com.example.androiduitesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show); // <-- use the correct layout

        TextView cityNameTextView = findViewById(R.id.show_city_name);
        Button backButton = findViewById(R.id.back_button);

        // Read the city name passed from MainActivity
        String cityName = getIntent().getStringExtra("cityName");
        if (cityName != null) {
            cityNameTextView.setText(cityName);
        } else {
            cityNameTextView.setText("(no city)");
        }

        // Back to MainActivity
        backButton.setOnClickListener(v -> finish());
    }
}
