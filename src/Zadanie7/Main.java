package Zadanie7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Double> stworzTablice() {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            list.add(scanner.nextDouble());
        }

        return list;
    }

    public static double srednia(double[] arr) {
        int total = 0;

        for(double i : arr) {
            total += i;
        }

        return (double) total / arr.length;
    }

    public static double srednia(ArrayList<Double> list) {
        int total = 0;

        for(double i : list) {
            total += i;
        }

        return (double) total / list.size();
    }

    public static void main(String[] args) {
        double[] arr = {5D, 4D, 4D, 4D, 5D, 5D, 5D, 5D, 5D, 6D, 6D, 10D};

        System.out.println("Obliczanie średniej dla tablicy: " + srednia(arr));

        ArrayList<Double> list = stworzTablice();
        System.out.println("Obliczanie średniej dla listy: " + srednia(list));
    }
}
