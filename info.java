package model;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class info
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
 
    private static void parsePaiktesObject(JSONObject paiktes) 
    {
         
        String paiktes = (String) paiktesObject.get("paiktes");    
        System.out.println(paiktes);
         
        String tetragona = (String) paiktesObject.get("tetragona");  
        System.out.println(tetragona);
         
    }
}
