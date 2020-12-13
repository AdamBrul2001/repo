package Zadanie6;

public class Main {
    public static int najwiekszaliczba(int[] arr) {
        int n = arr[0];

        for(int i: arr) {
            if(i > n) {
                n = i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] arr = {4, 89, 12, 53, 12, 439, 539, 12, 293, 95, 83};
        System.out.println(najwiekszaliczba(arr));
    }
}
