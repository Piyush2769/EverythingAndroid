package com.piyushmaheswari.everythingandroid.Android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.piyushmaheswari.everythingandroid.R;

public class AndroidActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private AndroidTabsAdapter androidTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
