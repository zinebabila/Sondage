package com.example.sondageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class sondage extends AppCompatActivity {
    int val;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sondage);
        Intent intent2 = getIntent();

        findViewById(R.id.button).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // RadioButton r=findViewById(radio.getCheckedRadioButtonId());
                // String f=r.getText().toString();

                if (val == 1) {
                    EditText S = findViewById(R.id.textView2);
                    String ED = S.getText().toString();
                    intent2.putExtra("fe", ED + " vous avez dit non");
                    Toast.makeText(getApplicationContext(), "Merci pour votre choix", Toast.LENGTH_LONG).show();
                    setResult(2, intent2);
                    finish();

                }
                if (val == 0) {
                    EditText S = findViewById(R.id.textView2);
                    String ED = S.getText().toString();
                    intent2.putExtra("fe", ED + " vous avez dit oui");
                    Toast.makeText(getApplicationContext(), "Merci pour votre choix", Toast.LENGTH_LONG).show();
                    setResult(2, intent2);
                    finish();
                }


            }
        });

    }
        public void clicked (View view){
            boolean checked = ((RadioButton) view).isChecked();
            switch (view.getId()) {
                case R.id.radioButton:
                    if (checked)
                        val = 0;
                    break;
                case R.id.radioButton2:
                    if (checked)
                        val = 1;
                    break;

            }
        }
    }
