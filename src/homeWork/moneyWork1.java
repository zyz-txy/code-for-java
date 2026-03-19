package homeWork;

import java.util.Random;
import java.util.Scanner;
public class moneyWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额和人数");
        int money = sc.nextInt();
        int num = sc.nextInt();
        if(num>money){
            System.out.println("重新输入金额和人数");
            return ;
        }
        Random r = new Random();
        for(int i = 1;i <=num-1;i++){
            int mymoney = r.nextInt(money-(num-i))+1;
            money-=mymoney;
            System.out.println("第"+i+"个人抢到"+mymoney + "分");
        }
        System.out.println("第"+num+"个人抢到"+money + "分");
    }
}
