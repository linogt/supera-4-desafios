import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String l = scanner.nextLine();
            String u = desembaralhar(l);
            System.out.println(u);
        }

        scanner.close();
    }

    private static String desembaralhar(String l) {
        int c = l.length();
        int m = c / 2;
        StringBuilder u = new StringBuilder();

        for (int i = m - 1; i >= 0; i--) {
            u.append(l.charAt(i));
        }

        for (int i = c - 1; i >= m; i--) {
            u.append(l.charAt(i));
        }

        return u.toString();
    }
}
