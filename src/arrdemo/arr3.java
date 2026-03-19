package arrdemo;

import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,444,55,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==number) {
                System.out.println("找到了,下标为"+i);
                break;//找到循环结束
            }
        }
        if(i==arr.length){
            System.out.println("没有找到");
        }
    }
}
