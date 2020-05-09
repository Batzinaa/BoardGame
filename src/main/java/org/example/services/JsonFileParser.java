package org.example.services;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;


import java.io.*;
import java.util.ArrayList;

public class JsonFileParser {
    //TODO: develop logic for seting up board, mainly parsing data from json to create board
    private JsonObject gameConfig = new JsonObject();

    public void readFromJson(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            JsonReader jsonReader = new JsonReader(fileReader);

            JsonObject response = JsonParser.parseReader(jsonReader).getAsJsonObject();
            JsonObject root = response.getAsJsonObject("game configuration");
            jsonReader.close();

            parseFromJson(root);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void parseFromJson(JsonObject jsonObject) {
        this.gameConfig = jsonObject;
        JsonArray specialSquareArray = jsonObject.getAsJsonArray("squares");

    }


    public int getNumberOfSquares() {
        int number_of_squares = gameConfig.get("number of squares").getAsInt();
        return number_of_squares;
    }

    public ArrayList<String> getPlayerNames(){
        JsonArray arr = gameConfig.getAsJsonArray("player names");
        ArrayList<String> players = new ArrayList<>();
        for (int i = 0; i< arr.size(); i++){
            players.add(arr.get(i).toString());
        }
        return players;
    }
}

