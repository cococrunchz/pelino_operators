package com.example.pelino_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.txtdisplay);

        int birthYear = 2002;
        int birthMonth = 4;
        int birthDay = 9;

        int currentYear = 2021;
        int currentMonth = 1;
        int currentDay = 26;

        int ageInYears, ageInMonths, ageInDays;

        if(birthMonth > currentMonth) {
            currentMonth += 12;
            currentYear -= 1;
        }

        if(birthDay > currentDay) {
            currentMonth += 30;
            currentYear -= 1;
        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;


        display.setText("My precise age is \n" + String.valueOf(ageInYears) + " Years,\n" + String.valueOf(ageInMonths) + " Months,\n" + String.valueOf(ageInDays) + " Days.");

    }
}