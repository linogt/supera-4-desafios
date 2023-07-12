import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int k = scanner.nextInt(); 
        int[] arr = new int[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(countDifference(arr, k));
    }

    public static int countDifference(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        int l = 0;
        int r = 0;

        while (r < arr.length) {
            int diff = arr[r] - arr[l];

            if (diff == k) {
                count++;
                l++;
                r++;
            } else if (diff < k) {
                r++;
            } else { 
                l++;
            }
        }

        return count;
    }
}
