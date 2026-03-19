package arrdemo;

import java.util.Random;

public class arrTest2 {
    static void main() {
        int[] arr = new int[10];
        int cntt = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int RandomIndex = r.nextInt(0, 101);
            int cnt = 0;
            if (RandomIndex==0&&cntt==0) {
                cntt = 1;
                arr[i] = RandomIndex;
                i++;
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == RandomIndex) {
                    cnt = 1;
                    break;
                }
            }
                if (cnt == 0) {
                    arr[i] = RandomIndex;
                    i++;
                }
        }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
    }
}
