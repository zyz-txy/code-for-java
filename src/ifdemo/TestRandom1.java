package ifdemo;

import java.util.Random;

public class TestRandom1 {
    static void main() {
        //int n = r.nextInt();
        //小括号里面写一个数字n，则返回一个0到n-1的随机数
        //小括号里面写两个数符，则返回一个n到m的随机数，包含n不包含m
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int n = r.nextInt(1,10);//包含1不包含10
            System.out.println(n);
        }
        for (int i = 0; i < 100; i++) {
            int n = r.nextInt(10);//从0开始到9
            System.out.println(n);
        }
    }
}
