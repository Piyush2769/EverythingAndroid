package com.piyushmaheswari.everythingandroid.Android;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.piyushmaheswari.everythingandroid.R;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdvanceFragment extends Fragment {

    private Text d;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;

    public AdvanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_advance, container, false);
        ExpandableListView expandableListView = v.findViewById(R.id.expandableListAdvance);
        initData();
        ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listHashMap);
        expandableListView.setAdapter(expandableListAdapter);
        return v;
    }

    private void initData() {
    }


}
