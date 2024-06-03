import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Float a, b, c, t, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of 3 subject");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        t = a + b + c;
        p = t * 100 / 300;
        System.out.println("total number is " + t);
        System.out.println("percentage is " + p);
        if (p >= 75 && p <= 100) {
            System.out.println("grade a");
        }
        if (p >= 60 && p <= 74) {
            System.out.println("grade b");
        }
        if (p >= 40 && p <= 59) {
            System.out.println("vaishnavi is fail");
        }
    }
}

class Day5 {
    public static void main(String[] args) {
        int t, w;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the power value");
        w = sc.nextInt();
        if (w == 0) {
            t = 0;
            System.out.println("the time estimate is " + t);
        }
        if (w >= 0 && w <= 2000) {
            t = 25;
            System.out.println("the time estimate is " + t);
        }
        if (w >= 2001 && w <= 4000) {
            t = 35;
            System.out.println("the time estimate is " + t);
        }
        if (w >= 4001 && w <= 7000) {
            t = 45;
            System.out.println("the time estimate is " + t);
        }
        if (w >= 7001) {
            System.out.println("the time estimate is invalid");
        }

    }
}

class Day6 {
    public static void main(String[] args) {
        int unit, bill;
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        if (unit >= 1 && unit <= 100) {
            bill = unit * 2;
            System.out.println("your bill is " + bill);
        }
        if (unit >= 101 && unit <= 200) {
            bill = 100 * 2 + (unit - 100) * 3;
            System.out.println("your bill is " + bill);
        }
        if (unit >= 201 && unit <= 300) {
            bill = 100 * 2 + 100 * 3 + (unit - 200) * 4;
            System.out.println("your bill is " + bill);

        }
    }
}

class Day7 {
    public static void grt(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }

    public static void main(String[] args) {
        grt(4, 8, 6);
    }
}

class Day8 {
    public static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + " is equal " + i * a);
            // System.out.println(i*a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("table of" + a + "is");
        table(a);
    }
}

class Bus {
    public static void seat(int a) {
        int t;
        if (a % 50 == 0) {
            System.out.println("no vacant seat available");
        } else {
            a = a % 50;
            t = 50 - a;
            System.out.println("empty seat are " + t);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        seat(a);
    }
}

// sum of even number between two number
class Sum {
    public static void sum(int a, int b) {
        int s = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                s = s + i;
            }
        }
        System.out.println("sum of number between two even number " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
    }
}



class BasicAnimal {
    public static void main(String[] args) {
        // int m=70, b=30, e=7,rm,rb;
        int m, b, e, rm, rb;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        b = sc.nextInt();
        e = sc.nextInt();
        rm = m - b / e;
        rb = b % e;
        System.out.println("rm=" + rm);
        System.out.println("rb=" + rb);

    }
}