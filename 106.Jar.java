import java.util.Scanner;

class Jar {
    public static void main(String[] args) {
        int i, n = 10, k = 5, x;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        if (i < n) {
            x = n - i;
            System.out.println("number of candies sold:" + i);
            System.out.println("number of candies available:" + x);
        }

        if (i > n) {
            System.out.println("Invalid input");
        }

    }
}