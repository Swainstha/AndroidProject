package com.example.swain.androidtablayouttest;

import android.content.Context;
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
 * Created by swain on 3/1/18.
 */

public class CustomListAdapter extends ArrayAdapter<RestaurantInfo> {

    Context context;
    private ArrayList<RestaurantInfo> resInfo;

    // View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView address;
        RatingBar ratingBar;
        ImageView picture;
    }

    public CustomListAdapter(@NonNull Context context, ArrayList<RestaurantInfo> list) {
        super(context, 0, list);
        this.context = context;
        this.resInfo = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // to add a custom view..

        ViewHolder viewHolder;
        RestaurantInfo resInfo = getItem(position);
        final View result;

        if(convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.item_layout, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.name = convertView.findViewById(R.id.resName);
            viewHolder.address = convertView.findViewById(R.id.resAddress);
            viewHolder.picture = convertView.findViewById(R.id.resImage);
            viewHolder.ratingBar = convertView.findViewById(R.id.ratingBar);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.name.setText(resInfo.getName());
        viewHolder.address.setText(resInfo.getAddress());
        viewHolder.ratingBar.setMax(5);
        viewHolder.ratingBar.setRating(resInfo.getRating());
        viewHolder.picture.setImageResource(resInfo.getImageID());

        // making view clickable
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("id", info.id);
//                context.startActivity(intent);

                ViewHolder v = (ViewHolder)view.getTag();

            }
        });
        return convertView;
    }
}
