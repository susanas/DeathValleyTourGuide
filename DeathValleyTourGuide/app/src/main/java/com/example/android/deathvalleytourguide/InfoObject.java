package com.example.android.deathvalleytourguide;

/*
    These categories include this data object info:
        — 1 Sites
        — 2 Hikes
        — 3 Campgrounds
        — 4 Services
*/

public class InfoObject {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String tName;
    private String tDescription;
    private String tOpenTimes;
    private String tWalkingDistance;
    private String tDistanceFurnaceCreek;
    private String tElevation;
    private String tFee;
    private String tPhoneNumber;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    public InfoObject(String Name, String Description, String WalkingDistance,
                      String DistanceFurnaceCreek, String Elevation, String OpenTimes,
                      String Fee, String PhoneNumber, int ImageResourceID) {
        tName = Name;
        tDescription = Description;
        tWalkingDistance = WalkingDistance;
        tDistanceFurnaceCreek = DistanceFurnaceCreek;
        tElevation = Elevation;
        tOpenTimes = OpenTimes;
        tFee = Fee;
        tPhoneNumber = PhoneNumber;
        mImageResourceID = ImageResourceID;
    }

    public InfoObject(String Name, String Description, String WalkingDistance,
                      String DistanceFurnaceCreek, String Elevation, String OpenTimes,
                      String Fee, String PhoneNumber) {
        tName = Name;
        tDescription = Description;
        tWalkingDistance = WalkingDistance;
        tDistanceFurnaceCreek = DistanceFurnaceCreek;
        tElevation = Elevation;
        tOpenTimes = OpenTimes;
        tFee = Fee;
        tPhoneNumber = PhoneNumber;
    }

    public String getName() {
        return tName;
    }

    public String getDescription() {
        return tDescription;
    }

    public String getOpenTimes() {
        return tOpenTimes;
    }

    public String getWalkingDistance() {
        return tWalkingDistance;
    }

    public String getDistanceFurnaceCreek() {
        return tDistanceFurnaceCreek;
    }

    public String getElevation() {
        return tElevation;
    }

    public String getFee() {
        return tFee;
    }

    public String getPhoneNumber() {
        return tPhoneNumber;
    }

    public int getImageResourceID() {
        return mImageResourceID;

    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}