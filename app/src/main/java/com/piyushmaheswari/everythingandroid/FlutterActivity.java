package com.piyushmaheswari.everythingandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.piyushmaheswari.everythingandroid.Android.ExpandableListAdapter;

import java.util.HashMap;
import java.util.List;

public class FlutterActivity extends AppCompatActivity {

    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);

        ExpandableListView expandableListView = findViewById(R.id.expandableListFlutter);
        initData();
        ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(this, listDataHeader, listHashMap);
        expandableListView.setAdapter(expandableListAdapter);
    }

    private void initData() {
    }
}