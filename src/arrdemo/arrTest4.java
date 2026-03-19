package arrdemo;

import java.util.Scanner;

public class arrTest4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        //查找元素
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(arr[arr.length-1]<number){
            System.out.println("应插入在索引" + (arr.length) + "处");
            return;
        }
        if(arr[0]>number){
            System.out.println("应插入在索引" + 0 + "处");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if ( i < arr.length - 1&&arr[i] < number && arr[i + 1] > number ) {
                System.out.println("应插入在索引" + (i+1) + "处");
                break;
            }
            if (arr[i] == number) {
                System.out.println("找到了，索引为" + i);
                break;
            }
        }
    }
}

