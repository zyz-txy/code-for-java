package operator;

import java.util.Scanner;

public class OperatorDemo2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数代表时间秒");
        int a = sc.nextInt();
        int b = a/3600;
        int c = a%3600/60;
        int d = a%60;
        System.out.println(b+"时"+c+"分"+d+"秒");
    }
}
