package ZadDom;

public class pd2 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        System.out.print("Tablica składa się z: ");

        for(int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
            System.out.print(i != tab.length - 1 ? tab[i] + ", " : tab[i]);
        }

        int n = 0;

        for(int j: tab) {
            n = n + j;
        }

        System.out.println("\nSuma liczb to: " + n);
    }
}
