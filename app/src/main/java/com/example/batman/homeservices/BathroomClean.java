package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class BathroomClean extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom_clean);
        Button btn3 = (Button) findViewById(R.id.button3);
        TextView t4 = (TextView) findViewById(R.id.textView6);
        t4.setText("\nDescription");
        TextView t5 = (TextView) findViewById(R.id.textView7);
        t5.setText("\nIn bathroom cleaning package tiles and grout are scrubbed and walls are dusted. Floor is scrubbed and mopped. Fans, Light Fixtures and switchboards are cleaned. Toilet bowl,wash basin,tub and shower cabin are cleaned and disinfected inside-out. Faucets and chrome fixtures are cleaned to remove hard water marks. Door,window glass, sills and grills are properly cleaned. Small accessories like mirrors,towel ring and countertops are cleaned. Toiletries are also dusted.\n\nBathroom Cleaning of 1 Big Bathroom or 2 small Bathrooms upto a total area of 1100 sq.feet Cost Rs.800.");
        TextView t6 = (TextView) findViewById(R.id.textView8);
        t6.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(BathroomClean.this, confirm2.class);
                startActivity(newActivity);
            }
        });
 }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bathroom_clean, menu);
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
