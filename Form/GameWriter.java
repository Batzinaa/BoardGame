
package Form;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class GameWriter implements IGameWriter {


    @Override
    public void Form (File file, IGame game) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(getXML(game));
        fw.close();
    }

    private String getXML (IGame game) {
        XStream xstream = new XStream(new DomDriver());
        FXConverters.configure(xstream);
        xstream.setMode(XStream.SINGLE_NODE_XPATH_RELATIVE_REFERENCES);
        return xstream.toXML(game);
    }

}

