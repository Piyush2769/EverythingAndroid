package com.piyushmaheswari.everythingandroid.Android;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.piyushmaheswari.everythingandroid.R;
import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BasicsFragment extends Fragment {

    private ExpandableListView expandableListView;
    private ExpandableListAdapter expandableListAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;

    public BasicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_basics, container, false);
        expandableListView=v.findViewById(R.id.expandableList);
        initData();
        expandableListAdapter=new ExpandableListAdapter(getActivity(),listDataHeader,listHashMap);
        expandableListView.setAdapter(expandableListAdapter);


        return v;
    }

    private void initData() {

        Resources res = getResources();
        String[] myBooks = res.getStringArray(R.array.my_books);

        listDataHeader=new ArrayList<>();
        listHashMap=new HashMap<>();

        listDataHeader.add("Question 1");
        listDataHeader.add("Question 2");
        listDataHeader.add("Question 3");
        listDataHeader.add("Question 4");
        listDataHeader.add("Question 5");

        List<String> q1=new ArrayList<>();
        q1.add("Answer 1");

        List<String> q2=new ArrayList<>();
        q2.add("Answer 2");

        List<String> q3=new ArrayList<>();
        q3.add("Answer 3");

        List<String> q4=new ArrayList<>();
        q4.add("Answer 4");

        List<String> q5=new ArrayList<>();
        q5.add("Answer 5");

        listHashMap.put(listDataHeader.get(0),q1);
        listHashMap.put(listDataHeader.get(1),q2);
        listHashMap.put(listDataHeader.get(2),q3);
        listHashMap.put(listDataHeader.get(3),q4);
        listHashMap.put(listDataHeader.get(4),q5);




    }


}
