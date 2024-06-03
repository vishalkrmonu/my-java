import java.util.Arrays;
import java.util.Collections;
import java.util.*;

class Rev {
    public static void reverse(Integer arr[]) {
        System.out.println("Reverse order is:");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {3, 6, 1, 2, 8}; // Note the change from int[] to Integer[]
        reverse(arr);
    }
}

class num{
    public static void nth(int arr[]){
      Arrays.sort(arr);
      System.out.println("largest number "+arr[arr.length-4]);
      System.out.println("smallest number "+arr[4]);
}
    public static void main(String[] args) {
        int arr[]={3,9,-1,6,7,8};
        nth(arr);
    }
}


// Find the first repeating element in an array of integers
class repeat {
    public static void repeating(int arr[]) {
        System.out.println("first repeat element is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }break;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 2, 3 };
        repeating(arr);
    }
}



// Find the first non repeating element in an array of integers
class firstnonrepeat {
    public static int remove(int[]x){
        int i,j;
            for(i=0;i<x.length;i++){
            for(j=0;j<x.length;j++){
                if(i !=j && x[i]==x[j]){
                break;
                } 
                if(j==x.length-1){
            return x[i];
                } 
            }
            } 
            return -1;
            
    }      
    public static void main(String[] args) {
        int []x={22,33,22,66,1,1,66};
       System.out.println( remove(x));
}
}


