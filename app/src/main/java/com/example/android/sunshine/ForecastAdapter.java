package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wojtekkurylo on 16.08.2017.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);

            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);

        }
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View forecastRowView = inflater.inflate(R.layout.forecast_list_item,parent,false);
        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(forecastRowView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {

        TextView textView = holder.mWeatherTextView;
        textView.setText(mWeatherData[position]);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null || mWeatherData.length == 0)
        {
            return 0;
        } else {
            return mWeatherData.length;
        }
    }


}
