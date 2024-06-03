import java.util.Scanner;

class student{
    private int roll;
    private String name;
    private float marks;
    static private String clg;
public void set( int r,String n,float m){
    roll=r;
    name=n;
    marks=m;
}
static public void setclg(String c){
    clg=c;
}
public int getroll(){ return roll;}
public String getname(){  return name;}
public float getmarks(){return marks;}
static public String getclg(){return clg;}
}
class M{
    public static void main(String[]args)
{
    Scanner sc =new Scanner(System.in);
    student s=new student();
    s.set(101,"a",50);
    System.out.println(s.getroll() + s.getname()+s.getmarks());
  
    student s1=new student();
    s1.set(102,"b",40);
    System.out.println(s1.getroll()+s1.getname()+s1.getmarks());
    
System.out.println("enter the clg ");
student.setclg(sc.next());
System.out.println("detail of student 1");
System.out.println(s.getroll() + s.getname()+s.getmarks());
System.out.println("college= "+student.getclg());
System.out.println("detail of student 2");
System.out.println(s1.getroll()+s1.getname()+s1.getmarks());
System.out.println("college= "+student.getclg());
}}