import java.util.Scanner;

class Subset {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 810, 90, 100,110};
        int k, i, sum = 0,m=0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        for (i = 0; i <a.length; i++) {
            if (i % k == 0 && i != 0) {
               System.out.print("=" + sum);
                sum = 0;
                System.out.println();
                System.out.println("the most greatest value of this subset is "+m);
                m=0;
            }
            System.out.print(a[i] + " ");
            sum = sum + a[i];
            if (m < a[i]){
                m = a[i];
            }
        }
        System.out.print("=" + sum); 
        System.out.println();

    }}
