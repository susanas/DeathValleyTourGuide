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
public class ServicesFragment extends Fragment {

    public ServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create a list of Info (objects)
        final ArrayList<InfoObject> services = new ArrayList<InfoObject>();
        services.add(new InfoObject("National Park Service Visitor Center",
                "",
                "- Open daily, 8am-5pm",
                "",
                "- Phone number: (760) 786-3200",
                "",
                "- Location: Furnace Creek",
                ""));
        services.add(new InfoObject("Indian Tacos & Shaved Ice",
                "",
                "- Open Tuesday - Saturday, 10am-6pm",
                "",
                "- Phone number: (760) 258-2345",
                "",
                "- Location: Furnace Creek, Timbisha Shoshone Village",
                ""));
        services.add(new InfoObject("The Inn at Death Valley Restaurant",
                "",
                "- Open daily, call for times",
                "",
                "- Phone number: (760) 786-2345",
                "",
                "- Location: Furnace Creek",
                ""));
        services.add(new InfoObject("Jeep Rentals & Tours",
                "",
                "- Open daily, call for times",
                "",
                "- Phone number: (760) 786-9872",
                "",
                "- Location: Furnace Creek",
                ""));
        services.add(new InfoObject("Post Office",
                "",
                "- Open: Monday - Friday, 8am-4pm\n" + "   Lobby open 24 hours",
                "",
                "- Closed daily, 1pm-1:30pm",
                "",
                "- Location: Furnace Creek",
                ""));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link Info Object}s. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), services, R.color.category_services);

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