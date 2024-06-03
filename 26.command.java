class M {
    public static void main(String[] args) {
        // String x = "4";
        // String y = "7";
        // int a = Integer.parseInt(x);
        // int b = Integer.parseInt(y);

        // System.out.println(a + b);

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        System.out.println("sum is =" + (a+b+c));
        if (a>b&&a>c){
            System.out.println("greatest number is " +a);
        }
        if (b>a&&b>c){
            System.out.println("greatest number is " + b);
        }
        if (c>b&&c>a){
            System.out.println( "greatest number is "+ c);
        }
        if (a<b&&a<c){
            System.out.println("smallest number is " +a);
        }
        if (b<a&&b<c){
            System.out.println("smallest number is " + b);
        }
        if (c<b&&c<a){
            System.out.println( "smallest number is "+ c);
        }
        int fact=1,j;
        for(j=1;j<=a;j++)
        {
            fact=fact*j;
        }
            System.out.println("Factorial of " +a+ " is = "+fact);
     } 

    }
