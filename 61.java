 import java.util.Scanner;
// abstract class Demo{
//    protected String x;
//     public void set(String n){
//         x=n;
//     }
//    abstract public void cal();
//     }
//     class A extends Demo{
//         public void cal(){
//             int c=0,i;
// for(i=0;i<x.length();i++){
// if(x.charAt(i)=='A' || x.charAt(i)=='E' || x.charAt(i)=='I' || x.charAt(i)=='O'|| x.charAt(i)=='U'||x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o'|| x.charAt(i)=='u'){
// c=c+1;
// System.out.println(x.charAt(i));
// }}
// System.out.println(c);
//         }}
//     class B extends Demo{
//         public void cal() {
//             String y="";
//             String v="";
//             int i;
//              for(i=0;i<x.length();i++){
//                 v=v+x.charAt(i);
//                 }
//                 System.out.println( "name is "+v);
//             for(i=x.length()-1;i>=0;i--){
//                 y=y+x.charAt(i);
//             }
//             System.out.println("reverse is "+y);  
//             if(v.equals(y)){
//                 System.out.println("pelindrom");
//                 } 
//                 else{
//                 System.out.println(" not pelindrom");   
//                 }
//         }
//     }
//     class C extends Demo{
//         public void cal() {
//             int u=0,i;
//             for (i = 0; i < x.length(); i++) {
//                 if (x.charAt(i) >= 65 && x.charAt(i) <= 90) {
//                     u = u + 1;
//                 }
//         }
//         System.out.println(u);
//     }    
//         public static void main(String[]args){
//            A t=new A();
//             B y=new B();
//             C z= new C();
//             t.set("ashok");
//             y.set("vishal");
//             z.set("MOnu");
//             t.cal();
//             y.cal();
//             z.cal();
            
//         }
//     }


    



class marks{
    protected int roll;
    protected String name;
    protected int []m;
    public void set(int r,String n,int[]z){roll=r;name=n;m=z;}
}
     class t extends marks{
         public void show(){
             int i;
     System.out.println(roll+" "+name);
     for(i=0;i<m.length;i++){
         System.out.println(m[i]);
     }
         }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int i;
     int[]m=new int[5];
     for(i=0;i<m.length;i++){
         m[i]=sc.nextInt();
 }
          t obj=new t();
         obj.set(101,"vishal",m);
     obj.show();
 }

}