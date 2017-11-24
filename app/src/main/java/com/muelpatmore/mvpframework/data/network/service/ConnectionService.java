package com.muelpatmore.mvpframework.data.network.service;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Samuel on 24/11/2017.
 */

public class ConnectionService {
    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;

    //ToDo Replace temorary vatiable for APIs base URL
    private static String x;

    public static RequestInterface getServerConnection() {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                // Adapter factor required to display data in RecyclerView
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(x)
                .build();
        return retrofit.create(RequestInterface.class);
    }
}
