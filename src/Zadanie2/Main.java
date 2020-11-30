package Zadanie2;

public class Main {
    public static void main(String[] args){

        //Zadanie: Posortuj tablice liczb całkowitych rosnąco.
        int[] tab = {4,2,5,76,8,2,14,234,346,32,1};
        int[] wynik = new int[tab.length];

        //Przechodzimy po każdym elemencie tablicy wyników.
        for(int j = 0; j < wynik.length; j++) {
          //Pętla przechodząca po wszystkich elementach tablicy.
          int temp = tab[0];
          int lokalizacja =0;
          for(int i = 1; i < tab.length; i++) {
              //Porównaj przechowywaną zmienną z kolejnym miejscem w taclicy.
              if(temp > tab[i]) {
                  temp = tab[i];
                  lokalizacja = 1;
              }
              System.out.println("Temp: "+ temp + " Lokalizacja: "+lokalizacja);
          }
          //Wypisujemy do konkretnego miejsca w tablicy naszą wartość oraz ustawiamy go na null.
          wynik[j] = temp;
          tab[lokalizacja] = Integer.MAX_VALUE;

          //Wypisujemy tablice wyników.
          System.out.print(wynik[j] + ", ");
        }
    }
}
