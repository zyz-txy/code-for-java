package ifdemo;

import java.util.Scanner;

public class switchDemo3 {
    static void main() {
        //switch
         /*
         1.箭头标签
         2.case后面可以跟多个值
         3.switch可以有运算结果
         4.yield关键字case "+" -> {
                            yield a+b;
         }
         如果只有一行可以省略大括号和yield
          */
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("请输入运算符");
        String n = sc.next();
        double result = switch(n){
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> (double)a/b;
            default -> 0;
        };
        System.out.println(result);
    }
}
