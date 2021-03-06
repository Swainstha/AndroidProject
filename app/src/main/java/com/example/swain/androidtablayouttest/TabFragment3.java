package com.example.swain.androidtablayouttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment3 extends Fragment {


    ListView myListView3;
    public TabFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tab_fragment3, container, false);

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("Chicken Momo");
        foodList.add("Buff Momo");
        foodList.add("Veg Momo");
        foodList.add("Paneer Momo");
        // Inflate the layout for this fragment

        myListView3 = rootView.findViewById(R.id.myListView3);
        ArrayAdapter<String> listArrayAdapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,foodList);
        myListView3.setAdapter(listArrayAdapter);

        return rootView;
    }

}
