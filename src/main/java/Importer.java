import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
   Imports Strings from text files.
*/
public class Importer {

    /**
       Read a text file and return the contents.
       @parm file the text file to read.
       @return the file text.
    */
    public String readFile(String file) {

        StringBuilder builder = new StringBuilder();

        try (InputStream is = getClass().getResourceAsStream(file); 
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            

            String line;

            while ((line = reader.readLine()) != null) {
                
                builder.append(line).append("\n");
                
            }

        } catch (IOException ioe) {
            System.err.printf("Error reading file: %s%n", ioe.toString());
        }

        return builder.toString();
    }

}
