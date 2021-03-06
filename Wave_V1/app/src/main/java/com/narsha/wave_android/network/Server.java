package com.narsha.wave_android.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Server {
    private static Server instance;
    private ServerAPI api;
    private Server() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.80.163.112:8081/Wave_backend/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(ServerAPI.class);
    }

    public static Server getInstance() {
        if (instance == null) instance = new Server();
        return instance;
    }

    public ServerAPI getApi() {
        return api;
    }
}

