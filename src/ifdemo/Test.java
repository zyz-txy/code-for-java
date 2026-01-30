package ifdemo;

import java.util.Random;
import java.util.Scanner;

public class Test {
    static void main() {
        //生成一个1~100的随机数，利用键盘输入进行猜数，直到猜中
        Random r = new Random();
        int num = r.nextInt();
        num %=100;
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            input = sc.nextInt();
            if (input > num) {
                System.out.println("猜大了,继续猜");
            } else if (input < num){
                System.out.println("猜小了,继续猜");
            } else {
                System.out.println("猜对了");
            }
        }while (input != num);
    }
}
