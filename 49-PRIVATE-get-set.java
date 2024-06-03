import java.util.Scanner;
// class Demo {
//     private int a;
//     public void set(int x) {
//         a = x;
//     }
//     public int geta() {
//         return a;
//     }}
// class D {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.set(70);
 //       System.out.println(d.geta());
//    }
//}

class student{
    private int roll;
    private String name;
    private float marks;
public void set( int r,String n,float m){
    roll=r;
    name=n;
    marks=m;
}
public int getroll(){
    return roll;
}
public String getname(){
    return name;
}
public float getmarks(){
    return marks;
}
}
class M{
    public static void main(String[]args)
{
    student s=new student();
    s.set(101,"a",50);
    System.out.println(s.getroll());
    System.out.println(s.getname());
    System.out.println(s.getmarks());
    student s1=new student();
    s1.set(102,"b",40);
    System.out.println(s1.getroll());
    System.out.println(s1.getname());
    System.out.println(s1.getmarks());

    if(s.getmarks()>s1.getmarks()){
        System.out.println("max marks is = "+s.getmarks()+",name is = "+s.getname()+",roll is = "+s.getroll());
    }
    else{
        System.out.println("lowest marks is = "+s1.getmarks()+",name is = "+s1.getname()+",roll is = "+s1.getroll());
}}}

// class Employe {
//     private int id;
//     private String name;
//     private String department;
//     private long mobile;
//     private float salary;
//     public void set(int i, String n, String d, long m, float s) {
//         id = i;
//         name = n;
//         department = d;
//         mobile = m;
//         salary = s;
//     }
//     public int getid() {
//         return id;
//     }
//     public String getname() {
//         return name;
//     }
//     public String getdepartment() {
//         return department;
//     }
//     public long getmobile() {
//         return mobile;
//     }
//     public float getsalary() {
//         return salary;
//     }}
// class V {
//     public static void main(String[] args) {
        // Employe s=new Employe();
        // s.set(70,"monu","software",7309276656l,4000);
        // System.out.println(s.getid());
        // System.out.println(s.getname());  
        // System.out.println(s.getdepartment());
        // System.out.println(s.getmobile());
        // System.out.println(s.getsalary());

        // Scanner sc = new Scanner(System.in);
        // Employe s = new Employe();
        // System.out.println("enter the 1st data");
        // s.set(sc.nextInt(), sc.next(), sc.next(), sc.nextLong(), sc.nextInt());
        // System.out.println("the Employe id is = "+s.getid());
        // System.out.println("name is = "+s.getname());
        // System.out.println("the department is = "+s.getdepartment());
        // System.out.println("mobile number is ="+s.getmobile());
        // System.out.println("salary is = "+s.getsalary());
//}}

       