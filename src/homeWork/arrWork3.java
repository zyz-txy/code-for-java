package homeWork;//leetcode 665接雨水
//数组代表柱子高度，求接雨水

public class arrWork3 {
    public static void main(String[] args) {
        int[] a ={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int[] d = new int[a.length];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
            b[i] = max;
            }
        max = a[a.length-1];
        for (int i = a.length-1; i > 0 ; i--) {
            if(a[i]>max){
                max = a[i];
            }
            c[i] = max;
            }
        for (int i = 0; i < a.length; i++) {
            d[i] = Math.min(b[i],c[i]);
            }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = d[i] - a[i];
            System.out.println(a[i]);
            sum +=a[i];
        }
        System.out.println( "总共接雨水" + sum + "滴");
    }
}
