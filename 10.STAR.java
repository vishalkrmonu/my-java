import java.util.Scanner;

class Day18 {
    public static void main(String[] args) {
        int i, j, a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= b; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= b; j++) {
                if (j <= 6 - i) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        for (i = 1; i <= a; i++) {
            for (j = 5; j >= i; j--) {

                System.out.print(j);

            }
            System.out.println();
        }
        for (i = 5; i >= 1; i--) {
            for (j = 5; j >= i; j--) {

                System.out.print(j);

            }
            System.out.println();
        }
    }
}