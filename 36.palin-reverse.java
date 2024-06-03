import java.util.Scanner;
class Mn{
    public static void main(String[] args){
    int i;

        // String x="ASHOK";
        // System.out.println(x.length());
        // System.out.println(x.charAt(0));
        // for(i=0;i<x.length();i++){
        // System.out.println(x.charAt(i));
        // }

// int c=0;
// Scanner sc=new Scanner(System.in);
// System.out.println("enter letter");
// String x=sc.nextLine();
// for(i=0;i<x.length();i++){
// if(x.charAt(i)=='A' || x.charAt(i)=='E' || x.charAt(i)=='I' || x.charAt(i)=='O'|| x.charAt(i)=='U'||x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o'|| x.charAt(i)=='u'){
// c=c+1;
// }
// }
// System.out.println(c);
String y="";
String v="";
Scanner sc=new Scanner(System.in);
 System.out.println("enter letter");
 String x=sc.nextLine();
 for(i=0;i<x.length();i++){
   // System.out.println(x.charAt(i));
    v=v+x.charAt(i);
    }
    System.out.println( "name is "+v);

for(i=x.length()-1;i>=0;i--){
    y=y+x.charAt(i);
}
System.out.println("reverse is "+y);

if(v.equals(y)){
    System.out.println("pelindrom");

    }

}}