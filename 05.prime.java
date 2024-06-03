class prim {
    public static void prime(int a) {
        int c = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0)
                c++;
        }
        if (c == 1)
            System.out.println("num is prime ");
        else
            System.out.println("num is not prime ");
    }

    public static void main(String[] args) {
        prime(9);
    }
}

class prim1 {
    public static void nextprime(int a) {
        for (int i = a + 1; i > a; i++) {
            int c = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 1) {
                System.out.println("next prime num is " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        nextprime(5);
    }
}

class prim2 {
    public static void betprime(int a, int b) {
        System.out.println("prime number is ");
        for (int i = a; i < b; i++) {
            int c = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        betprime(3, 14);
    }
}

class sum {
    public static void main(String[] args) {
        System.out.println("even number is ");
        int i, a = 3, b = 9;
        for (i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class small {
    public static void smallestdigit(int a) {
        int b, m = 9, n = 0;
        int c = a;
        while (a != 0) {
            b = a % 10;
            if (m > b) {
                m = b;
            }
            a = a / 10;
        }
        System.out.println("small digit " + m);

        while (c != 0) {
            b = c % 10;
            if (n < b) {
                n = b;
            }
            c = c / 10;
        }
        System.out.println("large digit " + n);

    }

    public static void main(String[] args) {
        smallestdigit(435);
    }
}