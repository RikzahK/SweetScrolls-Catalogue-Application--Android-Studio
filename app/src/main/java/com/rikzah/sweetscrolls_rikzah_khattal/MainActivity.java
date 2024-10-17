package com.rikzah.sweetscrolls_rikzah_khattal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // Button to open the second activity (catalogue)
    Button VisitCatalogue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_main.xml
        setContentView(R.layout.activity_main);

        // Link the Java variable to the XML button variable
        VisitCatalogue = findViewById(R.id.VisitCatalogue);

        // Set up a click listener for the VisitCatalogue button
        VisitCatalogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call the OpenActivity2 function to open the second activity
                OpenActivity2();
            }
        });
    }

    // Function to open the second activity (catalogue)
    public void OpenActivity2() {
        // Create an intent to navigate to MainActivity2
        Intent intent = new Intent(this, MainActivity2.class);

        // Start the second activity
        startActivity(intent);
    }
}
