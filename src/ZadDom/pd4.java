package ZadDom;

import java.util.Scanner;

public class pd4 {
    public static double mz(double a, double b) {

        return -b/a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Podaj a: ");
        double a = s.nextDouble();

        System.out.print("Podaj b: ");
        double b = s.nextDouble();

        System.out.println("Miejsce zerowe funkcji linowej: " + mz(a, b));
    }
}
