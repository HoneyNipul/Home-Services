package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class KitchenClean extends Activity {
      public static String service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_clean);
        service = (String) getTitle().toString();
        DisplayToast(service);
        Button btn4 = (Button) findViewById(R.id.button4);
        TextView t9 = (TextView) findViewById(R.id.textView9);
        t9.setText("\nDescription");
        TextView t10 = (TextView) findViewById(R.id.textView10);
        t10.setText("\nFloor is scrubbed and mopped.Fans, Light fixtures and switchboards are cleaned.Door, window glass,sills nd grills are properly cleaned.Stove,countertops backsplashes,faucets and chrome fixtures are cleaned and disinfected.All electric appliances are cleaned from outside. Exhaust fan and chimney are cleaned to remove grease nd grime.\n\nKitchen Cleaning of upto a total area of 100 sq.feet Cost Rs.600.");
        TextView t11 = (TextView) findViewById(R.id.textView11);
        t11.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        btn4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(KitchenClean.this, confirm2.class);
                startActivity(newActivity);
            }
        });
   }
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kitchen_clean, menu);
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
