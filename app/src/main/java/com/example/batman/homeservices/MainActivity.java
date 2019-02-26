package com.example.batman.homeservices;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {
      ListView list;
    public static String service;
    String [] services = {"Car Exterior Detailing","Car Interior Detailing","Split AC Service/Repair",
            "Window AC Service/Repair","Bathroom Cleaning Service","Kitchen Cleaning Service",
            "Laundry Service","Pest Control Service","Sofa Cleaning Service"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView1);

        final ListAdapter theadapter = new MyAdapter(this, services );
        list.setAdapter(theadapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch( position )
                {
                    case 0:
                        Intent newActivity = new Intent(MainActivity.this, carexterior.class);
                        startActivity(newActivity);
                        service = "Car Exterior Detailing";
                        DisplayToast(service);
                        break;
                    case 1:  Intent newActivity1 = new Intent(MainActivity.this, carinterior.class);
                        startActivity(newActivity1);
                        service = "Car Interior Detailing";
                        DisplayToast(service);
                        break;
                    case 2:  Intent newActivity2 = new Intent(MainActivity.this, splitAc.class);
                        startActivity(newActivity2);
                        service = "Splite AC Service/Repair";
                        DisplayToast(service);
                        break;
                    case 3:  Intent newActivity3 = new Intent(MainActivity.this, WindowAc.class);
                        startActivity(newActivity3);
                        service = "Windows AC Service/Repair";
                        DisplayToast(service);
                        break;
                    case 4:  Intent newActivity4 = new Intent(MainActivity.this, BathroomClean.class);
                        startActivity(newActivity4);
                        service = "Bathroom Cleaning Service";
                        DisplayToast(service);
                        break;
                    case 5:  Intent newActivity5 = new Intent(MainActivity.this, KitchenClean.class);
                        startActivity(newActivity5);
                        service = "Kitchen Cleaning Service";
                        DisplayToast(service);
                        break;
                    case 6:  Intent newActivity6 = new Intent(MainActivity.this, laundry.class);
                        startActivity(newActivity6);
                        service = "Laundry Service";
                        DisplayToast(service);
                        break;
                    case 7:  Intent newActivity7 = new Intent(MainActivity.this, pestcontrol.class);
                        startActivity(newActivity7);
                        service = "Pest Control Service";
                        DisplayToast(service);
                        break;
                    case 8:  Intent newActivity8 = new Intent(MainActivity.this, sofaclean.class);
                        startActivity(newActivity8);
                        service = "Sofa Cleaning Service";
                        DisplayToast(service);
                        break;
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
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
