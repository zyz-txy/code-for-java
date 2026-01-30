package ifdemo;
// 生成一个1~100的随机数，利用键盘输入进行猜数，直到猜中
//理论上不超过7次
import java.util.Random;
import java.util.Scanner;

public class TestRandom1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //int n = r.nextInt();
        //小括号里面写一个数字n，则返回一个0到n-1的随机数
        //小括号里面写两个数符，则返回一个n到m的随机数，包含n不包含m
        Random r = new Random();
        /*for (int i = 0; i < 100; i++) {
            int n = r.nextInt(1,10);//包含1不包含10
            System.out.println(n);
        }
        for (int i = 0; i < 100; i++) {
            int n = r.nextInt(10);//从0开始到9
            System.out.println(n);
        }*/
        int num = r.nextInt(101);
        System.out.println("请输入数字");
        int input;
        boolean flag = false;
        do {
            input= sc.nextInt();
            if(input==num){
                System.out.println("恭喜你猜对了");
                flag = true;
            }else if (input > num){
                System.out.println("你猜的数字太大了");
                System.out.println("请重新输入");
            }else {
                System.out.println("你猜的数字太小了");
                System.out.println("请重新输入");
            }

        }while(! flag);
    }
}
