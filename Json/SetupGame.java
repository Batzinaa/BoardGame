package model;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class SetupGame
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
       
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("board.json"))
        {
           
            Object obj = jsonParser.parse(reader);
 
            JSONArray Board = (JSONArray) obj;
            System.out.println(Board);

 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parsePaiktesObject(JSONObject names) 
    {
         
        String names = (String) paiktesObject.get("names");    
        System.out.println(names);
         
        String tetragona = (String) paiktesObject.get("tetragona");  
        System.out.println(tetragona);
         
    }
}
