package com.example.swain.androidtablayouttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by swain on 3/5/18.
 */

public class DetailActivity extends AppCompatActivity{

    private ListView myListViewFood;
    private DetailListAdapter foodAdapter;
    TabLayout tabLayout;
    ImageView myImageView;
    TextView myResName;
    TextView myResLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myImageView = findViewById(R.id.detail_res_image);
        myResName = findViewById(R.id.detail_res_name);
        myResLoc = findViewById(R.id.detail_res_loc);

        Intent intent = getIntent();
        myResName.setText(intent.getStringExtra("name"));
        myResLoc.setText(intent.getStringExtra("location"));
        myImageView.setImageResource(R.drawable.wall);

        tabLayout = findViewById(R.id.resTabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Popular").setIcon(R.drawable.trending_up_black));
        tabLayout.addTab(tabLayout.newTab().setText("Near Me").setIcon(R.drawable.near_me_black));
        tabLayout.addTab(tabLayout.newTab().setText("Favourites").setIcon(R.drawable.favorite_black));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.resPager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.getTabAt(position).select();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
