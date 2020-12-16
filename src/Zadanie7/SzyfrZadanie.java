package Zadanie7;

import java.util.Scanner;

public class SzyfrZadanie {
    public static void main(String[] args) {
        System.out.println("Program szyfrujący tekst za pomocą Szyfru cezara");
        System.out.println("Podaj tekst do zaszyfrowania: ");

        // inicjalizacja skanera, który będzie pobierał wartości zmiennych.
        Scanner scanner = new Scanner(System.in);

        // pobieramy tekst od użytkownika, zamieniamy na duże litery.
        String txt = scanner.nextLine().toUpperCase();
        System.out.println("Podaj klucz szyfrowania (ilość przesunięć): ");

        // pobieramy liczbe przesuniec od użytkownika.
        int n = scanner.nextInt();

        // tworzymy zmienna pomocniczą, która przechowa utworzony tekst.
        String encrypted = "";

        // iterujemy przez wprowadzony tekst.
        for(int i =0; i < txt.length(); i++) {
            // pobieramy znak na iterowanej pozycji i przesuwamy o wybraną przez użytkownika ilość znaków.
            char c = (char) (txt.charAt(i) + n);

            if(c > 'Z')
                c -= 26;
            // dopisujemy przesunięty znak do zmiennej.
            encrypted += c;
        }
        System.out.println("Twój tekst po szyfrowaniu cezara wygląda tak: " + encrypted);
        scanner.close();
    }
}
