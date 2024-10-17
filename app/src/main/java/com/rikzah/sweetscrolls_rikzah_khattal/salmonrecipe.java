package com.rikzah.sweetscrolls_rikzah_khattal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class salmonrecipe extends AppCompatActivity {

    // This method is called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_salmonrecipe.xml
        setContentView(R.layout.activity_salmonrecipe);
    }

    // Method to handle click on the home page button
    public void btnhomepgclick(View view){
        // Create an intent to navigate to the MainActivity2
        Intent intent= new Intent(getApplicationContext(), MainActivity2.class);

        // Start the MainActivity2 activity
        startActivity(intent);
    }
}

