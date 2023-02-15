package sk.stuba.fei.oop;

public class App {
    public static void main(String[] args) {
        for (int cislo = 1; cislo < 3; cislo++) {
            switch (cislo) {
                case 1:
                    System.out.println("nieco");
                    break;
                case 2:
                    System.out.println("nieco 2");
                    break;
                default:
                    System.out.println("ani jedno z toho");
            }
        }
    }
}
