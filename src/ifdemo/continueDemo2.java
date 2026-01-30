package ifdemo;

public class continueDemo2 {
    static void main() {
        for (int i = 1; i <= 100; i++) {
            boolean b = false;
            if(i%7==0) b=true;
            int c = i;
            while(c!=0){
                if(c%10==7) b = true;
                c /= 10;
            }
            if(b) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
