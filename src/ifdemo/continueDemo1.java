package ifdemo;

public class continueDemo1 {
    static void main() {

        for (int i = 1; i <= 100; i++) {

            if(i%7==0 || i%10==7 || i/10==7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
