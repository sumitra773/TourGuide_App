package com.android.exmaple.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment implements AdapterView.OnItemClickListener {


    ArrayList<InfoDetailed> mInfoDetailed;

    public RestaurantsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup conrainer,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, conrainer, false);
        mInfoDetailed = new ArrayList<InfoDetailed>();

        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.restaurant_one_name), R.drawable.restaurent_one,
                getResources().getString(R.string.restaurant_one_phone), getResources().getString(R.string.restaurant_one_address),
                getResources().getString(R.string.restaurant_one_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.restaurant_two_name), R.drawable.restaurent_two,
                getResources().getString(R.string.restaurant_two_phone), getResources().getString(R.string.restaurant_two_address),
                getResources().getString(R.string.restaurant_two_overview)));



        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.restaurant_three_name), R.drawable.restaurent_three,
                getResources().getString(R.string.restaurant_three_phone), getResources().getString(R.string.restaurant_three_address),
                getResources().getString(R.string.restaurant_three_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.restaurant_four_name), R.drawable.restaurent_four,
                getResources().getString(R.string.restaurant_four_phone), getResources().getString(R.string.restaurant_four_address),
                getResources().getString(R.string.restaurant_four_overview)));



        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.restaurant_five_name), R.drawable.restaurent_five,
                getResources().getString(R.string.restaurant_five_phone), getResources().getString(R.string.restaurant_five_address),
                getResources().getString(R.string.restaurant_five_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.restaurant_six_name), R.drawable.restaurent_six,
                getResources().getString(R.string.restaurant_six_phone), getResources().getString(R.string.restaurant_six_address),
                getResources().getString(R.string.restaurant_six_overview)));


        TourAdapter mTourAdapter = new TourAdapter(getActivity(), mInfoDetailed);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment_list_view);
        listView.setAdapter(mTourAdapter);
        listView.setOnItemClickListener(this);



        return rootView;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Intent intent = new Intent(getActivity(),InfoDetailedActivity.class);
            intent.putExtra("place_data",mInfoDetailed.get(position));
            startActivity(intent);



    }
}
