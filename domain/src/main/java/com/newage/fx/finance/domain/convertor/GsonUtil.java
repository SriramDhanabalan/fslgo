package com.newage.fx.finance.domain.convertor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

public class GsonUtil {

    private static Gson gson = null;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new GsonDateDeSerializer());
        gson = builder.create();
    }

    public static Gson getGson() {
        return gson;
    }
}