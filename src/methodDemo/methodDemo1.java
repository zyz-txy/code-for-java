package methodDemo;

public class methodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println(c);
    }
    public static int add(int a, int b) {
        return a + b;
    }
}
