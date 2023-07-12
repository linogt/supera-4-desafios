import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int[] pares = separarPares(numeros);
        int[] impares = separarImpares(numeros);

        ordenarCrescente(pares);
        ordenarDecrescente(impares);

        System.out.println("Valores ordenados:");
        imprimirValores(pares);
        imprimirValores(impares);
    }

    public static int[] separarPares(int[] numeros) {
        List<Integer> pares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        int[] paresArray = new int[pares.size()];
        for (int i = 0; i < pares.size(); i++) {
            paresArray[i] = pares.get(i);
        }

        return paresArray;
    }

    public static int[] separarImpares(int[] numeros) {
        List<Integer> impares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        int[] imparesArray = new int[impares.size()];
        for (int i = 0; i < impares.size(); i++) {
            imparesArray[i] = impares.get(i);
        }

        return imparesArray;
    }

    public static void ordenarCrescente(int[] numeros) {
        List<Integer> numerosList = new ArrayList<>();
        for (int numero : numeros) {
            numerosList.add(numero);
        }
        Collections.sort(numerosList);
        for (int i = 0; i < numerosList.size(); i++) {
            numeros[i] = numerosList.get(i);
        }
    }

    public static void ordenarDecrescente(int[] numeros) {
        List<Integer> numerosList = new ArrayList<>();
        for (int numero : numeros) {
            numerosList.add(numero);
        }
        Collections.sort(numerosList, Comparator.reverseOrder());
        for (int i = 0; i < numerosList.size(); i++) {
            numeros[i] = numerosList.get(i);
        }
    }

    public static void imprimirValores(int[] numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
