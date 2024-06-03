import java.util.Scanner;

class M{
    void add(int a,int b){
        int c;
        c=a+b;
        System.out.println(c);
    }

    void fact(int n) {
        int fact = 1, i;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + n + " is " + fact);
    }
}

class N{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        M obj=new M();
        obj.add(sc.nextInt(),sc.nextInt());
        System.out.println("ENter number for factorial");

        obj.fact(sc.nextInt());
    }
}
