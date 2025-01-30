package com.newage.fx.finance.domain.util;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GsonDateDeSerializer implements JsonDeserializer<Date> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String dateString = json.getAsString();
        try {
            return dateFormat.parse(dateString);
        } catch (Exception e) {
            throw new JsonParseException("Unable to parse date: " + dateString, e);
        }
    }
}
