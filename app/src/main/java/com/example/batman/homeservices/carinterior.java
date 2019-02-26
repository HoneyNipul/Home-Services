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


public class carinterior extends Activity {
    RadioButton radiod3,radiod4,radiod5;
    Button  btn2;
   public static String carin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carinterior);
        TextView t20 = (TextView) findViewById(R.id.textView20);
        t20.setText("\nDescription");
        TextView t21 = (TextView) findViewById(R.id.textView21);
        t21.setText("\nIn car interior cleaning the sets and roof are dry cleaned. Car interior is vacumed.Interior parts and accessories like steering wheel,floor mats,hand rest are cleaned.Dash board is cleaned to remove dirt and polished to restore its shine. Door and windows interior are wiped and polished.");
        TextView t22 = (TextView) findViewById(R.id.textView22);
        t22.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        radiod3 = (RadioButton) findViewById(R.id.rd3);
        radiod4 = (RadioButton) findViewById(R.id.rd4);
        radiod5 = (RadioButton) findViewById(R.id.rd5);
        btn2 = (Button) findViewById(R.id.button8);
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radiod3.isChecked() || radiod4.isChecked() || radiod5.isChecked())
                  {
                    Intent newActivity = new Intent(carinterior.this, confirm1.class);
                    startActivity(newActivity);
                  }
                else
                {
                    String str = "Please Select Option";
                    DisplayToast(str);
                }

            }
        });
        radiod3.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                radiod3.setChecked(true);
                radiod4.setChecked(false);
                radiod5.setChecked(false);
                carin = (String) radiod3.getText().toString();
            }});
        radiod4.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                radiod3.setChecked(false);
                radiod4.setChecked(true);
                radiod5.setChecked(false);
                carin = (String) radiod4.getText().toString();
            }});
        radiod5.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                radiod3.setChecked(false);
                radiod4.setChecked(false);
                radiod5.setChecked(true);
                carin = (String) radiod5.getText().toString();
            }});
  }
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_carinterior, menu);
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
