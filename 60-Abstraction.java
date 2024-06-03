// abstract class m{
//     abstract public void show();    //not curly bracket   
// }                                      //without body
// m o=new m();                        //     wrong abstract class


// abstract class M{
//     abstract public void show();
// }
// class N extends M{
//     public void show(){
//         System.out.println("M");
//     }
//     public static void main(String[]args){
//         N o=new N();
//         o.show();
//     }
// }


// abstract class x{
//     protected int a,b;
//      public void set(int x,int y){
//         a=x;b=y;
//      }
//    abstract public void cal();
//     }
//     class y extends x{
//         public void cal(){
//             System.out.println(a+b);
//         }
//         public static void main(String[]args){
//             y m=new y();
//             m.set(7,9);
//             m.cal();
//         }
//     }



// abstract class shape{
//     int a;
//     public void set(int x){
//         a=x;
//     }
//     abstract public void cal();
// }
// class cube extends shape{
//     public void cal() {
//         System.out.println(a*a*a);
//     }}
// class Square extends shape{
//     public void cal(){
//         System.out.println(a*a);
//     }}
//     class sqrt extends shape{
//         public void cal(){
//             System.out.println(Math.sqrt(a));
//         }
// public static void main(String[]args) {
//     cube c=new cube();               //create a obj
//     Square s=new Square();
//     sqrt t=new sqrt();
//     c.set(3);                 
//     s.set(2); 
//     t.set(4);                            
//     c.cal();                //call
//     s.cal();
//     t.cal();
// }}

import java.util.Scanner;
import java.util.Arrays;
abstract class A{
    int[] x=new int[5];
    public void input(){
        int i;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the array");
    
   for(i=0;i<5;i++){
    x[i]=sc.nextInt();
   }}
   abstract public void cal();
}
class B extends A{
    public void cal(){
        super.input(); 
        int i;
        int m=0;
        for(i=0;i<5;i++){
        if(m<x[i]){
        m=x[i];
        }}
        System.out.println(" max num is"+m);
     }}
class C extends A{
    public  void cal(){
        super.input();
        int i,j,m;
        for(i=0;i<5;i++){
        for(j=i+1;j<5;j++){
            if(x[i]>x[j]){
                m=x[i];
              x[i]=x[j];
              x[j]=m;
            }}}
        System.out.println("min num is"+x[0]);
    }}
class D extends A{
    public void cal(){
        super.input();
        Arrays.sort(x);
        int i;
        System.out.println( "acending order is");
        for(i=0;i<5;i++){
            System.out.println(x[i]);
        }}
         public static void main(String[] args){
            D s=new D();
            B n=new B();
            C m=new C();
            s.cal();
            n.cal();
            m.cal();
         }}
          