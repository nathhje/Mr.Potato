package com.example.gebruiker.oefenapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // buttons are created
    private Button hat;
    private Button eyebrows;
    private Button glasses;
    private Button eyes;
    private Button ears;
    private Button arms;
    private Button nose;
    private Button mouth;
    private Button mustache;
    private Button shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        // buttons are linked to the widgets and made invisible by default
        hat = (Button) findViewById(R.id.hat);
        hat.setVisibility(View.GONE);

        eyebrows = (Button) findViewById(R.id.eyebrows);
        eyebrows.setVisibility(View.GONE);

        glasses = (Button) findViewById(R.id.glasses);
        glasses.setVisibility(View.GONE);

        eyes = (Button) findViewById(R.id.eyes);
        eyes.setVisibility(View.GONE);

        ears = (Button) findViewById(R.id.ears);
        ears.setVisibility(View.GONE);

        arms = (Button) findViewById(R.id.arms);
        arms.setVisibility(View.GONE);

        nose = (Button) findViewById(R.id.nose);
        nose.setVisibility(View.GONE);

        mouth = (Button) findViewById(R.id.mouth);
        mouth.setVisibility(View.GONE);

        mustache = (Button) findViewById(R.id.mustache);
        mustache.setVisibility(View.GONE);

        shoes = (Button) findViewById(R.id.shoes);
        shoes.setVisibility(View.GONE);
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


    // functions to adjust visibility when box is checked
    public void onHat(View view) {
        if (hat.getVisibility() == View.VISIBLE) {
            hat.setVisibility(View.GONE);
        }
        else {
            hat.setVisibility(View.VISIBLE);
        }
    }

    public void onHair(View view) {
        if (eyebrows.getVisibility() == View.VISIBLE) {
            eyebrows.setVisibility(View.GONE);
        }
        else {
            eyebrows.setVisibility(View.VISIBLE);
        }
    }

    public void onGlasses(View view) {
        if (glasses.getVisibility() == View.VISIBLE) {
            glasses.setVisibility(View.GONE);
        }
        else {
            glasses.setVisibility(View.VISIBLE);
        }
    }

    public void onEyes(View view) {
        if (eyes.getVisibility() == View.VISIBLE) {
            eyes.setVisibility(View.GONE);
        }
        else {
            eyes.setVisibility(View.VISIBLE);
        }
    }

    public void onEars(View view) {
        if (ears.getVisibility() == View.VISIBLE) {
            ears.setVisibility(View.GONE);
        }
        else {
            ears.setVisibility(View.VISIBLE);
        }
    }

    public void onArms(View view) {
        if (arms.getVisibility() == View.VISIBLE) {
            arms.setVisibility(View.GONE);
        }
        else {
            arms.setVisibility(View.VISIBLE);
        }
    }

    public void onNose(View view) {
        if (nose.getVisibility() == View.VISIBLE) {
            nose.setVisibility(View.GONE);
        }
        else {
            nose.setVisibility(View.VISIBLE);
        }
    }

    public void onMouth(View view) {
        if (mouth.getVisibility() == View.VISIBLE) {
            mouth.setVisibility(View.GONE);
        }
        else {
            mouth.setVisibility(View.VISIBLE);
        }
    }

    public void onMustache(View view) {
        if (mustache.getVisibility() == View.VISIBLE) {
            mustache.setVisibility(View.GONE);
        }
        else {
            mustache.setVisibility(View.VISIBLE);
        }
    }

    public void onShoes(View view) {
        if (shoes.getVisibility() == View.VISIBLE) {
            shoes.setVisibility(View.GONE);
        }
        else {
            shoes.setVisibility(View.VISIBLE);
        }
    }
}
