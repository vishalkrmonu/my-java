//array list
//kahi bhi array element ko insert kr sakte hai



import java.util.ArrayList;
import java.util.Scanner;
class M{
    public static void main(String[]args){
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(3,70);
        System.out.println("array is ");
        for(int v:l){
            System.out.println(v);
        }}}


// value take from cmd
        class M1{
            public static void main(String[]args){
                ArrayList<Integer> l=new ArrayList<Integer>();
        System.out.println("enter array ");
        int i;
        Scanner sc=new Scanner(System.in);
            for(i=1;i<=5;i++){
l.add(sc.nextInt());
            }
        System.out.println("sum of array is ");
        int s=0;
            for(int v:l){
                s=s+v;
            }
            System.out.println(s);
            }}

//2nd method
class M2{
    public static void main(String[]args){
        ArrayList<Integer> l=new ArrayList<Integer>();
System.out.println("enter array ");
int i;
Scanner sc=new Scanner(System.in);
    for(i=1;i<=5;i++){
l.add(sc.nextInt());
    }
System.out.println("sum of array is ");
int s=0;
for(i=1;i<l.size();i++){
    s=s+l.get(i);
}
System.out.println(s);
    }
}

//
class M3{
    public static void main(String[]args){
        ArrayList<Integer> l=new ArrayList<Integer>();
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
       System.out.println("enter array ");
        for(i=1;i<=n;i++){
            l.add(sc.nextInt());
        }
        int m=l.get(0);
        for(int v:l){
            if(v>m){
                m=v;
            }}
        System.out.println("max number is " +m);
    }
}

// neg ek taraf or positive ek tarf
class M4{
    public static void main(String[]args){
        ArrayList<Integer> l=new ArrayList<Integer>();
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=5;i++){
            int a=sc.nextInt();
            if(a>0){
                l.add(a);
            }else{
                l.add(0,a);
            }
        }
        System.out.println("array is ");

        for(int n:l){
            System.out.println(n);
        }
    }
}

// opp determine
class M5{
    public static void main(String[]args){
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        System.out.println("enter array ");
int i;
Scanner sc=new Scanner(System.in);
    for(i=1;i<=5;i++){
l1.add(sc.nextInt());
    }
for(i=l1.size()-1;i>=0;i--){
    l2.add(l1.get(i));
}
System.out.println(" array is ");
for(int v:l2){
    System.out.println(v);
}
    }
}

class M6{
    public static void main(String[]args){
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        ArrayList<Integer> l3=new ArrayList<Integer>();

        System.out.println("enter 1st array ");
int i,j;
Scanner sc=new Scanner(System.in);
    for(i=1;i<=5;i++){
l1.add(sc.nextInt());
    }
    System.out.println("enter 2nd array ");
    for(j=1;j<=5;j++){
        l2.add(sc.nextInt());
            }
            for(i=0;i<l1.size();i++){
                for(j=1;j<l2.size();j++){
            if(l1.get(i)==l2.get(j)){
l3.add(l1.get(i));
            }}}
            System.out.println(" array is ");
            for(int v:l3){
                System.out.println(v);
            }
        
        
    }}
