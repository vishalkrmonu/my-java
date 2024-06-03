import java.util.Scanner;
// import java.util.Scanner;


 //instance variable


// class Me{         
//     int a;
//     String n;
//     float m;
//     boolean b;
//     public static void main(String[]args){
//         Me obj=new Me();
//         System.out.println(obj.a);
//         System.out.println(obj.n);
//         System.out.println(obj.m);
//         System.out.println(obj.b);
//     }}

// class student{
//     int roll;
//     String name;
//     float m1,m2,m3;
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         float t,p;
//         student obj=new student();
//         System.out.println("enter data");
//         obj.roll=sc.nextInt();
//         obj.name=sc.next();
//         obj.m1=sc.nextFloat();
//         obj.m2=sc.nextFloat();
//         obj.m3=sc.nextFloat();
//         t=obj.m1+obj.m2+obj.m3;
//         p=t*100/300;
// System.out.println("total number is =" +t);
// System.out.println("percentage is =" +p);
// if(t<150){
//     System.out.println("bhupendra is fail");
// }}}

// class Data{
//     int a,b;
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
// Data d1=new Data();
// Data d2=new Data();
// Data d3=new Data();
// System.out.println("enter data d1");
// d1.a=sc.nextInt();
// d1.b=sc.nextInt();
// System.out.println("enter data d2" );
// d2.a=sc.nextInt();
// d2.b=sc.nextInt();
// d3.a=d1.a+d2.a;
// d3.b=d1.b+d2.b;
// System.out.println(d3.a + " " +d3.b );
//   }}

class Size {
    int m, cm,sum=0 ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Size s1 = new Size();
        Size s2 = new Size();
        Size s3 = new Size();
        System.out.println("enter Size s1");
        s1.m = sc.nextInt();
        s1.cm = sc.nextInt();
        System.out.println("enter Size s2");
        s2.m = sc.nextInt();
        s2.cm = sc.nextInt();
        System.out.println("final Size s3");
        s3.m = s1.m + s2.m;
        s3.cm = s1.cm + s2.cm;
        System.out.println(s3.m + " " + s3.cm);
        int m1=s3.cm;
if (s3.cm>100){
   m1=s3.cm/100;
 s3.cm=s3.cm%100;
}
 int sum=s3.m+m1;
System.out.println( "total meter" +sum);
System.out.println("centimeter is " +s3.cm);

    }
}