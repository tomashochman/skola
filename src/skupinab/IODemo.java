package skupinab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {

    public static void main(String[] args) throws FileNotFoundException {
try {
    FileReader reader = new FileReader("otazky_odpovede");

    int znak = reader.read();
   while (znak != -1) {
       System.out.println((char) znak);
       znak = reader.read();
   }
}
catch (FileNotFoundException e){
    System.out.println("chyba sa nasla");
}
catch (IOException e) {
    e.printStackTrace();
}
    }

}
