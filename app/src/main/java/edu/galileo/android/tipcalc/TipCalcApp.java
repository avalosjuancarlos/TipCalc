package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by avalo.
 */
public class TipCalcApp extends Application {
    private static final String ABOUT_URL = "https://about.me/adriancatalan";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
