package sk.stuba.fei.oop;

public class App {
    public static void main(String[] args) {
        int[] pole = new int[10];

        for (int i=0; i <pole.length; i++) {
            pole[i] = i;
        }

        for (int i=0; i <pole.length; i++) {
            vypis(pole[i]);
        }
    }

    public static void vypis(int a) {
        System.out.println("Cislo v poli je " + a);
        if (a == 0) {
            System.out.println("cislo je nula");
        }
    }
}
