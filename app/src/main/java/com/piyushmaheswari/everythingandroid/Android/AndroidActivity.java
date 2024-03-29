package com.piyushmaheswari.everythingandroid.Android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.piyushmaheswari.everythingandroid.R;

public class AndroidActivity extends AppCompatActivity {

    private ViewPager s;
    private ViewPager ss;
    private ViewPager sss;
    private ViewPager c;
    private ViewPager hh;
    private ViewPager n;
    private TextView cc;
    private ViewPager sz;
    private Toolbar toolbar;
    private TextView h;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private AndroidTabsAdapter androidTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView s;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        toolbar=findViewById(R.id.android_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Android");

        viewPager=findViewById(R.id.android_tabsPager);


        androidTabsAdapter=new AndroidTabsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(androidTabsAdapter);

        tabLayout=findViewById(R.id.android_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
