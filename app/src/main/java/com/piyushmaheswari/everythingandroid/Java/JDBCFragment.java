package com.piyushmaheswari.everythingandroid.Java;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.piyushmaheswari.everythingandroid.Android.ExpandableListAdapter;
import com.piyushmaheswari.everythingandroid.R;

import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class JDBCFragment extends Fragment {

    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;

    public JDBCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_jdbc, container, false);
        ExpandableListView expandableListView = v.findViewById(R.id.expandableListJDBC);
        initData();
        ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listHashMap);
        expandableListView.setAdapter(expandableListAdapter);
        return v;
    }

    private void initData() {
    }
}