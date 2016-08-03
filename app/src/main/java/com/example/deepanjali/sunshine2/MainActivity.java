package com.example.deepanjali.sunshine2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().
//                    add(R.id.container, new PlaceholderFragment()).commit();
//        }

        FragmentManager fm = getSupportFragmentManager();

        PlaceholderFragment fragment = new PlaceholderFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, fragment);
        ft.commit();
    }

}
