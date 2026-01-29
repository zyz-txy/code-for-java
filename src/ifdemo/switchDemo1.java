package ifdemo;

import java.util.Scanner;

public class switchDemo1 {
    static void main() {
        /*
        switch的注意点
        1.表达式：结果（字符/整数byte short int/枚举/字符串）
        2.case:被匹配的值，只能是真实值不能是变量
        3.case值不允许重复
        4.default:没有匹配的case，执行default中的代码
        5.break:结束switch
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几");
        int week= sc.nextInt();
        switch (week){
            case 1:
                System.out.println("爬山");
                break;
            case 2:
                System.out.println("爬山");
                break;
            case 3:
                System.out.println("动感单车");
                break;
            case 4:
                System.out.println("游泳");
                break;
            case 5:
                System.out.println("骑行");
                break;
            case 6:
                System.out.println("慢跑");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
