package com.example.nandhini.edc;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GalleryAdapter extends ArrayAdapter<GalleryItems> {

    public GalleryAdapter(Activity Context , ArrayList<GalleryItems> Items) {
        super(Context, 0 , Items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent,false);
        }

        GalleryItems currentItem = getItem(position);

        TextView textview = listItemView.findViewById(R.id.yearid);
        textview.setText(currentItem.getImgStr1());

        ImageView image = (ImageView) listItemView.findViewById(R.id.b1);

       // image.setImageResource(currentItem.getImg1());
        Glide.with(getContext()).load(currentItem.getImg1()).into(image);

        ImageView image2 = (ImageView) listItemView.findViewById(R.id.g1);

       // image2.setImageResource(currentItem.getImg2());
        Glide.with(getContext()).load(currentItem.getImg2()).into(image2);

        ImageView image3 = (ImageView) listItemView.findViewById(R.id.g2);

        //image3.setImageResource(currentItem.getImg3());
        Glide.with(getContext()).load(currentItem.getImg3()).into(image3);

        ImageView image4 = (ImageView) listItemView.findViewById(R.id.g3);

        //image4.setImageResource(currentItem.getImg4());
        Glide.with(getContext()).load(currentItem.getImg4()).into(image4);

        ImageView image5 = (ImageView) listItemView.findViewById(R.id.g4);

        //image5.setImageResource(currentItem.getImg5());

        Glide.with(getContext()).load(currentItem.getImg5()).into(image5);

        return listItemView;
    }
}
