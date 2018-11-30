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
        campsites.add(new InfoObject("Furnace Creek Campground",
                "- Reservations recommended: mid-Oct to mid-Apr.",
                "- Reservations must be made 4 days ahead and up to " +
                        "6 months in advance",
                "- No Reservations needed: mid-Apr to mid-Oct",
                "- #/Campsites: 150",
                "- Open: All Year",
                "- Elevation: 196 feet below sea level",
                "- Fee per night: $22-36"));
        campsites.add(new InfoObject("Sunset Campground",
                "- No Reservations needed.",
                "- #/Campsites: 270",
                "- Open: mid-Oct to mid-Apr",
                "- Elevation: 196 feet below sea level",
                "- Flush toilets & water",
                "- Fire pits and tables",
                "Fee per night: $14"));
        campsites.add(new InfoObject("Texas Springs Campground",
                "- No Reservations needed.",
                "- #/Campsites: 92",
                "- Open: mid-Oct to mid-May",
                "- Elevation: sea level",
                "- Flush toilets & water",
                "- Fire pits and tables",
                "- Fee per night: $16"));
        campsites.add(new InfoObject("Stove Pipe Wells Campground",
                "- No Reservations needed.",
                "- #/Campsites: 190",
                "- Open: mid-Sep to mid-May",
                "- Elevation: sea level",
                "- Flush toilets & water",
                "- Fire pits and tables",
                "- Fee per night: $14"));
        campsites.add(new InfoObject("Mesquite Spring Campground",
                "- No Reservations needed.",
                "- #/Campsites: 40",
                "- Open: All Year",
                "- Elevation: 1,800 feet above sea level",
                "- Flush toilets & water",
                "- Fire pits and tables",
                "- Fee per night: $14"));

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