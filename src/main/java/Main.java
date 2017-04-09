
/**
   Display the contents of an address book
*/
public class Main {

     public static void main(String[] args) {

        String file = "addresses";
        
        Importer importer = new Importer();
        String text = importer.readFile(file);

        System.out.println(text);
 
  
     }

}
