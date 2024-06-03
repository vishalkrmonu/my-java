import java.util.HashSet;
import java.util.*;

class Day31{  
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }}  
        arr[j++] = arr[n-1];  
        return j;  
    }  
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}



class dupli {
    public static void duplicate(int arr[]) {
        System.out.println("duplicate array is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 2, 3 };
        duplicate(arr);
    }
}



class RemoveDuplicates{
    public static void removeDuplicates(int arr[]) {
        System.out.println("After removing duplicates, the array is:");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 2, 3 };
        removeDuplicates(arr);
    }
}




class dremoveduplicate {
    public static void remove(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int i, j;
        System.out.println("after remove ");
        for (i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

        System.out.println("duplicate is ");
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 22, 33, 22, 66, 1 };
        remove(arr);
    }
}



class Day26 {
    public static void main(String[] args) {
        int i, c = 0,j,k,c1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int[] a = new int[sc.nextInt()];
        System.out.println("enter the  number");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // compare two element
        for (i = 0; i < a.length-c; i++) {
            for(j=i+1;j<a.length-c;j++){
                if(a[i]==a[j]){        
                    for(k=j;k<a.length-1-c;k++){ //one by one element ko left kr rha hai duplicate ko delete krne ke bad
                        a[k]=a[k+1];
                    }
                   c=c+1;
                }
            }}
            System.out.println("after delete duplicate array");
            for(i=0;i<a.length-c;i++){
                System.out.println(a[i]);
            }
        }
    }