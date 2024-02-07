package com.example.measurementconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   EditText inputNumber;
   Spinner spinner1, spinner2;
   Button convertButton;
   TextView resultLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.inputNumber);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        convertButton = findViewById(R.id.convertButton);
        resultLabel = findViewById(R.id.resultLabel);

        String [] spinner1Items = {"mm", "cm", "m", "inches", "yards"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, spinner1Items);
        spinner1.setAdapter(adapter1);

        String [] spinner2Items = {"mm", "cm", "m", "inches", "yards"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, spinner2Items);
        spinner2.setAdapter(adapter2);

        convertButton.setOnClickListener(v -> {
            Double convertedValue = null;
            double trueValue = Double.parseDouble(inputNumber.getText().toString());

//            MM
            if (spinner1.getSelectedItem().toString().equals("mm") && spinner2.getSelectedItem().toString().equals("mm")) {
                resultLabel.setText(String.valueOf(trueValue * 1));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("mm") && spinner2.getSelectedItem().toString().equals("cm")) {
                resultLabel.setText(String.valueOf(trueValue * 0.1));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("mm") && spinner2.getSelectedItem().toString().equals("m")) {
                resultLabel.setText(String.valueOf(trueValue * 0.001));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("mm") && spinner2.getSelectedItem().toString().equals("inches")) {
                resultLabel.setText(String.valueOf(trueValue / 25.4));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("mm") && spinner2.getSelectedItem().toString().equals("yards")) {
                resultLabel.setText(String.valueOf(trueValue / 914.4));
                return;
            }

//            Cm
            if (spinner1.getSelectedItem().toString().equals("cm") && spinner2.getSelectedItem().toString().equals("mm")) {
                resultLabel.setText(String.valueOf(trueValue * 10));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("cm") && spinner2.getSelectedItem().toString().equals("cm")) {
                resultLabel.setText(String.valueOf(trueValue * 1));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("cm") && spinner2.getSelectedItem().toString().equals("m")) {
                resultLabel.setText(String.valueOf(trueValue * 0.01));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("cm") && spinner2.getSelectedItem().toString().equals("inches")) {
                resultLabel.setText(String.valueOf(trueValue / 2.54));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("cm") && spinner2.getSelectedItem().toString().equals("yards")) {
                resultLabel.setText(String.valueOf(trueValue / 91.44));
                return;
            }

            //            METER
            if (spinner1.getSelectedItem().toString().equals("m") && spinner2.getSelectedItem().toString().equals("mm")) {
                resultLabel.setText(String.valueOf(trueValue * 1000));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("m") && spinner2.getSelectedItem().toString().equals("cm")) {
                resultLabel.setText(String.valueOf(trueValue * 100));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("m") && spinner2.getSelectedItem().toString().equals("m")) {
                resultLabel.setText(String.valueOf(trueValue * 1));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("m") && spinner2.getSelectedItem().toString().equals("inches")) {
                resultLabel.setText(String.valueOf(trueValue * 39.37));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("m") && spinner2.getSelectedItem().toString().equals("yards")) {
                resultLabel.setText(String.valueOf(trueValue / 1.094));
                return;
            }

            //           INCHES
            if (spinner1.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("mm")) {
                resultLabel.setText(String.valueOf(trueValue * 25.4));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("cm")) {
                resultLabel.setText(String.valueOf(trueValue * 2.54));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("m")) {
                resultLabel.setText(String.valueOf(trueValue / 39.37));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("inches")) {
                resultLabel.setText(String.valueOf(trueValue * 1));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("inches") && spinner2.getSelectedItem().toString().equals("yards")) {
                resultLabel.setText(String.valueOf(trueValue / 36));
                return;
            }

            //           YARDS
            if (spinner1.getSelectedItem().toString().equals("yards") && spinner2.getSelectedItem().toString().equals("mm")) {
                resultLabel.setText(String.valueOf(trueValue * 914.4));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("yards") && spinner2.getSelectedItem().toString().equals("cm")) {
                resultLabel.setText(String.valueOf(trueValue * 91.44));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("yards") && spinner2.getSelectedItem().toString().equals("m")) {
                resultLabel.setText(String.valueOf(trueValue / 1.094));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("yards") && spinner2.getSelectedItem().toString().equals("inches")) {
                resultLabel.setText(String.valueOf(trueValue * 36));
                return;
            }
            if (spinner1.getSelectedItem().toString().equals("yards") && spinner2.getSelectedItem().toString().equals("yards")) {
                resultLabel.setText(String.valueOf(trueValue * 1));
                return;
            }
        });
    }
}