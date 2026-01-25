package test;


import java.util.Scanner; // 添加Scanner类的导入

public class luckycard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 定义Scanner对象

        //生成一个随机的七位数字
        int lucky = (int)(Math.random()*10000000);
        //从键盘录入一个7位数字
        System.out.println("请输入一个7位数字：");
        int input = sc.nextInt();
        //判断用户是否中奖
        if(lucky == input){
            System.out.println("恭喜你，中奖了！");
            System.out.println("中奖的数字是："+lucky);
            System.out.println("请输入你的姓名：");
            String name = sc.next();
        }
        else{
            System.out.println("很遗憾，没有中奖！");
            System.out.println("请输入你的姓名：");
            String name = sc.next();
        }

        sc.close(); // 记得关闭Scanner资源
    }
}

