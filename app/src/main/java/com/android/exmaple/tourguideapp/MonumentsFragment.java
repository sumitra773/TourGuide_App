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

public class MonumentsFragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<InfoDetailed> mInfoDetailed;

    public MonumentsFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup conrainer,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_list,conrainer,false);

        mInfoDetailed = new ArrayList<InfoDetailed>();

        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.statu_name),R.drawable.place,
                getResources().getString(R.string.statu_phone),getResources().getString(R.string.statu_address),
                getResources().getString(R.string.statu_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.tajmahal_name),R.drawable.place1,
                getResources().getString(R.string.tajmahal_phone),getResources().getString(R.string.tajmahal_address),
                getResources().getString(R.string.tajmahal_overview)));


        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.kanhaeri_name),R.drawable.place2,
                getResources().getString(R.string.kanhaeri_phone),getResources().getString(R.string.kanhaeri_address),
                getResources().getString(R.string.kanhaeri_overview)));

        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.waterkingdom_name),R.drawable.place3,
                getResources().getString(R.string.waterkingdom_phone),getResources().getString(R.string.waterkingdom_address),
                getResources().getString(R.string.waterkingdom_overview)));

        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.sightseeing_name),R.drawable.place4,
                getResources().getString(R.string.sightseeing_phone),getResources().getString(R.string.sightseeing_address),
                getResources().getString(R.string.sightseeing_overview)));

        mInfoDetailed.add(new InfoDetailed(getResources().getString(R.string.market_name),R.drawable.place5,
                getResources().getString(R.string.market_phone),getResources().getString(R.string.market_address),
                getResources().getString(R.string.market_overview)));

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
