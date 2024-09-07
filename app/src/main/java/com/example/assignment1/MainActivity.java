package com.example.assignment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnYes = findViewById(R.id.btn_yes);
        Button btnNo = findViewById(R.id.btn_no);

        btnYes.setOnClickListener(v-> {
            Toast.makeText(this, "Thanks for joining the trip!", Toast.LENGTH_SHORT).show();
        });

        btnNo.setOnClickListener(v-> {
            Toast.makeText(this, "Ohho, till next time!", Toast.LENGTH_SHORT).show();
        });

    }
}