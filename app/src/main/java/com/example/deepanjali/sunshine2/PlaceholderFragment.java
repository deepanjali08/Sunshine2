package com.example.deepanjali.sunshine2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deepanjali on 3/8/16.
 */
public class PlaceholderFragment extends Fragment {

    List<String> weekForecast;
    ArrayAdapter<String> mForecastAdapter;
    String [] forecastArray= new String[]{"Today","Foggy","Cloudy","Rainy","Foggy","Sunny"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
        View rootview= inflater.inflate(R.layout.fragment_main,container);
//
        weekForecast=new ArrayList<>(Arrays.asList(forecastArray));

        mForecastAdapter=new ArrayAdapter<>(getActivity(),
                R.layout.fragment_main,R.id.list_item_forecast,weekForecast);


        ListView listview=(ListView)rootview.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);

        return rootview;
    }
}
