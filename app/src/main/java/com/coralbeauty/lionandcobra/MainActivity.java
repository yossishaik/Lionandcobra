package com.coralbeauty.lionandcobra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);
        img.setTag(R.drawable.lion);
        img.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.imageView) {

            if (img.getTag().equals(R.drawable.lion)) {
                img.setImageResource(R.drawable.eagle);
                img.setTag(R.drawable.eagle);
            }
            else if (img.getTag().equals(R.drawable.eagle)) {
                img.setImageResource(R.drawable.cat);
                img.setTag(R.drawable.cat);
            }
            else if(img.getTag().equals(R.drawable.cat)) {
                img.setImageResource(R.drawable.dog);
                img.setTag(R.drawable.dog);
            }

            else {
                img.setImageResource(R.drawable.lion);
                img.setTag(R.drawable.lion);
            }

        }

    }
}
