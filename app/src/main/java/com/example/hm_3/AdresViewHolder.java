package com.example.hm_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class AdressViewHolder extends RecyclerView.ViewHolder{
    private TextView adres;
    public AdressViewHolder(@NonNull View itemView) {
        super(itemView);
        adres = itemView.findViewById(R.id.adress);
    }
    public void blic (String adresValue){
        adres.setText(adresValue);

    }
}
