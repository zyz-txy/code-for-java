package arrdemo;

public class arrTest5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 7, 9};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        for (; i < arr1.length && j < arr2.length; ) {
            if (arr1[i] < arr2[j]) {
                arr3[i+j] = arr1[i++];
            } else {
                arr3[i+j] = arr2[j++];
            }
        }//存在一个数组遍历完，另一个数组还没有遍历完的情况
        while(i<arr1.length){
            arr3[i+j] = arr1[i++];
        }
        while(j<arr2.length){
            arr3[i+j] = arr2[j++];
        }
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }
}
