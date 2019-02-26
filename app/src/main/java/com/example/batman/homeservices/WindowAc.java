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


public class WindowAc extends Activity {


      TextView t77;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);
        Button btn8 = (Button) findViewById(R.id.button8);
        t77 = (TextView) findViewById(R.id.textView77);
        TextView t1 = (TextView) findViewById(R.id.textView4);
        t77.setText("\nDescription");
        t1.setText("\n\nGeneral AC repair work\nAC Service\nAC Installation\nAC Uninstallation\nAC Gas Refil or Top-Up\nAC Start-Up Problem\nAC Not Cooling\nAC Making Noise\nWater Leakage from AC\nIce formation in AC\nAC Switch Installation\nAC Stabilizer Installation\nAC Stabilizer Repair\nIf something else - Tell us your problem\n\nCost Rs.500(Original Price)Rs.300(Offer Price)");
        TextView t2 = (TextView) findViewById(R.id.textView5);
        t2.setText("To Book this Services,Please Click Above Button and Select city also give your Mobile Number.");
        btn8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(WindowAc.this, confirm2.class);
                startActivity(newActivity);
            }
        });
 }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_window, menu);
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
