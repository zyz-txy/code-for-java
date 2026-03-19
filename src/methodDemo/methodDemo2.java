package methodDemo;

public class methodDemo2 {
    static void main() {
        int a = 10;
        int b = 20;
        double c = getsum(a, b);//int c = (int)getsum(a, b);
        System.out.println(c);
    }

//    static int getsum(int a, int b) {
//        return a + b;
//    }

    static double getsum(double a, int b) {

        return a + b;
    }
    static double getsum(double a,double b){
        return a + b;
    }
}
