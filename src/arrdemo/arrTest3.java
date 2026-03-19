package arrdemo;

public class arrTest3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 3, 3};
        int left = 0, right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
        for (int i = 0; i <= left; i++) {
            System.out.println(arr[i]);
        }
    }
}
