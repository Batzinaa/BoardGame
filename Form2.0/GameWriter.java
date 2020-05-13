
package Form;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class GameWriter {

@SuppressWarnings("unchecked")
    public static void main (String[] args )  {
        FileWriter fw = new FileWriter(file);
        fw.setName((game));
        fw.close();
    

    try (FileWriter file = new FileWriter("Game.json")) {
    	 
        file.write(game.toJSONString());
        file.flush();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}
}

