package Form;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class GameReader implements IGameReader {


    @Override
    public IGame readFile (File xmlFile) throws LoadErrorException {
        XStream xstream = new XStream(new DomDriver());
        FXConverters.configure(xstream);
        xstream.setMode(XStream.SINGLE_NODE_XPATH_RELATIVE_REFERENCES);
        try {
            String xml = fileToXMLString(xmlFile);
            return (IGame) xstream.fromXML(xml);
        }
        catch (IOException | UnknownFieldException e) {

            throw new LoadError("Could not deserialize file: " + xmlFile.getPath());
        }
    }

    private String fileToXMLString (File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader buffReader = getBufferedReader(file);
        String line;
        while ((line = buffReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    private BufferedReader getBufferedReader (File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
        return new BufferedReader(reader);
    }

}