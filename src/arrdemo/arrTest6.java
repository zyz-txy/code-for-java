package arrdemo;

import java.util.Scanner;

public class arrTest6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        int left = 0, right = arr.length - 1;
        while (left < right){
            if(arr[left]+arr[right]<number){
                left++;
            }
            else if(arr[left]+arr[right]>number){
                right--;
            }
            else if (arr[left]+arr[right]==number){
                System.out.println("下标为"+left+","+right);
                right--;
            }
        }
        if (left==right){
            System.out.println("没有找到");
        }
    }
}
