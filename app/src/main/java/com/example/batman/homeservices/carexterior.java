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

import org.w3c.dom.Text;


public class carexterior extends Activity  {
        RadioButton rd1,rd2,rd3;
        Button btn1;
        public static String extend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carexterior);
        TextView t16 = (TextView) findViewById(R.id.textView16);
        t16.setText("\nDescription");
        TextView t17 = (TextView) findViewById(R.id.textView17);
        t17.setText("\n\nIn Exterior cleaning your car is pressure cleaned from outside. It is then shampoo washed to remove accumulated dirt and stubborn stains.All window screens,mirrors,wind shields are washed thoroughly to remove dirt and marks. Wheels are washed properly. Car is also polished.");
        TextView t18 = (TextView) findViewById(R.id.textView18);
        t18.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        rd1 = (RadioButton) findViewById(R.id.radio1);
        rd2 = (RadioButton) findViewById(R.id.radio2);
        rd3 = (RadioButton) findViewById(R.id.radio3);
        btn1 = (Button)   findViewById(R.id.button1);

        rd1.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd1.setChecked(true);
                rd2.setChecked(false);
                rd3.setChecked(false);
                extend = (String) rd1.getText();
                     }});
        rd2.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd1.setChecked(false);
                rd2.setChecked(true);
                rd3.setChecked(false);
                extend = (String) rd2.getText();
            }});
        rd3.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd1.setChecked(false);
                rd2.setChecked(false);
                rd3.setChecked(true);
                extend = (String) rd3.getText();
            }});

        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd1.isChecked() || rd2.isChecked() || rd3.isChecked())
                   {
                     Intent newActivity = new Intent(carexterior.this, confirm1.class);
                     startActivity(newActivity);
                   }
                else
                {
                    String str = "Please Select Option";
                    DisplayToast(str);
                }
            }
        });
    }
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_carexterior, menu);
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
