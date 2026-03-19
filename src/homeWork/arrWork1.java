package homeWork;
//移除数据
import java.util.Scanner;

public class arrWork1 {
    public static void main(String[] args) {
        int[] num = {2,2,2,3,4,3,2,1,2,31,2,2,4};
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();
        int low = 0, fast = 0;
        while (fast < num.length) {
            if (num[fast] != find) {
                num[low] = num[fast];
                low++;
            }
            fast++;
        }
        for (int i = 0; i < low; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
