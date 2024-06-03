import java.util.Scanner;

class Day3{
            public static void main(String[] args){
            int a=100,b=200,c=300,t,d,e,a1,b1,c1,x,a2,b2,c2,y;
            t=a+b+c;
            d=t*10/100;
            e=t-d;
            a1=a*10/100;b1=b*20/100;c1=c*30/100;
            a2=a-(a*10/100);b2=b-(b*20/100);c2=c-(c*30/100);
            x=a1+b1+c1;
            y=a2+b2+c2;
            System.out.println("total="+t);
            System.out.println("discount="+d);
            System.out.println("actual="+e);
            System.out.println("total discount="+x);
            System.out.println("after discount total price="+y);
            }}


 class demo{
        public static void reverse(int n){
            int rem,rev=0,num,s=0,c=0;
            num=n;
            while(n>0){
            rem=n%10;
            rev =(rev*10)+rem;
            s=s+rem;
            n=n/10;
            c++;
            }
            System.out.println("count of digit is "+c);
            System.out.println("sum of digit is " +s);
            System.out.println("reverse number is "+rev);
            if(num==rev){
                System.out.println("palindrome");
            }else{
                System.out.println(" not palindrome");
            }
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        reverse(345);
    }
}



class Reverse {
    public static void main(String[] args) {
        int a, a1, a3, a5, t;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a >= 10000 && a <= 99999) {
            a1 = a % 10;
            a = a / 100;
            a3 = a % 10;
            a = a / 100;
            a5 = a % 10;
            t = a1 + a3 + a5;
            System.out.println("sum of alternate digit " + t);

        } else
            System.out.println("invalid");
    }
}