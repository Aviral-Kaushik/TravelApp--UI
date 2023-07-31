package com.aviral.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.travel.Adapter.PopularPlacesAdapter;
import com.aviral.travel.Model.PopularPlaces;
import com.aviral.travel.databinding.ActivityTravelBinding;

import java.util.ArrayList;

public class TravelActivity extends AppCompatActivity {

    private ActivityTravelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTravelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.cl.setOnClickListener(view -> startActivity(new Intent(this, BookingActivity.class)));

        setUpAdapter();
    }

    private void setUpAdapter() {

        ArrayList<PopularPlaces> popularPlaces = new ArrayList<>();

        popularPlaces.add(new PopularPlaces(
                R.drawable.ic_paris,
                "Paris",
                "France"
        ));
        popularPlaces.add(new PopularPlaces(
                R.drawable.ic_rome,
                "Rome",
                "Italy"
        ));
        popularPlaces.add(new PopularPlaces(
                R.drawable.ic_istanbul,
                "Istanbul",
                "Turkey"
        ));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.HORIZONTAL, false
        );

        PopularPlacesAdapter popularPlacesAdapter = new PopularPlacesAdapter(popularPlaces);

        binding.popularDestinationRecyclerView.setLayoutManager(linearLayoutManager);

        binding.popularDestinationRecyclerView.setAdapter(popularPlacesAdapter);

    }
}