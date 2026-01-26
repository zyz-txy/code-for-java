package variable;

public class VariableDemo3 {
    static void main() {
        byte b=127;
        System.out.println(b);
        short s = 32767;
        System.out.println(s);
        int i = 2147483647;
        System.out.println(i);
        //long数据类型必须以L结尾，可大写可小写
        long l = 9223372036854775807L;
        System.out.println(l);
        //float数据类型必须以F结尾，可大写可小写
        float f = 3.4028235E38f;
        System.out.println(f);
        double d = 1.7976931348623157E308d;
        System.out.println(d);
        char c = '好';
        System.out.println(c);
        boolean bool = true;
        System.out.println(bool);
    }
}
