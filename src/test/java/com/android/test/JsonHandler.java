package com.android.test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonHandler {
    private ObjectMapper objectMapper;
    private JsonNode jsonNode;

    public JsonHandler(String path) {
        this.objectMapper = new ObjectMapper();
        try {
            this.jsonNode = objectMapper.readTree(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getStrFromJson(String key) {
        return jsonNode.get(key).asText();
    }
}
