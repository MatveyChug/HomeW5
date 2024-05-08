package com.example.homew5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Car> cars;

    public CarAdapter(Context context, List<Car> cars){
        this.inflater = LayoutInflater.from(context);
        this.cars = cars;
    }
    @Override
    public CarAdapter.ViewHolder OnCreateViewHolder(ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.car_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Car car = cars.get(position);
        holder.carView.setImageResource(car.getCarResource());
        holder.nameView.setText(car.getName());
        holder.carDecriptionView.setText(car.setCarDescription());
    }
    @Override
    public int getItemCount(){
        return cars.size();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    }
    @Override
    public int getItemCount() {
        return 0;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView carView;
        final TextView nameView, carDecriptionView;


        ViewHolder(View view){
            super(view);
            carView = view.findViewById(R.id.carResourse);
            nameView = view.findViewById(R.id.name);
            carDecriptionView = view.findViewById(R.id.carDescription);
        }
    }

}
