package com.sdc.gcoej.destinations.funfacts;

import org.json.JSONArray;

/**
 * Created by Team SDC on 20/03/18.
 */

public interface FunFactsView {
    void showProgressDialog();
    void hideProgressDialog();
    void setupViewPager(JSONArray factsArray);
}
