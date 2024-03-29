package com.piyushmaheswari.everythingandroid;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.piyushmaheswari.everythingandroid.Android.AndroidActivity;
import com.piyushmaheswari.everythingandroid.Java.JavaActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RelativeLayout android,java,kotlin,flutter,tips,favourite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        android=findViewById(R.id.android_main);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,AndroidActivity.class);
                startActivity(i);
            }
        });


        java=findViewById(R.id.java_main);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, JavaActivity.class);
                startActivity(i);
            }
        });

        kotlin=findViewById(R.id.kotlin_main);
        kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, KotlinActivity.class);
                startActivity(i);
            }
        });

        flutter=findViewById(R.id.flutter_main);
        flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, FlutterActivity.class);
                startActivity(i);
            }
        });

        tips=findViewById(R.id.tips_main);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, TipsTricksActivity.class);
                startActivity(i);
            }
        });

        favourite=findViewById(R.id.fav_main);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Favourites.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

         if (id == R.id.nav_share)
         {
             Intent sendIntent = new Intent();
             sendIntent.setAction(Intent.ACTION_SEND);
             sendIntent.putExtra(Intent.EXTRA_TEXT,
                     "Hey check out my app at: https://play.google.com/store/apps/details?id=com.piyushmaheswari.everythingandroid");
             sendIntent.setType("text/plain");
             startActivity(sendIntent);

         }
         else if (id == R.id.nav_rate)
         {

             Uri uri = Uri.parse("market://details?id=" + getPackageName());
             Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
             goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);

             try {
                 startActivity(goToMarket);
             } catch (ActivityNotFoundException e) {
                 startActivity(new Intent(Intent.ACTION_VIEW,
                         Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
             }
         }
         else if (id == R.id.nav_feedback)
         {
             Intent i=new Intent(MainActivity.this,FeedbackActivity.class);
             startActivity(i);

         }
         else if (id == R.id.nav_sendQuestions)
         {
             Intent ii=new Intent(MainActivity.this,SendQuestionsActivity.class);
             startActivity(ii);
         }
         else if (id == R.id.nav_Contributors)
         {
             ViewGroup viewGroup = findViewById(R.id.content);
             View dialogView = LayoutInflater.from(this).inflate(R.layout.layout_contributors, viewGroup, false);

             AlertDialog.Builder builder = new AlertDialog.Builder(this);
             builder.setView(dialogView);
             AlertDialog alertDialog = builder.create();
             alertDialog.show();
         }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
