package com.example.octavian.timezones;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WartungActivity extends AppCompatActivity {

    int london, hongkong, sydney, ny, moscow = 0;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wartung);

        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        london = prefs.getInt("london", 0);
        sydney = prefs.getInt("sydney", 0);
        hongkong = prefs.getInt("hongkong", 0);
        ny = prefs.getInt("ny", 0);
        moscow = prefs.getInt("moscow", 0);

        ((TextView) findViewById(R.id.londonTextView)).setText(String.valueOf(london));
        ((TextView) findViewById(R.id.hongkongTextView)).setText(String.valueOf(hongkong));
        ((TextView) findViewById(R.id.sydneyTextView)).setText(String.valueOf(sydney));
        ((TextView) findViewById(R.id.newYorkTextView)).setText(String.valueOf(ny));
        ((TextView) findViewById(R.id.moskauTextView)).setText(String.valueOf(moscow));


        ((Button) findViewById(R.id.londonMinusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                london -= 1;
                ((TextView) findViewById(R.id.londonTextView)).setText(String.valueOf(london));
            }
        });
        ((Button) findViewById(R.id.londonPlusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                london += 1;
                ((TextView) findViewById(R.id.londonTextView)).setText(String.valueOf(london));
            }
        });

        ((Button) findViewById(R.id.hongkongMinusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hongkong -= 1;
                ((TextView) findViewById(R.id.hongkongTextView)).setText(String.valueOf(hongkong));
            }
        });
        ((Button) findViewById(R.id.hongkongPlusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hongkong += 1;
                ((TextView) findViewById(R.id.hongkongTextView)).setText(String.valueOf(hongkong));
            }
        });

        ((Button) findViewById(R.id.sydneyMinusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sydney -= 1;
                ((TextView) findViewById(R.id.sydneyTextView)).setText(String.valueOf(sydney));
            }
        });
        ((Button) findViewById(R.id.sydneyPlusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sydney += 1;
                ((TextView) findViewById(R.id.sydneyTextView)).setText(String.valueOf(sydney));
            }
        });

        ((Button) findViewById(R.id.newYorkMinusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ny -= 1;
                ((TextView) findViewById(R.id.newYorkTextView)).setText(String.valueOf(ny));
            }
        });
        ((Button) findViewById(R.id.newYorkPlusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ny += 1;
                ((TextView) findViewById(R.id.newYorkTextView)).setText(String.valueOf(ny));
            }
        });

        ((Button) findViewById(R.id.moskauMinusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moscow -= 1;
                ((TextView) findViewById(R.id.moskauTextView)).setText(String.valueOf(moscow));
            }
        });
        ((Button) findViewById(R.id.moskauPlusButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moscow += 1;
                ((TextView) findViewById(R.id.moskauTextView)).setText(String.valueOf(moscow));
            }
        });

        ((Button) findViewById(R.id.doneButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor e = prefs.edit();
                e.putInt("london", london);
                e.putInt("ny", ny);
                e.putInt("hongkong", hongkong);
                e.putInt("sydney", sydney);
                e.putInt("moscow", moscow);
                e.commit();

                startActivity(new Intent(WartungActivity.this, MainActivity.class));
            }
        });
    }
}
