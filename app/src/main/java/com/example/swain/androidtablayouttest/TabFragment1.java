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
public class TabFragment1 extends Fragment {


    private ListView myListView1;
    private CustomListAdapter adapter;

    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<RestaurantInfo> foodList = new ArrayList<>();
        foodList.add(new RestaurantInfo("Burger House","Sankhamul",3,R.drawable.ic_menu_manage));
        foodList.add(new RestaurantInfo("Pizza Hut","Thapathali",5,R.drawable.ic_menu_send));
        foodList.add(new RestaurantInfo("KFC","Durbar Marga",4,R.drawable.ic_menu_gallery));
        foodList.add(new RestaurantInfo("Mc Donalds","Tripureshwor",5,R.drawable.ic_menu_share));
        foodList.add(new RestaurantInfo("Sandar","Baneshwor",1,R.drawable.ic_menu_slideshow));
        foodList.add(new RestaurantInfo("Swadista","Patan Dhoka",2,R.drawable.ic_menu_manage));
        foodList.add(new RestaurantInfo("Annapurna","Patan",3,R.drawable.ic_menu_camera));

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
        myListView1 = rootView.findViewById(R.id.myListView1);
        adapter = new CustomListAdapter(this.getContext(), foodList);
        myListView1.setAdapter(adapter);

        return rootView;
    }

}
