package com.piyushmaheswari.everythingandroid.Java;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piyushmaheswari.everythingandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OthersJavaFragment extends Fragment {


    public OthersJavaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_others_java, container, false);
    }

}
