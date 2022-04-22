package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<ToursC> AL =  new ArrayList<ToursC>();
        AL.add(new ToursC("Gilgit", "North Of Pakistan", "Gilgit, Pakistan","$ 120",R.drawable.mountain));
        AL.add(new ToursC("Hunza", "South Of Pakistan", "Hunza, , Pakistan","$ 90",R.drawable.tryimages));
        AL.add(new ToursC("Kashmir", "West Of Pakistan", "Kashmir, Pakistan","$ 190",R.drawable.images1));
        AL.add(new ToursC("Lahore", "North Of Pakistan", "Lahore, punjab, Pakistan","$ 100",R.drawable.lah));
        AL.add(new ToursC("Hunza", "East Of Pakistan", "Hunza, Pakistan","$ 80",R.drawable.hunza));


        ListView listView = (ListView) findViewById(R.id.list);
        TourAdapter adapter = new TourAdapter(this,AL);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ToursC currentTour = adapter.getItem(position);
                String location = currentTour.getmPlaceLocation();

                Uri IntentUri = Uri.parse("geo:0,0?q= "+location);

                // intent
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, IntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });


    }
}