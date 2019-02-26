package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class confirm1 extends Activity  {
    TextView t31,t56;
    Button btn10;
    EditText et45;
    String number,service1,choice;
    RadioButton rd31,rd34;
    String city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm1);
        et45 = (EditText) findViewById(R.id.editText2);
        t31 = (TextView) findViewById(R.id.textView31);
        t56 = (TextView) findViewById(R.id.textView56);
        rd31 = (RadioButton) findViewById(R.id.radioButton1);
        rd34 = (RadioButton) findViewById(R.id.radioButton2);
        btn10 = (Button) findViewById(R.id.button10);
        t31.setText("Please Choose Your City and enter the your Mobile number : ");
        t56.setText("Click Above Button to Send mail for Whatever you need Services.");
        number = et45.getText().toString();
        service1 =  (String) MainActivity.service.toString();

        rd31.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd31.setChecked(true);
                rd34.setChecked(false);
              city = (String) rd31.getText();
              }
        });
        rd34.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd31.setChecked(false);
                rd34.setChecked(true);
              city = (String) rd34.getText();
            }
        });

        btn10.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd31.isChecked() || rd34.isChecked())
                {
                    if (et45.getText().length() == 0) {
                        DisplayToast("Please Enter the NUmber");
                    }
                    else {
                        checkNetworkConnectivity();
                    }
                }
                else
                {
                    {
                        String str = "Please Select Option";
                        DisplayToast(str);
                    }
                }


               }
        });
        if(service1.equals("Car Exterior Detailing"))
        {
            choice = (String) carexterior.extend.toString();

        }
        else if (service1.equals("Car Interior Detailing"))
        {
            choice = (String) carinterior.carin.toString();
        }
        else if (service1.equals("Sofa Cleaning Service"))
        {
            choice = (String) sofaclean.sofatext.toString();
        }
}
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }

    protected void checkNetworkConnectivity() {
        // TODO Auto-generated method stub
        ConnectivityManager connMgr = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);

        final android.net.NetworkInfo wifi =
                connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        final android.net.NetworkInfo mobile =
                connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if( wifi.isAvailable() || mobile.isAvailable()){


          //  Intent gogogo = new Intent(confirm1.this, confirm1.class);
         //   gogogo.putExtra("result", result);
          //  startActivity(gogogo);

               number = (String) et45.getText().toString();
            //   DisplayToast(number);


                Intent newActivity = new Intent(confirm1.this, confirm1.class);
                startActivity(newActivity);
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "serviceworld04@gmail.com", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Services");
                intent.putExtra(Intent.EXTRA_TEXT, " \n\nSelected City: "  +city+  " \n\nClient Number: "  +number+ "\n\nSelected Service:" +service1 +"\n\nSelected Service Realted Option:" + choice);

                startActivity(Intent.createChooser(intent, "serviceworld04@gmail.com"));




        }

        else{
            Toast.makeText(this, "No Network Available" , Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_confirm1, menu);
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
