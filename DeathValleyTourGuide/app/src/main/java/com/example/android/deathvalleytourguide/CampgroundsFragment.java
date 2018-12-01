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
public class CampgroundsFragment extends Fragment {

    public CampgroundsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create a list of info (objects)
        final ArrayList<InfoObject> campsites = new ArrayList<InfoObject>();
        campsites.add(new InfoObject(getString(R.string.campground1a), getString(R.string.campground1b),
                getString(R.string.campground1c), getString(R.string.campground1d),
                getString(R.string.campground1e), getString(R.string.campground1f),
                getString(R.string.campground1g), getString(R.string.campground1h)));
        campsites.add(new InfoObject(getString(R.string.campground2a), getString(R.string.campground2b),
                getString(R.string.campground2c), getString(R.string.campground2d),
                getString(R.string.campground2e), getString(R.string.campground2f),
                getString(R.string.campground2g), getString(R.string.campground2h)));
        campsites.add(new InfoObject(getString(R.string.campground3a), getString(R.string.campground2b),
                getString(R.string.campground3c), getString(R.string.campground3d),
                getString(R.string.campground3e), getString(R.string.campground2f),
                getString(R.string.campground2g), getString(R.string.campground3h)));
        campsites.add(new InfoObject(getString(R.string.campground4a), getString(R.string.campground2b),
                getString(R.string.campground4c), getString(R.string.campground4d),
                getString(R.string.campground3e), getString(R.string.campground2f),
                getString(R.string.campground2g), getString(R.string.campground2h)));
        campsites.add(new InfoObject(getString(R.string.campground5a), getString(R.string.campground2b),
                getString(R.string.campground5c), getString(R.string.campground1f),
                getString(R.string.campground5e), getString(R.string.campground2f),
                getString(R.string.campground2g), getString(R.string.campground2h)));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link Info Object}s. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), campsites, R.color.category_campgrounds);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Info} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}