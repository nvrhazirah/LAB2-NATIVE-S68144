package com.example.imageexperiment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private boolean isBackgroundOne = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        Button switchBackgroundButton = findViewById(R.id.switchBackgroundButton);
        Button imageButton = findViewById(R.id.imageButton);  // Find the Image Button by ID

        // Click listener for switchBackgroundButton to toggle background
        switchBackgroundButton.setOnClickListener(v -> {
            if (isBackgroundOne) {
                layout.setBackgroundResource(R.drawable.background_image2);
            } else {
                layout.setBackgroundResource(R.drawable.background_image1);
            }
            isBackgroundOne = !isBackgroundOne;
        });

        // Click listener for imageButton to change background too
        imageButton.setOnClickListener(v -> {
            if (isBackgroundOne) {
                layout.setBackgroundResource(R.drawable.background_image2);
            } else {
                layout.setBackgroundResource(R.drawable.background_image1);
            }
            isBackgroundOne = !isBackgroundOne;
        });
    }
}
