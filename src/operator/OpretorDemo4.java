package operator;

import java.util.Scanner;

public class OpretorDemo4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100;
        int sum = a + b+ c;
        boolean result = sum % 3 ==0;
        System.out.println(result);
    }
}
