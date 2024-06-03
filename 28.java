import java.util.Scanner;
class Day36 {
     public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
        int k, i, sum = 0, m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element sum");
        k = sc.nextInt();
        for (i = 0; i <a.length; i++) {
            if (i % k == 0 && i != 0) {
                System.out.print("=" + sum);
                sum = 0;
                System.out.println();
            }
            System.out.print(a[i] + " ");
            sum = sum + a[i];
        }
        System.out.print("=" + sum);
        System.out.println();
        for (i = 0; i <a.length; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }
        System.out.println(m);

    }

}
