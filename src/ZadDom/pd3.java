package ZadDom;

import java.util.HashSet;
import java.util.Set;

public class pd3 {
    public static Set<Integer> Usunnieparzyste(int[] tablica) {
        Set<Integer> liczbyparzyste = new HashSet<Integer>();

        for (int i: tablica) {
            if (i % 2 == 0) {
                liczbyparzyste.add(i);
            }
        }

        return liczbyparzyste;
    }

    public static int Sumujtablice(int[] tablica) {
        int suma = 0;

        for(int j: tablica) {
            suma = suma + j;
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] t = {5, 8, 10, 6, 11, 16, 40, 13};
        System.out.println(Usunnieparzyste(t));
        System.out.println(Sumujtablice(t));
    }
}
