import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        int notes100 = (int) (value / 100);
        value %= 100;

        int notes50 = (int) (value / 50);
        value %= 50;

        int notes20 = (int) (value / 20);
        value %= 20;

        int notes10 = (int) (value / 10);
        value %= 10;

        int notes5 = (int) (value / 5);
        value %= 5;

        int notes2 = (int) (value / 2);
        value %= 2;

        int coins1 = (int) (value / 1);
        value %= 1;

        int coins50 = (int) (value / 0.5);
        value %= 0.5;

        int coins25 = (int) (value / 0.25);
        value %= 0.25;

        int coins10 = (int) (value / 0.1);
        value %= 0.1;

        int coins5 = (int) (value / 0.05);
        value %= 0.05;

        int coins1Cent = (int) (value / 0.01);

        System.out.println("NOTAS:");
        System.out.println(notes100 + " nota(s) de $100.00");
        System.out.println(notes50 + " nota(s) de $50.00");
        System.out.println(notes20 + " nota(s) de $20.00");
        System.out.println(notes10 + " nota(s) de $10.00");
        System.out.println(notes5 + " nota(s) de $5.00");
        System.out.println(notes2 + " nota(s) de $2.00");

        System.out.println("MOEDAS:");
        System.out.println(coins1 + " moeda(s) de $1.00");
        System.out.println(coins50 + " moeda(s) de $0.50");
        System.out.println(coins25 + " moeda(s) de $0.25");
        System.out.println(coins10 + " moeda(s) de $0.10");
        System.out.println(coins5 + " moeda(s) de $0.05");
        System.out.println(coins1Cent + " moeda(s) de $0.01");
    }
}