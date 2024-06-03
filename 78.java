import java.util.Scanner;
import java.io.IOException;


class R{
    public static void main(String[]args){
        int a=4,b=0;
        int[]x=new int[5];
try{
        System.out.println(a/b);
        try{
        System.out.println(x[7]);
}
catch(ArrayIndexOutOfBoundsException h){
    System.out.println("not divide zero");
}}
catch(ArithmeticException g){
    System.out.println("array is not given");
}
    }
}

class R1{
    public static void main(String[]args){
        int []x=new int[7];
        int b=0;
        try{
            System.out.println(x[7]/b);
        }
        catch(ArithmeticException e){
            System.out.println("handle arithmetic");
        }
        catch(ArrayIndexOutOfBoundsException r){
            System.out.println("handle arithmetic 1");
        }
        catch(Exception t){
            System.out.println("handle arithmetic 2");
        }
    }
}

class R2{
    public static void main(String[]args){
        String x="AB,CD,40,50,EF";
       int s=0;int i;
        String[]y=x.split(",");
        for(i=0;i<y.length;i++){
            try{
                s=s+Integer.parseInt(y[i]);
            }
            catch(Exception e){
                System.out.println("");
            }
        }
System.out.println(s);
    }
}



class R3{
    public void show(){
throw new ArithmeticException();
    }
    public static void main(String[]args){
        R3 o=new R3();
        o.show();
    }
}

class R4{
    public void show(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
if(a>0){
       throw new ArithmeticException();
}
else if(a<0){
    throw new ArrayIndexOutOfBoundsException();
}
else{
    throw new NumberFormatException();
}
    }
    public static void main(String[]args){
R4 o=new R4();
o.show();
    }
}

class R5{
    public void show(){
        throw new IOException();
    }
    public static void main(String[]args){
        R5 o=new R5();
        o.show();
    }
}