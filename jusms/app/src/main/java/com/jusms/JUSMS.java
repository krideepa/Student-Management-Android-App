package com.jusms;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.jusms.misc.utils.Extras;


/**
 * Created by Ambuj on 20/11/2018.
 */

public class JUSMS extends Application {

    private static JUSMS istance;
    private Extras pref;

    @Override
    public void onCreate() {
        super.onCreate();
        istance = this;
        AndroidNetworking.initialize(this);
        pref = new Extras(this);
        pref.setrollNo(80);
    }

    /**
     * Instance of this class
     * @return
     */
    public static JUSMS getInstance() {
        return istance;
    }

}

