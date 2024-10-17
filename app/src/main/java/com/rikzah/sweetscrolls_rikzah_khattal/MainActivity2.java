package com.rikzah.sweetscrolls_rikzah_khattal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity2 extends AppCompatActivity {

    // Declare ImageButtons for various recipes
    ImageButton Pancake;
    ImageButton Pizza;
    ImageButton Burger;
    ImageButton Salmon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_main2.xml
        setContentView(R.layout.activity_main2);

        // Initialize ImageButtons by finding them in the layout using their IDs
        Pancake = findViewById(R.id.pancakebtn);
        Pizza = findViewById(R.id.pizzabtn);
        Burger = findViewById(R.id.burgerbtn);
        Salmon = findViewById(R.id.salmonbtn);

        // Set up click listeners for each ImageButton to open corresponding recipe activities
        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pizzarecipe.class);
                startActivity(intent);
            }
        });

        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), burgerrecipe.class);
                startActivity(intent);
            }
        });

        Pancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pancakerecipe.class);
                startActivity(intent);
            }
        });

        Salmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), salmonrecipe.class);
                startActivity(intent);
            }
        });
    }

    // Method to handle click on the category items button
    public void categoryitem (View view) {
        // Create an intent to navigate to the category items activity
        Intent intent = new Intent(getApplicationContext(), categoryitems.class);

        // Start the category items activity
        startActivity(intent);
    }
}
