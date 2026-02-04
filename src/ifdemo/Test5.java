package ifdemo;
public class Test5 {
    static void main() {

        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print( j + "*" + i + "=" + i*j +"\t");
            }
            System.out.println();
        }
        //打印九九加法表
    }
}
