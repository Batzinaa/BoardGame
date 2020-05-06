package model;

import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ÁddPlayerToJson
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        
        JSONObject paiktesDetails = new JSONObject();
        paiktesDetails.put("names", "Ilias");
        paiktesDetails.put("tetragona", "snake",null,null);
        
         
        JSONObject paiktesObject = new JSONObject(); 
        paiktesObject.put("data", paiktesDetails);
         
        JSONArray paiktesList = new JSONArray();
        paiktesList.add(paiktesObject);
         

        try (FileWriter file = new FileWriter("board.json")) {
 
            file.write(paiktesList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}