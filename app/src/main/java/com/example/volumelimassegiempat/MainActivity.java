package com.example.volumelimassegiempat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double a, b, c;
    private EditText lalas, tinggi;
    private TextView hasil;
    private Button hitung, reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lalas = (EditText) findViewById(R.id.editText);
        tinggi = (EditText) findViewById(R.id.editText2);
        hasil = (TextView) findViewById(R.id.textView3);
        hitung = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.button2);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(lalas.getText().toString());
                double n2 = Double.parseDouble(tinggi.getText().toString());

                a=n1;
                b=n2;

                c=0.33*a*b;

                hasil.setText("Volume Alas = "+c);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               hasil.setText("");
                lalas.setText("");
                tinggi.setText("");
                lalas.requestFocus();
            }
        });



    }
}
