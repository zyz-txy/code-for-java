package ifdemo;

import java.util.Scanner;

public class ifDemo2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");

        double number= sc.nextDouble();
        if(number<0){
            number = -number;
        }
        if(number % 2 ==0){
            number = 3 * number + 1;
        }
        else{
            number = number / 2;
        }
        System.out.println(number);
    }
}
