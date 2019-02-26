package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class pestcontrol extends Activity {
     public static String service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestcontrol);
        service = (String) getTitle().toString();
        Button btn6 = (Button) findViewById(R.id.button6);
        TextView t15 = (TextView) findViewById(R.id.textView15);
        t15.setText("\nDescription");
        TextView t16 = (TextView) findViewById(R.id.textView16);
        t16.setText("\n\nTermite Pest Control Packaged service includes 3 sevices in the year.Only Branded BAYER products are used. Applicable only for Residential Homes.\nApplicable only for Residential Homes.\n1 Room Home = 1 Room, 1 Hall, 1 Kitchen\n2 Room Home = 2 Room, 1 Hall, 1 Kitchen\n3 Room Home = 3 Room, 1 Hall, 1 Kitchen\n4 Room Home = 4 Room, 1 Hall, 1 Kitchen\n\nNote:Puja Room,Servant Room,Store Room are considered as additional rooms.(includes 3 sevice in 1 year)\n\nCost Rs. 2000.");
        TextView t17 = (TextView) findViewById(R.id.textView17);
        t17.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        btn6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(pestcontrol.this, confirm2.class);
                startActivity(newActivity);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pestcontrol, menu);
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
