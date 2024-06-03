import java.util.Arrays;
import java.util.Scanner;
class com{
    public static void common(int arr1[], int arr2[]){
        System.out.println("common element in array");
            for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]={3,5,6,7,8};
        common(arr1, arr2);
    }
}



class add {
    public static void common(int arr1[], int arr2[]){
        int arr3[]=new int[arr1.length];
        System.out.println("sum of two array");
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.println(arr3[i]);
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]={3,5,6,7,8};
        common(arr1, arr2);
    }
}


class concat {
    public static void concatination(int arr1[], int arr2[]){
        int arr3[]=new int[arr1.length+arr2.length];
        System.out.println("concat of two array");
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
            System.out.println(arr3[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
            System.out.println(arr3[i+arr1.length]);
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]={3,5,6,7,8};
        concatination(arr1, arr2);
    }
}




class Day27 {
    public static void main(String[] args) {
        int i, j, k, d, m = 0,z=0;
        int a[]={2,3,4,5,6,6};
        for (i = 0; i < a.length; i++) {
            d = 0;
            for (j = i - 1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    d++;
                    break;
                }
            }
            if (d == 0) {
                int c = 0;
                for (j = i; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        c = c + 1;
                    }
                }
                System.out.println(a[i] + " is " + c);
                if (m < c) {
                    m = c;
                    z=a[i];
                }
            }
        }

        System.out.println(z+ " is max number count "+m);


    }
}
