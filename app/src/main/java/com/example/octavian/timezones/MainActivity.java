package com.example.octavian.timezones;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView) findViewById(R.id.uhrzeitView);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final int london = prefs.getInt("london", 0);
        final int sydney = prefs.getInt("sydney", 0);
        final int hongkong = prefs.getInt("hongkong", 0);
        final int ny = prefs.getInt("ny", 0);
        final int moscow = prefs.getInt("moscow", 0);


        ((Button) findViewById(R.id.londonButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeZone tz = TimeZone.getTimeZone("London");
                Calendar cal = Calendar.getInstance(tz);
                tv.setText((cal.get(Calendar.HOUR_OF_DAY) +london) + ":" + cal.get(Calendar.MINUTE));
            }
        });

        ((Button) findViewById(R.id.sydneyButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeZone tz = TimeZone.getTimeZone("Australia/Sydney");
                Calendar cal = Calendar.getInstance(tz);
                tv.setText((cal.get(Calendar.HOUR_OF_DAY) +sydney) + ":" + cal.get(Calendar.MINUTE));
            }
        });

        ((Button) findViewById(R.id.hongkongButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeZone tz = TimeZone.getTimeZone("Hongkong");
                Calendar cal = Calendar.getInstance(tz);
                tv.setText((cal.get(Calendar.HOUR_OF_DAY) +hongkong) + ":" + cal.get(Calendar.MINUTE));
            }
        });

        ((Button) findViewById(R.id.newYorkButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeZone tz = TimeZone.getTimeZone("America/New_York");
                Calendar cal = Calendar.getInstance(tz);
                tv.setText((cal.get(Calendar.HOUR_OF_DAY) +ny) + ":" + cal.get(Calendar.MINUTE));
            }
        });

        ((Button) findViewById(R.id.moskauButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeZone tz = TimeZone.getTimeZone("Europe/Moscow");
                Calendar cal = Calendar.getInstance(tz);
                tv.setText((cal.get(Calendar.HOUR_OF_DAY) +moscow) + ":" + cal.get(Calendar.MINUTE));
            }
        });

        ((Button) findViewById(R.id.wartungButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WartungActivity.class));
            }
        });
    }
}
