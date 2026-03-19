package homeWork;

public class arrWork2 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2};
        int[] arr = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        for (; i < arr1.length && j < arr2.length;) {
            if(arr1[i] < arr2[j]){
                arr[i+j] = arr1[i];
                i++;
            }
            else{
                arr[i+j] = arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            arr[i+j] = arr1[i++];
        }
        while(j<arr2.length){
            arr[i+j] = arr2[j++];
        }
        if(arr.length%2==0){
            System.out.println(" 中位数为"+(arr[arr.length/2]+arr[arr.length/2-1])/2);
        }
        else{
            System.out.println("中位数为" + arr[arr.length/2]);
        }
    }
}
