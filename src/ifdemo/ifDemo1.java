package ifdemo;

public class ifDemo1 {
    static void main() {
        double temp = 36.5;
        if(temp > 37.5)
        {
            System.out.println("发烧");
        }
        else if(temp <= 36.5)
        {
            System.out.println("正常");
        }
        else
        {
            System.out.println("低烧");
        }
    }
}
