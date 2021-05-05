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

public class HotelsFragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<InfoDetailed> mInfoDetailed;

    public HotelsFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        mInfoDetailed = new ArrayList<InfoDetailed>();

        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.hotel_one_name), R.drawable.hotel_one,
                getResources().getString(R.string.hotel_one_phone), getResources().getString(R.string.hotel_one_address),
                getResources().getString(R.string.hotel_one_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.hotel_two_name), R.drawable.hotel_two,
                getResources().getString(R.string.hotel_two_phone), getResources().getString(R.string.hotel_two_address),
                getResources().getString(R.string.hotel_two_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.hotel_three_name), R.drawable.hotel_three,
                getResources().getString(R.string.hotel_three_phone), getResources().getString(R.string.hotel_three_address),
                getResources().getString(R.string.hotel_three_overview)));



        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.hotel_four_name), R.drawable.hotel_four,
                getResources().getString(R.string.hotel_four_phone), getResources().getString(R.string.hotel_four_address),
                getResources().getString(R.string.hotel_four_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.hotel_five_name), R.drawable.hotel_five,
                getResources().getString(R.string.hotel_five_phone), getResources().getString(R.string.hotel_five_address),
                getResources().getString(R.string.hotel_five_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.hotel_six_name), R.drawable.hotel_six,
                getResources().getString(R.string.hotel_six_phone), getResources().getString(R.string.hotel_six_address),
                getResources().getString(R.string.hotel_six_overview)));

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
