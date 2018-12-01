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
        services.add(new InfoObject(getString(R.string.service1a), "",
                getString(R.string.service1b), "",
                getString(R.string.service1c), "",
                getString(R.string.service1d), ""));
        services.add(new InfoObject(getString(R.string.service2a), "",
                getString(R.string.service2b), "",
                getString(R.string.service2c), "",
                getString(R.string.service1d), ""));
        services.add(new InfoObject(getString(R.string.service3a), "",
                getString(R.string.service3b), "",
                getString(R.string.service2c), "",
                getString(R.string.service1d), ""));
        services.add(new InfoObject(getString(R.string.service4a), "",
                getString(R.string.service3b), "",
                getString(R.string.service4c), "",
                getString(R.string.service1d), ""));
        services.add(new InfoObject(getString(R.string.service5a), "",
                getString(R.string.service5b), "",
                getString(R.string.service5c), "",
                getString(R.string.service1d), ""));

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