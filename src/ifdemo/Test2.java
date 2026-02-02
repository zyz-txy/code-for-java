package ifdemo;

public class Test2 {
    static void main() {
        //打印三行五列的星号
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //双循环法
        System.out.print("*");//打印一个星号
        System.out.println("*");//打印一个星号并换行
        System.out.println();//只换行
        System.out.println("*****");//打印一个五列的星号并换行
    }
}
