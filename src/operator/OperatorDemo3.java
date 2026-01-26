package operator;

public class OperatorDemo3 {
    static void main() {
        char c = 'a';
        char ch = (char)(c-32);
        System.out.println(ch);
        char d = 'c';

        System.out.println("字符 '" + d + "' 的 ASCII 值是: " + (int) d);
//与C不同，Java中char类型没有对应的整数类型，所以需要使用(int)进行转换
    }
}

