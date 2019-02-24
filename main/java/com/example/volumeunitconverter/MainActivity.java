package com.example.volumeunitconverter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double result;
    EditText Value;
    RadioGroup converter;
    RadioButton RadioButton;
    TextView viewResult;
    RadioButton rb1, rb2, rb3, rb4;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Value = (EditText) findViewById(R.id.value);
        converter = (RadioGroup) findViewById(R.id.LitersConverter);
        viewResult = (TextView) findViewById(R.id.viewResult);
        rb1 = (RadioButton) findViewById(R.id.RB1);
        rb2 = (RadioButton) findViewById(R.id.RB2);
        rb3 = (RadioButton) findViewById(R.id.RB3);
        rb4 = (RadioButton) findViewById(R.id.RB4);
        final Button reset = (Button) findViewById(R.id.resetBTN);


        Button convert = findViewById(R.id.convertBTN);
        convert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(Value.getText().toString());

                if (rb1.isChecked()) {
                    result = value * 33.824;
                } else if (rb2.isChecked())
                    result = value * 1.0570;
                else if (rb3.isChecked())
                    result = value * 0.2642;
                else if (rb4.isChecked())
                    result = value * 0.2200;
                else
                    viewResult.setText("pls choose the unit type");

                viewResult.setText(""+result);

            }


        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value.setText("  ");
                viewResult.setText("   ");
                converter.clearCheck();
            }
        });
        String result = " ";

        result+= (rb1.isChecked())?"LIters To Fluid Ounces is selected":(rb2.isChecked())?"Liters To Quarts is selected":
                (rb3.isChecked())?"Liters to Gallons is selected":(rb4.isChecked())?"Liters to Gallons is selected": "";
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();


    }
}








