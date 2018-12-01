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
public class SitesFragment extends Fragment {

    public SitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create a list of Info (objects)
        final ArrayList<InfoObject> sites = new ArrayList<InfoObject>();
        sites.add(new InfoObject(getString(R.string.site1a), getString(R.string.site1b),
                getString(R.string.site1c), getString(R.string.site1d),
                getString(R.string.site1e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h), R.drawable.saltflats));
        sites.add(new InfoObject(getString(R.string.site2a), getString(R.string.site2b),
                getString(R.string.site2c), getString(R.string.site2d),
                getString(R.string.campground3e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h), R.drawable.artist));
        sites.add(new InfoObject(getString(R.string.site3a), getString(R.string.site3b),
                getString(R.string.site3c), getString(R.string.site3d),
                getString(R.string.site3e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h), R.drawable.dante));
        sites.add(new InfoObject(getString(R.string.site4a), getString(R.string.site4b),
                getString(R.string.site4c), getString(R.string.site4d),
                getString(R.string.site4e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h), R.drawable.sanddunes));
        sites.add(new InfoObject(getString(R.string.site5a), getString(R.string.site5b),
                getString(R.string.site5c), getString(R.string.site5d),
                getString(R.string.site5e), getString(R.string.hike1f),
                getString(R.string.hike1g), getString(R.string.hike1h), R.drawable.zabriskie));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link Info Object}s. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), sites, R.color.category_sites);

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