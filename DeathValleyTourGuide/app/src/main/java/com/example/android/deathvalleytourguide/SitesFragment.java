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
        sites.add(new InfoObject("Badwater Basin",
                "- The lowest dry point in North America, at 282 ft below sea level.  " +
                        "A surreal landscape of vast salt flats.",
                "- Walking Required? Optional. 2 miles, " +
                        "roundtrip to reach the salt flats.",
                "- Distance from Furnace Creek: 17 mi",
                "- Elevation: 282 feet below sea level",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200", R.drawable.saltflats));
        sites.add(new InfoObject("Artists Drive",
                "- A scenic loop drive through multi-hued hills.  " +
                        "The 9 mile drive is on a one-way road.",
                "- Walking Required?  Optional.  " +
                        "Short walk at Artists Palette to get a closer look.",
                "- Distance from Furnace Creek: 8.5 mi",
                "- Elevation: sea level",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200", R.drawable.artist));
        sites.add(new InfoObject("Dantes View",
                "- Breathtaking viewpoint over 5,000 ft above Death Valley.",
                "- Walking Required?  No.",
                "- Distance from Furnace Creek: 25 mi",
                "- Elevation: 5,500 feet above sea level",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200", R.drawable.dante));
        sites.add(new InfoObject("Mesquite Flat Sand Dunes ",
                "- Tawny dunes as high as 100 ft",
                "- Walking Required?  Optional. 1-2 miles, " +
                        "roundtrip depending how many sand dunes you want to explore.",
                "- Distance from Furnace Creek: 22 mi",
                "- Elevation: 170 above sea level",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200", R.drawable.sanddunes));
        sites.add(new InfoObject("Zabriskie Point",
                "- Golden colors of hills and mountains nearby.  " +
                        "Great spot for sunrise.",
                "- Walking Required?  0.5 mile, roundtrip on paved road.",
                "- Distance from Furnace Creek: 0.5 mi",
                "- Elevation: 713 feet above sea level",
                "- Open: 24 hours, no camping",
                "- Fee: Included w/Park entrance pass",
                "- Phone number: (760) 786-3200", R.drawable.zabriskie));

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