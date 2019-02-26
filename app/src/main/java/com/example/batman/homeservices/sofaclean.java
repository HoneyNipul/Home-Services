package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class sofaclean extends Activity {
        RadioButton rd10,rd9,rd8,rd7,rd6;
       public static String sofatext,service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofaclean);
        service = (String) getTitle().toString();
        TextView t23 = (TextView) findViewById(R.id.textView23);
        t23.setText("\nDescription");
        TextView t24 = (TextView) findViewById(R.id.textView24);
        t24.setText("\nGet your sofa cleaned by the perfessionals today.\n\n\n\nChoose number of sofa Seats:");
        TextView t25 = (TextView) findViewById(R.id.textView25);
        t25.setText("Please Click Above Button & Select city also give your Mobile Number.");

        rd6 = (RadioButton) findViewById(R.id.radio6);
        rd7 = (RadioButton) findViewById(R.id.radio7);
        rd8 = (RadioButton) findViewById(R.id.radio8);
        rd9 = (RadioButton) findViewById(R.id.radio9);
        rd10 = (RadioButton) findViewById(R.id.radio10);
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd6.isChecked() || rd7.isChecked() || rd8.isChecked() || rd9.isChecked() || rd10.isChecked() ) {
                    Intent newActivity = new Intent(sofaclean.this, confirm1.class);
                    startActivity(newActivity);
                }
                else
                {
                    String str = "Please Select Option";
                                     DisplayToast(str);
                }
            }
        });

        rd10.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd10.setChecked(true);
                rd9.setChecked(false);
                rd8.setChecked(false);
                rd7.setChecked(false);
                rd6.setChecked(false);
                sofatext = (String) rd10.getText().toString();
            }
        });
        rd9.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd10.setChecked(false);
                rd9.setChecked(true);
                rd8.setChecked(false);
                rd7.setChecked(false);
                rd6.setChecked(false);
                sofatext = (String) rd9.getText().toString();
            }
        });
        rd8.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd10.setChecked(false);
                rd9.setChecked(false);
                rd8.setChecked(true);
                rd7.setChecked(false);
                rd6.setChecked(false);
                sofatext = (String) rd8.getText().toString();
            }
        });
        rd7.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd10.setChecked(false);
                rd9.setChecked(false);
                rd8.setChecked(false);
                rd7.setChecked(true);
                rd6.setChecked(false);
                sofatext = (String) rd7.getText().toString();
            }
        });
        rd6.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd10.setChecked(false);
                rd9.setChecked(false);
                rd8.setChecked(false);
                rd7.setChecked(false);
                rd6.setChecked(true);
                sofatext = (String) rd6.getText().toString();
            }
        });


   }
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sofaclean, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
