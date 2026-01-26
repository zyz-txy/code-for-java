package operator;

import java.util.Scanner;

public class OperatorDemo1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("a+b="+(a+b));//相加
        System.out.println("a-b="+(a-b));//相减
        System.out.println("a*b="+(a*b));//相乘
        System.out.println("a/b="+(a/b));//相除
        System.out.println("a%b="+(a%b));//取余
    }
}
