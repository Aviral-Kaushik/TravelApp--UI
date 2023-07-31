package com.aviral.travel.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.travel.Model.PopularPlaces;
import com.aviral.travel.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PopularPlacesAdapter extends RecyclerView.Adapter<PopularPlacesAdapter.ViewHolder> {

    private final ArrayList<PopularPlaces> popularPlaces;

    public PopularPlacesAdapter(ArrayList<PopularPlaces> popularPlaces) {
        this.popularPlaces = popularPlaces;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_snippet_popular_destination_recycler_view,
                parent,
                false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.city.setText(popularPlaces.get(position).getCity());
        holder.country.setText(popularPlaces.get(position).getPlace());

        Glide.with(holder.itemView.getContext())
                .load(popularPlaces.get(position).getImage())
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return popularPlaces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView city;
        private TextView country;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            city = itemView.findViewById(R.id.city);
            country = itemView.findViewById(R.id.country);

        }
    }

}
