package skupinab;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        // System.in.read();
       // System.err.println();
        System.out.println("napis text: ");
        Scanner scanner = new Scanner(System.in);

        String out = scanner.nextLine();
        int pocet = pocetZnakov(out);
        //vytvorte metodu ktora počita počet znakov v zadanom texte
        System.out.println("vystupny text:"+out);
        System.out.println("pocet znakov je: "+ pocet);
        InputStream inputStream; //binarny subor
        InputStreamReader reader; // znakovy subor nejaky text

    }

    private static int pocetZnakov(String out) {

        return out.length();

    }

}
