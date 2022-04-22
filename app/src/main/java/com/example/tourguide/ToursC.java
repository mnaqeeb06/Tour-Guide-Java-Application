package com.example.tourguide;

public class ToursC {
    private String mPlaceName;

    private String mPlaceDetail;

    private String mPlaceLocation;

    private  String mPrice;

    private int mImageResourceId;

    public ToursC(String PlaceName, String PlaceDetail, String PlaceLocation, String Price, int ImageResourceId) {
        mPlaceName = PlaceName;
        mPlaceDetail = PlaceDetail;
        mPlaceLocation = PlaceLocation;
        mPrice = Price;
        mImageResourceId = ImageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceDetail() {
        return mPlaceDetail;
    }

    public String getmPlaceLocation() {
        return mPlaceLocation;
    }

    public String getmPrice() {
        return mPrice;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
