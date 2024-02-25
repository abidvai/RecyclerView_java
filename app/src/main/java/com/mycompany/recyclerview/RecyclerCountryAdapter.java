package com.mycompany.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCountryAdapter extends RecyclerView.Adapter<RecyclerCountryAdapter.ViewHolder> {

    Context contex;
    ArrayList<CountryInfo> contryInfo;

    RecyclerCountryAdapter(Context contex,ArrayList<CountryInfo> contryInfo){
        this.contex = contex;
        this.contryInfo = contryInfo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contex).inflate(R.layout.card_design,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.countryImage.setImageResource(contryInfo.get(position).countryimage);
        holder.txtcountryName.setText(contryInfo.get(position).countryName);
        holder.txtcountruDetails.setText(contryInfo.get(position).CountryDetails);
    }

    @Override
    public int getItemCount() {
        return contryInfo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtcountryName, txtcountruDetails;
        ImageView countryImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtcountryName = itemView.findViewById(R.id.countryName);
            txtcountruDetails = itemView.findViewById(R.id.countryDetails);
            countryImage = itemView.findViewById(R.id.CountryImage);
        }
    }
}
