package com.piyushmaheswari.everythingandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;

public class Favourites extends AppCompatActivity {

    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        ExpandableListView expandableListView = findViewById(R.id.expandableListFav);
        initData();
        ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(this, listDataHeader, listHashMap);
        expandableListView.setAdapter(expandableListAdapter);
    }

    private void initData() {
    }
}
