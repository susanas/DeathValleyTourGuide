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
        hikes.add(new InfoObject("Mesquite Flat Sand Dunes",
                "- Hike through the largest dune field in the park to summit the high " +
                        "dune in the distance.",
                "- Easy hike.  2 mile, roundtrip on paved road.",
                "- Distance from Furnace Creek: 21 mi",
                "- Elevation Gain: 185 feet",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200"));
        hikes.add(new InfoObject("Golden Canyon",
                "- Colorful canyons carved through golden hills.",
                "- Moderate hike.  2.7 mile, roundtrip on paved road.",
                "- Distance from Furnace Creek: 5 mi",
                "- Elevation Gain: 535 feet",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200"));
        hikes.add(new InfoObject("Natural Bridge",
                "- Hike up dramatic canyon to a natural bridge formation.",
                "- Easy hike.  1 mile, roundtrip.",
                "- Distance from Furnace Creek: 11 mi",
                "- Elevation Gain: 180 feet",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200"));
        hikes.add(new InfoObject("Badwater Salt Flats",
                "- Scenic walk to the edge of the salt marsh and lowest point in North America.",
                "- Easy hike.  1 mile, roundtrip.",
                "- Distance from Furnace Creek: 17 mi",
                "- Elevation Gain: flat",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200"));
        hikes.add(new InfoObject("Salt Creek InterpretiveTrail",
                "- Wooden boardwalk through salt marsh and rare pupfish habitat.  " +
                        "Pupfish can usually be seen in the spring.",
                "- Easy hike.  0.5 mile, roundtrip.",
                "- Distance from Furnace Creek: 12 mi",
                "- Elevation Gain: flat",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200"));

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
