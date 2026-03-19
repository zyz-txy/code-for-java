package homeWork;

import java.util.Scanner;

public class methodWork1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            int b = sc.nextInt();
            if (b >= 0 && b <= 100) {
                a[i] = b;
            }
        }
        int max = findMax(a);
        int min = findMin(a);
        double avg = findAvg(a, max, min);
        System.out.println("平均值" + avg);
    }

    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int findMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    static double findAvg(int[] a, int b, int c) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = (sum - b - c) / (a.length - 2);
        return avg;
    }


}
