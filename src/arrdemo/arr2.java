package arrdemo;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        //数组的动态初始化
        //动态初始化格式：数据类型[] 数组名 = new 数据类型[数组长度]
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入一个整数");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
