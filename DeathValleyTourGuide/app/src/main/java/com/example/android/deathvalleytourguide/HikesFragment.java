package com.example.android.deathvalleytourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HikesFragment extends Fragment {

    public HikesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create a list of Info (objects)
        final ArrayList<InfoObject> hikes = new ArrayList<InfoObject>();
        hikes.add(new InfoObject(getString(R.string.hike1a), getString(R.string.hike1b),
                getString(R.string.hike1c), getString(R.string.hike1d),
                getString(R.string.hike1e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h)));
        hikes.add(new InfoObject(getString(R.string.hike2a), getString(R.string.hike2b),
                getString(R.string.hike2c), getString(R.string.hike2d),
                getString(R.string.hike2e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h)));
        hikes.add(new InfoObject(getString(R.string.hike3a), getString(R.string.hike3b),
                getString(R.string.hike3c), getString(R.string.hike3d),
                getString(R.string.hike3e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h)));
        hikes.add(new InfoObject(getString(R.string.hike4a), getString(R.string.hike4b),
                getString(R.string.hike3c), getString(R.string.hike4d),
                getString(R.string.hike4e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h)));
        hikes.add(new InfoObject(getString(R.string.hike5a), getString(R.string.hike5b),
                getString(R.string.hike5c), getString(R.string.hike5d),
                getString(R.string.hike4e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h)));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link Info Object}s. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), hikes, R.color.category_hikes);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Info} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
