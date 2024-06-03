import java.util.Scanner;

// class sample{
//     sample(){
//         System.out.println("default constructor");
//     }

// sample(int a){
//     System.out.println("A");
// }
// sample(int a,int b){
//     System.out.println("2A");
// }
// sample(float a){
//     System.out.println("float");
// }
//  public static void main(String[] args) {
//     sample s1=new sample();
//     sample s2=new sample(7);
//     sample s3=new sample(7,10);
//     sample s4=new sample(3.2f);
// }
// }

// class Data{
//     private int a,b; 
//         Data(){
//             a=0;b=0;
//         }
//         Data(int x,int y){
//             a=x;b=y;
//         }
// public int geta(){return a;}
// public int getb(){return b;}
// public static void main(String[]args){
//     Data d1=new Data();
//     Data d2=new Data(8,10);
// System.out.println("details of d1");
// System.out.println(d1.geta());
// System.out.println(d1.getb());
// System.out.println("details of d2");
// System.out.println(d2.geta());
// System.out.println(d2.getb());
// }
//     }


// class student{
//     private int roll;
//     private String name;
//     private float marks;
//     student(){
//         roll=0;name="A";marks=0.0f;
//     }
//     student(int x,String n,float m){
//         roll=x;name=n;marks=m;
//     }
//     public int getroll(){return roll;  }
//     public String getname(){return name;  }
//     public float getmarks(){return marks;  }

//     public static void main(String[]args){
//         student s1=new student();
//         student s2=new student(101,"a",40f);
       
//         System.out.println("detail of s1");
//         System.out.println("roll = " +s1.getroll());
//         System.out.println("name= "+s1.getname());
//         System.out.println("name= "+s1.getmarks());

//         System.out.println("detail of s2");
//         System.out.println("roll = " +s2.getroll());
//         System.out.println("name= "+s2.getname());
//         System.out.println("name= "+s2.getmarks());

//     }
// }

// class Employe{
//     int id;
//     String name;
//     float salary;
//     Employe(){              
//         id=2;name="monu";salary=3000.0f;
//     }
//     Employe(int x,String n,float s){
//         id=x;name=n;salary=s;
//     }
    
//     public int getid(){return id;  }
//         public String getname(){return name;  }
//         public float getsalary(){return salary;  }
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the data");
//         Employe E1=new Employe();
//         Employe E2=new Employe(sc.nextInt(),sc.next(),sc.nextInt());
// System.out.println(E1.getid()+","+E1.getname()+","+E1.getsalary());
// System.out.println(E2.getid()+","+E2.getname()+","+E2.getsalary());
    
// if(E1.getsalary()>E2.getsalary()){
// System.out.println("max salary details "+E1.getid()+","+E1.getname()+","+E1.getsalary());
// }
// else{
// System.out.println("max salary details "+E2.getid()+","+E2.getname()+","+E2.getsalary());
// }
// }}

class student{
    int roll;
    String name;
    float m1;
     float m2;
    float m3;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float t,p;
        student s1=new student();
        System.out.println("enter data");
        s1.roll=sc.nextInt();
        s1.name=sc.next();
        s1.m1=sc.nextFloat();
        s1.m2=sc.nextFloat();
        s1.m3=sc.nextFloat();
        t=s1.m1+s1.m2+s1.m3;
        p=t*100/300;
        System.out.println( "total marks is="+t);
        System.out.println("total percent is ="+p);
    }
   }