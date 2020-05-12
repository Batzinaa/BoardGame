package Form;


import java.io.File;



public interface IGameReader {


    IGame readFile (File file) throws LoadError;
}