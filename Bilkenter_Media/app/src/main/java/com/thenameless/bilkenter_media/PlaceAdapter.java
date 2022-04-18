package com.thenameless.bilkenter_media;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Placeholder;
import androidx.recyclerview.widget.RecyclerView;

import com.thenameless.bilkenter_media.databinding.RecyclerHelperBinding;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceHolder> {
    ArrayList<Place> placeArrayList;
    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerHelperBinding binding = RecyclerHelperBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PlaceHolder(binding);
    }

    /**
     * After the place class this one will be written
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return placeArrayList.size();
    }

    class PlaceHolder extends RecyclerView.ViewHolder{
        RecyclerHelperBinding binding;
        public PlaceHolder(RecyclerHelperBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}