package homeWork;

import java.util.Random;
import java.util.Scanner;

public class moneyWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总金额（分）和人数：");
        int money = sc.nextInt();
        int num = sc.nextInt();
        
        if (num > money) {
            System.out.println("人数不能大于金额，请重新输入！");
            return;
        }
        
        Random r = new Random();
        
        for (int i = 1; i <= num - 1; i++) {
            // 计算当前人可抢的最大值：保证后面每个人都至少有 1 分
            int maxMoney = money - (num - i);
            // 计算平均值，让随机范围更合理
            int avgMoney = money / (num - i);
            
            // 在平均值的 0~2 倍之间随机，但不超过最大值
            int range = Math.min(avgMoney * 2, maxMoney);
            int mymoney = r.nextInt(range) + 1;
            
            money -= mymoney;
            System.out.println("第" + i + "个人抢到 " + mymoney + " 分");
        }
        
        System.out.println("第" + num + "个人抢到 " + money + " 分");
        
        sc.close();
    }
}
