package com.example.s2106409.liver_dye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static String tag = "com.example.s2106409.liver_dye";


        Bundle sendBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onNextClick(View source){
        //Toast.makeText(this, "Howdy", Toast.LENGTH_LONG ).show();
        Log.d("LOLOLOL", "Next button clicked");
        Log.i(tag, "launching cave");
        Intent caveActivityIntent = new Intent (this, CaveActivity.class);

        sendBundle.putString("name", "Cave");

        caveActivityIntent.putExtra("groceries", sendBundle);

        startActivity (caveActivityIntent);
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
