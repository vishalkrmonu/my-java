import java.util.Scanner;
import java.util.Arrays;


class ar{
    public static void array(int arr[]){
        int m=arr[0],n=arr[0];
   Arrays.sort(arr);
   System.out.println("acending order is ");
   for(int i=0;i<5;i++){
    System.out.println(arr[i]);
    if(m<arr[i]){
        m=arr[i];
    }
    if(n>arr[i]){
        n=arr[i];
    }
}
System.out.println("greatest value is " +m) ;
System.out.println("smallest value is " +n) ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the element");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        array(arr);
    }
}


class ar1{
    public static void array(int arr[]){
   Arrays.sort(arr);
//    Arrays.sort(arr,Collections.reverseOrder());
   System.out.println("decending order is ");
   for(int i=4;i>=0;i--){
    System.out.println(arr[i]);
}
    }
    public static void main(String[] args) {
      int arr[]={3,6,1,2,8};
        array(arr);
    }
}


class ar2{
    public static void size(int arr[]){
        int sum=0,c=0;
          for(int i=0;i<arr.length;i++){
              c++;   //insert the element
              if(c==3){
                arr[i]=0;
              }
            sum=sum+arr[i];
            System.out.println(i + " "+arr[i]);
          }
          System.out.println("sum of array is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        size(arr);

    }
}