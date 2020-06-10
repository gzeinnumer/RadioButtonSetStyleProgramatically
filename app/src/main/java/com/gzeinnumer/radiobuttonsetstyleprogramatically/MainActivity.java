package com.gzeinnumer.radiobuttonsetstyleprogramatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView1();
        initView2();
    }

    private void initView1() {
        // Get the list
        String[] web = getResources().getStringArray(R.array.websites_array);

        RadioGroup radioGroupLocations = findViewById(R.id.rg);
        RadioButton radioButtonLocation;

        // For each location, create a radio button
        for (String string : web) {
            radioButtonLocation = new RadioButton(this, null, R.style.MyRadioButton);
            radioButtonLocation.setText(string);

            // Different IDs to get the expected behaviour as radio group
            radioButtonLocation.setId(radioGroupLocations.getChildCount());

            // Add the button to the group
            radioGroupLocations.addView(radioButtonLocation);
        }
    }

    private void initView2() {
        // Get the list
        String[] locationArray = getResources().getStringArray(R.array.websites_array);

        RadioGroup radioGroupLocations = findViewById(R.id.rg2);
        RadioButton radioButtonLocation;

        // For each location, create a radio button
        for (String string : locationArray) {
            radioButtonLocation = (RadioButton) getLayoutInflater().inflate(R.layout.template_radiobutton, null);
            radioButtonLocation.setText(string);

            // Different IDs to get the expected behaviour as radio group
            radioButtonLocation.setId(radioGroupLocations.getChildCount());

            // Add the button to the group
            radioGroupLocations.addView(radioButtonLocation);
        }

        radioGroupLocations.check(1);
    }
}