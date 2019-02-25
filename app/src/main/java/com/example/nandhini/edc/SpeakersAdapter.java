package com.example.nandhini.edc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class SpeakersAdapter extends ArrayAdapter<SpeakerItems> {

    ImageView imgview;
    TextView txtview;

    public SpeakersAdapter(Activity context, ArrayList<SpeakerItems> Items) {
        super(context,0,Items);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.speakers_items,parent,false);
        }

        SpeakerItems currentItem = getItem(position);

        imgview = (ImageView) listItemView.findViewById(R.id.dp);

        Glide
                .with(getContext())
                .load(currentItem.getImgId())
                //.apply(RequestOptions.circleCropTransform())
                .into(imgview);

        txtview = listItemView.findViewById(R.id.nameview);
        txtview.setText(currentItem.getSname());

        txtview = listItemView.findViewById(R.id.occupationview1);
        txtview.setText(currentItem.getOccupation1());

        txtview = listItemView.findViewById(R.id.occupationview2);
        txtview.setText(currentItem.getOccupation2());

        txtview = listItemView.findViewById(R.id.occupationview3);
        txtview.setText(currentItem.getOccupation3());



        return listItemView;
    }
}
