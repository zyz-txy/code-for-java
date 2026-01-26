package variable;

import java.util.Scanner;

public class VariableDemo5 {
    static void main() {
        //分别输入一个整数、一个浮点数和一个字符串，并输出
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
        double num2 = sc.nextDouble();
        System.out.println(num2);
        String str = sc.next();
        System.out.println(str);
    }
}
