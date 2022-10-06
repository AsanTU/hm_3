package com.example.hm_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdressAdapter<AdressViewHolder> extends RecyclerView.Adapter<AdressViewHolder> {
    private ArrayList<String> adresss = new ArrayList<>();

    public AdressAdapter(ArrayList<String> adresss) {
        this.adresss = adresss;
    }

    @NonNull
    @Override
    public AdressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adres,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdressViewHolder holder, int position) {
        holder.blic(adresss.get(position));

    }

    @Override
    public int getItemCount() {
        return adresss.size();
    }
}
