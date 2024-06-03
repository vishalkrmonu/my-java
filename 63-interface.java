import java.util.Scanner;
// interface idemo{
//     abstract public void show();                 //abstract public are optional
// }
// class M implements idemo{                       
//     public void show(){
//         System.out.println("A");
//     }
//     public static void main(String[]args){
// M o=new M();
// o.show();
//     }
// }


// class marks{
//     float m1,m2,m3;
//     public void set(float x,float y,float z){
//         m1=x;m2=y;m3=z;
//     }
// }
// interface Imarks{
//     abstract public void cal();
// }
// class total extends marks implements Imarks{
//     public void cal(){
//         System.out.println(m1+m2+m3);
//     }
//     public static void main(String[]args){
//         total t=new total();
//         t.set(7,6,8);
//         t.cal();
//     }
// }



// class M{
//     int a, b;
//     public void set(int x,int y){a=x;b=y;}
// }
// interface I1{
//  public void cal1();
// }
// interface I2{
//      public void cal2();
//     }
//     class N extends M implements I1,I2{
//         public void cal1(){
//             int i,j;
//             System.out.println("prime number is ");
//             for (i = a; i <= b; i++){ 		 		  
//                    int  c=0;
//                for(j =1; j<i; j++){
//               if(i%j==0){
//               c = c + 1;
//               } }
//            if (c ==1){
//             System.out.println(i);
//           } }}
//          public void cal2(){
//             int r=0,i;
//             for (i = a; i <= b; i++){ 		 		  
//                 int  c=0;
//                 int z=i;
//     while(z!=0){
//     c=z%10;
//     r=r*10+c;
//     z=z/10;
//     }
//     if(r==i){
//         System.out.println(i+ "palindrom");
//     }
//     else{
//         System.out.println(i+" not palindrom");
    //}
//     r=0;
//     }}
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         N o=new N();
//         o.set(sc.nextInt(),sc.nextInt());
//         o.cal1();
//         o.cal2();
//     }
// }


class H{
    int []x;
    public void set(int []z){x=z;}
   
}
interface I1{abstract public void cal1();}
interface I2{abstract public void cal2();}
interface I3{abstract public void cal3();}

class G extends H implements I1,I2,I3{
    
public void cal1(){
    int i;
    int m=0;
    for(i=0;i<5;i++){
    if(m<x[i]){ 
    m=x[i];
    }}
    System.out.println(" max num is"+m);
 }
 public void cal2(){
    int i,j,m; 
    for(i=0;i<5;i++){
    for(j=i+1;j<5;j++){
        if(x[i]>x[j]){
            m=x[i];
          x[i]=x[j];
          x[j]=m;
        }}}
    System.out.println("min num is"+x[0]);
}
public void cal3(){
    System.out.println("enter the num of array");
    int i,j ,k,c=0;
    for(i=0;i<5-c;i++){
        for(j=i+1;j<5-c;j++){
            if(x[i]==x[j]){
                for(k=j;k<5-i-c;k++){
                    x[k]=x[k+1];
                }c=c+1;
            }
        }
    }
    System.out.println("after remove");
    for(i=0;i<5-c;i++){
        System.out.println(x[i]);
    }
}  

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     int i;
     int[]x=new int[5];
 System.out.println("enter the array ");
     for(i=0;i<x.length;i++){
         x[i]=sc.nextInt();
 }
 System.out.println("the array is ");
    for(i=0;i<x.length;i++){
        System.out.println(x[i]);
    }
G o1=new G();
o1.set(x);
o1.cal1();
o1.cal2();
o1.cal3();
}}
