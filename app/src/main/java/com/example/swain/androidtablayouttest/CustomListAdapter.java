package com.example.swain.androidtablayouttest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by swain on 3/1/18.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    Context context;

    public CustomListAdapter(@NonNull Context context, ArrayList<String> list) {
        super(context, 0, list);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // to add a custom view..
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null);
        //parent defined chhaina so null(mathi)
        TextView username = view.findViewById(R.id.username);
        TextView address = view.findViewById(R.id.address);
        ImageView image = view.findViewById(R.id.profile_image);

        // making view clickable
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("id", info.id);
//                context.startActivity(intent);
            }
        });
        return view;
    }
}
