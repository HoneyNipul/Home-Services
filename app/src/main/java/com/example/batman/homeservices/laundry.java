package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class laundry extends Activity {
   public static String service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);
        service = (String) getTitle().toString();
        Button btn5 = (Button) findViewById(R.id.button5);
        TextView t12 = (TextView) findViewById(R.id.textView12);
        t12.setText("\nDescription");
        TextView t13 = (TextView) findViewById(R.id.textView13);
        t13.setText("Regular Wear:Shirt,T-Shirt,Jeans,Pyjama,Women Top,Kameez,Skirt,Women Bottom,Short,Bath Rower,Tie.\n\nPremiunm Wear:Any Clothes that exceeds Marketprice of Rs.1500 upto 2500 Salwar,Sweater,Hoodie,Pullover.\n\nExtra Premium Wear:Any Clothes tha exceeds Marketprice of Rs.2501 upto 5000 Women Fancy Dress,Silk saree, Saree cotton with starch.\n\nCustom Wash Wedding Dress:Suit,Blazer,Shawl.\n\nCost Rs.300(Original Price) Rs.200(Offer Price).");
        TextView t14 = (TextView) findViewById(R.id.textView14);
        t14.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        btn5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(laundry.this, confirm2.class);
                startActivity(newActivity);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_laundry, menu);
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
