package com.sdc.gcoej.destinations.description;

/**
 * Created by Team SDC on 20/03/18.
 */

public interface FinalCityInfoView {
    void onPause();
    void onResume();
    void onStart();
    void onStop();
    void showProgress();
    void dismissProgress();
    void parseResult(String description, String iconUrl, String temp, String humidity, String weatherInfo,
                     String lat, String lon);
}
