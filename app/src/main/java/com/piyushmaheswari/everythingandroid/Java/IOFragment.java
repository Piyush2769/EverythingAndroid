package com.piyushmaheswari.everythingandroid.Java;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.piyushmaheswari.everythingandroid.ExpandableListAdapter;
import com.piyushmaheswari.everythingandroid.R;

import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class IOFragment extends Fragment {

    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;

    public IOFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_io, container, false);
        ExpandableListView expandableListView = v.findViewById(R.id.expandableListIO);
        initData();
        ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listHashMap);
        expandableListView.setAdapter(expandableListAdapter);
        return v;
    }

    private void initData() {
    }
}