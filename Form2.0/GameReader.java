package Form;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import model.JSONArray;
import model.JSONObject;
import model.ParseException;



public class GameReader{


 @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        	 try (FileReader reader = new FileReader("Game.json"))
             {
                
                 Object obj = jsonParser.parse(reader);
      
                 JSONArray Game = (JSONArray) obj;
                 System.out.println(Game);
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             } catch (IOException e) {
                 e.printStackTrace();
             } catch (ParseException e) {
                 e.printStackTrace();
             }
        catch (IOException | UnknownFieldException e) {

            throw new LoadErrorException("Could not deserialize file: " + json.getPath());
        }
        	 private static void parseGameObject(JSONObject games) 
        	    {
        	         
        	        String Game = (String) GameObject.get("games");    
        	        System.out.println(games);
    }

}