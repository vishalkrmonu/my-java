import java.util.Scanner;
// method with argument
class Method1 {
    void add(int a, int b) {
        int s;
        s = a + b;
        System.out.println("sum is  " + s);
    }

    void fact(int n) {
        int fact = 1, i;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + n + " is " + fact);
    }

    void prime(int n) {
        int c = 0, i;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if (c == 1) {
            System.out.println(n + " is prime number ");
        } else {
            System.out.println("no prime number " + n);

        }
    }
    void nextprime(int n){
        int i,j;
        System.out.println(" next prime number is ");
        for (i = n+ 1; i > n; i++) {
            int c = 0;
            for (j = 1; j < i; j++) {

                if (i % j == 0) {
                    c = c + 1;
                }
            }
            if (c == 1) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Method1 obj = new Method1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        obj.add(sc.nextInt(), sc.nextInt());
        System.out.println("enter the number for factorial");
        obj.fact(sc.nextInt());
        System.out.println("enter the number for prime");
        obj.prime(sc.nextInt());
        System.out.println("enter the number for next prime");
       obj.nextprime(sc.nextInt());
    }
}