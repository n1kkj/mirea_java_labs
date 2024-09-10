package lab1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int sum = 0;
        float avg = 0f;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int el = sc.nextInt();
            a[i] = el;
            sum = sum + el;
        }
        avg = (float) sum / a.length;
        System.out.printf("Array sum: %d\n", sum);
        System.out.printf("Array avg: %.1f", avg);
    }
}
