package com.example.tourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TourAdapter extends ArrayAdapter<ToursC> {

    public TourAdapter(Activity context, ArrayList<ToursC> TourArrayList) {
        super(context,0,TourArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_itemview,parent,false);
        }

        ToursC currentTour = getItem(position);

        TextView placename_TW = (TextView) listItemView.findViewById(R.id.placeNameTW);
        placename_TW.setText(currentTour.getmPlaceName());

        TextView placeDetail_TW = (TextView) listItemView.findViewById(R.id.placeDetailTW);
        placeDetail_TW.setText(currentTour.getmPlaceDetail());

        TextView price_TW = (TextView) listItemView.findViewById(R.id.priceTW);
        price_TW.setText(currentTour.getmPrice());

        TextView location_TW = (TextView) listItemView.findViewById(R.id.locationTW);
        location_TW.setText(currentTour.getmPlaceLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.main_imageTW);
        imageView.setImageResource(currentTour.getmImageResourceId());


        return listItemView;
    }
}
