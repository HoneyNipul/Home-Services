package com.example.batman.homeservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class confirm2 extends Activity {
          TextView t33,t34;
          RadioButton rd59,rd95;
          String city,number,service2;
          EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm2);
        t33 = (TextView) findViewById(R.id.textView33);
        t34 = (TextView) findViewById(R.id.textView34);
        rd59 = (RadioButton) findViewById(R.id.radioButton59);
        rd95 = (RadioButton) findViewById(R.id.radioButton95);
        et1 = (EditText) findViewById(R.id.editText19);
        Button btn7 = (Button) findViewById(R.id.button7);
        t33.setText("Please Choose Your City and enter the your Mobile number:");
        service2 =  (String) MainActivity.service.toString();

        t34.setText("Click Above Button to Send mail for Whatever you need Services. ");


        rd59.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd59.setChecked(true);
                rd95.setChecked(false);
                city = (String) rd59.getText();
            }
        });
        rd95.setOnClickListener(new RadioButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd59.setChecked(false);
                rd95.setChecked(true);
                city = (String) rd95.getText();
            }
        });

        btn7.setOnClickListener(new Button.OnClickListener() {
            @Override

            public void onClick(View v) {

                if(rd59.isChecked() || rd95.isChecked()  ) {
                    if (et1.getText().length() == 0) {
                        DisplayToast("Please Enter the NUmber");
                    }
                    else
                    {
                        checkNetworkConnectivity();
                    }
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
    protected void checkNetworkConnectivity() {
        // TODO Auto-generated method stub
        ConnectivityManager connMgr = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);

        final android.net.NetworkInfo wifi =
                connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        final android.net.NetworkInfo mobile =
                connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if( wifi.isAvailable() || mobile.isAvailable()){


           // Intent gogogo = new Intent(confirm2.this, confirm1.class);
            //   gogogo.putExtra("result", result);
           // startActivity(gogogo);


                number = (String) et1.getText().toString();
             //   DisplayToast(number);


                    Intent newActivity = new Intent(confirm2.this, confirm2.class);
                    startActivity(newActivity);
                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                            "mailto", "serviceworld04@gmail.com", null));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Services");
                    intent.putExtra(Intent.EXTRA_TEXT, " \n\nSelected City: "  +city+  " \n\nClient Number: "  +number+"\n\nSelected Service: "+service2);


                    startActivity(Intent.createChooser(intent, "serviceworld04@gmail.com"));




        }

        else{
            Toast.makeText(this, "No Network Available" , Toast.LENGTH_LONG).show();


        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_confirm2, menu);
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
