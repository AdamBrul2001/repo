package Zadanie7;

import java.io.*;
import java.util.Scanner;

public class SzyfrCezara {
    public static String cezar(String str){
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++){
            int n = x[i];
            n += 5;
            x[i] = (char)n;
        }
        return new String(x);
    }

    public static String cezarwroc(String str){
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++) {
            int n = x[i];
            n -= 5;
            x[i] = (char)n;
        }
        return new String(x);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File wejscie = new File("./src/SzyfrCezara/Dane.txt");
        Scanner in = new Scanner(wejscie);
        PrintWriter wyjscie = new PrintWriter("./src/SzyfrCezara/zaszyfrowane.txt");
        File wejscie2 = new File("./src/SzyfrCezara/zaszyfrowane.txt");
        Scanner in2 = new Scanner(wejscie2);

        int i = 0;
        int j = 0;

        String slowo;
        String szyfr;
        String[] dane = new String[100];

        while (in.hasNextLine()){
            String zdanie = in.nextLine();
            dane[i] = zdanie;
            i++;
        }

        while (j != i){
            slowo = dane[j];
            szyfr = SzyfrCezara.cezar(slowo);
            wyjscie.println(szyfr);
            j++;
        }

        wyjscie.close();

        while (in2.hasNextLine()) {
            String szyfrowane = in2.nextLine();
            String odszyfrowane = SzyfrCezara.cezarwroc(szyfrowane);
            System.out.println(odszyfrowane);
        }
    }
}
