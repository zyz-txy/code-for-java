package operator;

import java.util.Scanner;

public class OperatorDemo5
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = sc.nextInt();
        //逻辑运算符运用
        boolean reslut1 = a > 0 & a < 10;
        boolean reslut2 = a < 0 | a > 10;
        System.out.println("a大于0并且小于10 is "+reslut1);
        System.out.println("a小于0或者大于10 is "+reslut2);
    }
}