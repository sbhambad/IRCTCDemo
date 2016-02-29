package com.zuneeue.irctcinfo;

import android.app.Application;

import com.zuneeue.irctcinfo.Services.RailwayService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pratikgadekar on 2/29/16.
 */
public class AppController extends Application {

    private static AppController mInstance;
    public static RailwayService railwayService;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.railwayapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        railwayService = retrofit.create(RailwayService.class);
    }

    public static synchronized AppController getInstance() {
        return mInstance;
    }
}
