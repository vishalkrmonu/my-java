import java.util.HashSet; //packej
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Scanner;
class Nov3{
    public static void main(String[]args){
        HashSet<Integer> h=new HashSet<Integer>();
        h.add(10);
        h.add(20);  //in Hashset no shorting order
        h.add(40);
        h.add(30);
        h.add(10);
        h.add(20);
        h.add(40);
        h.add(50);
    System.out.println(h);
    }
}

   // in LinkedHashSet is use for shorting
class M{     
    public static void main(String[]args){
        LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(40);
        h.add(30);
        h.add(10);
        h.add(20);
        h.add(40);
        h.add(50);
    System.out.println(h);
    }
}

   // in TreeSet is use for shorting
class M1{     
    public static void main(String[]args){
        TreeSet<Integer> h=new TreeSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(40);
        h.add(30);
        h.add(10);
        h.add(20);
        h.add(40);
        h.add(50);
    System.out.println(h);
    }
}

//take as input in command
class M2{
    public static void main(String[]args){
        LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
System.out.println("no of word ");
int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
    for(i=1;i<=n;i++){
h.add(sc.nextInt());
    }
    System.out.println(h);
    }}


    //single digit  value only in hash occurs
    class M3{
        public static void main(String[]args){
            HashSet<Integer> h=new HashSet<Integer>();
    System.out.println("no of letter ");
    int i;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(i=1;i<=n;i++){
    h.add(sc.nextInt());
            if(h.contains(-1)){
                break;         
        }}
    
        System.out.println(h);
    
        int s=0;
        for(int v:h){
            s=s+v;
        }
        System.out.println(s);
    }}


//when -1 is comming then automatic exit
    class M4{
        public static void main(String[]args){
            HashSet<Integer> h=new HashSet<Integer>();
    System.out.println("enter the no of thing ");
    Scanner sc=new Scanner(System.in);
while(true){
            int a=sc.nextInt();
            if(a==-1){
                break;
            }
            else{
                h.add(a);
            }
   }
        // int s=0;
        // System.out.println("output is ");
        // for(int v:h){
        //     s=s+v;
        // System.out.println(v);
        // }
        // System.out.println("sum of number after delete duplicate "+s);
    }}