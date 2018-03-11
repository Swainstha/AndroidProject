package com.example.swain.androidtablayouttest;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by swain on 3/5/18.
 */

public class DetailListAdapter extends ArrayAdapter<FoodInfo> {

    Context context;
    private ArrayList<FoodInfo> foodInfo;

    // View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView description;
        ImageView picture;
    }

    public DetailListAdapter(@NonNull Context context, ArrayList<FoodInfo> list) {
        super(context, 0, list);
        this.context = context;
        this.foodInfo = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // to add a custom view..

        DetailListAdapter.ViewHolder viewHolder;
        FoodInfo foodInfo= getItem(position);
        final View result;

        if(convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.detail_item_layout, parent, false);

            viewHolder = new DetailListAdapter.ViewHolder();

            viewHolder.name = convertView.findViewById(R.id.detail_food_name);
            viewHolder.description = convertView.findViewById(R.id.detail_food_des);
            viewHolder.picture = convertView.findViewById(R.id.detail_food_image);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (DetailListAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.name.setText(foodInfo.getFoodName());
        viewHolder.description.setText(foodInfo.getFoodDescription());
        viewHolder.picture.setImageResource(foodInfo.getFoodPictureID());

        // making view clickable
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DetailListAdapter.ViewHolder v = (DetailListAdapter.ViewHolder)view.getTag();
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("id", info.id);
//                context.startActivity(intent);

            }
        });
        return convertView;
    }
}
