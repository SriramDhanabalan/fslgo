package com.newage.fx.finance.domain.convertor;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)  // This will apply the converter to any entity using JsonArray
public class JsonArrayConverter implements AttributeConverter<JsonArray, String> {

    private static final Gson gson = new Gson();

    @Override
    public String convertToDatabaseColumn(JsonArray attribute) {
        // Convert the JsonArray to a JSON string to be stored in the database
        return attribute == null ? null : gson.toJson(attribute);
    }

    @Override
    public JsonArray convertToEntityAttribute(String dbData) {
        // Convert the JSON string from the database back to a JsonArray
        return dbData == null ? null : gson.fromJson(dbData, JsonArray.class);
    }
}
