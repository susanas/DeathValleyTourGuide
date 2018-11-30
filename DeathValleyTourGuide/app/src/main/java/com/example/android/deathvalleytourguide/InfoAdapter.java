package com.example.android.deathvalleytourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * {@link InfoAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Info} objects.
 */

public class InfoAdapter extends ArrayAdapter<InfoObject> {
    /**
     * Create a new {@link InfoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param infoObjects is the list of {@link InfoObject}s to be displayed.
     */
    private int mInfoResourceID;

    public InfoAdapter(Context context,
                       ArrayList<InfoObject> infoObjects,
                       int infoResourceID) {
        super(context, 0, infoObjects);
        mInfoResourceID = infoResourceID;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link InfoObject} object located at this position in the list
        InfoObject currentInfo = getItem(position);

        ImageView infoImageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image for the InfoObject
        if (currentInfo.hasImage()) {
            //Set the ImageView to the image resource specified in the current info object
            infoImageView.setImageResource(currentInfo.getImageResourceID());
            //Make sure the view is visible
            infoImageView.setVisibility(View.VISIBLE);
        } else {
            infoImageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.inner_vertical);
        //Find the color the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mInfoResourceID);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView descriptorTextView = (TextView) listItemView.findViewById
                (R.id.descriptor_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        descriptorTextView.setText(currentInfo.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descriptionTextView = (TextView) listItemView.findViewById
                (R.id.description_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        descriptionTextView.setText(currentInfo.getDescription());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView walkrequiredTextView = (TextView) listItemView.findViewById
                (R.id.walkreq_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        walkrequiredTextView.setText(currentInfo.getWalkingDistance());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView distanceFurnaceCreekTextView = (TextView) listItemView.findViewById
                (R.id.distance_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        distanceFurnaceCreekTextView.setText(currentInfo.getDistanceFurnaceCreek());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView elevationTextView = (TextView) listItemView.findViewById(R.id.elevation_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        elevationTextView.setText(currentInfo.getElevation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView opentimesTextView = (TextView) listItemView.findViewById(R.id.opentimes_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        opentimesTextView.setText(currentInfo.getOpenTimes());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView feeTextView = (TextView) listItemView.findViewById(R.id.fee_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        feeTextView.setText(currentInfo.getFee());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        // Get the info from Info Object and
        // set this text on the TextView in list_item
        phoneTextView.setText(currentInfo.getPhoneNumber());

        // Return the whole list item layout (containing 5 TextViews and (if available) ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}