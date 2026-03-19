package homeWork;

import java.util.Scanner;

public class methodWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a<0){
            System.out.println("重新输入");
        }
        if(a>0&&a<=1){
            double cost1 = spend1(a);
            System.out.println(cost1);
        }
        if(a>1&&a<=6){
            double cost2 = spend2(a);
            System.out.println(cost2);
        }
        if(a>6){
            double cost3 = spend3(a);
            System.out.println(cost3);
        }
    }
    public static double spend1(double a){
        return a*10;
    }
    public static double spend2(double a){
        return 10+(a-1)*2;
    }
    public static double spend3(double a){
        return 10+8+(a-6)*1.5;
    }
}
