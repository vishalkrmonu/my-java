import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class M{
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<Integer>();
        int i;
        Scanner sc =new Scanner(System.in);
        for(i=0;i<5;i++){
l.add(sc.nextInt());
        }
        Collections.sort(l);
        System.out.println("after sorting ");
        for(int v:l){
            System.out.println(v);
        }
    }
}

class Student{
    private int roll;
    private String name;
    private float marks;
    public void set(int r,String n,float m){
        roll=r;name=n;marks=m;
    }
    public int getroll(){return roll;}
    public String getname(){return name;}
    public float getmarks(){return marks;}
}
class M1{
    public static void main(String[] args) {
        ArrayList<Student>l=new ArrayList<Student>();
        Scanner sc= new Scanner(System.in);
        int i;
        for(i=1;i<5;i++){
            Student s=new Student();
            s.set(sc.nextInt(), sc.next(),sc.nextFloat());
            l.add(s);
        }
        System.out.println("result");
        float m=0;
        for(Student s:l){
            System.out.println(s.getroll());
            System.out.println(s.getname());
            System.out.println(s.getmarks());
       if(m<s.getmarks()){
           m=s.getmarks();
       }
       System.out.println("max marks  "+m);
    }
    }
}

class Student1 implements Comparable<Student1>{
    private int roll;
    private String name;
    private int marks;
    public void set(int r,String n,int m){
        roll=r;name=n;marks=m;
    }
    public int getroll(){return roll;}
    public String getname(){return name;}
    public int getmarks(){return marks;}
    public int compareTo(Student1 s1){return this.marks-s1.marks;}
}
class M2{
    public static void main(String[] args) {
        ArrayList<Student1>l=new ArrayList<Student1>();
        Scanner sc= new Scanner(System.in);
        int i;
        for(i=1;i<5;i++){
            Student1 s=new Student1();
            s.set(sc.nextInt(), sc.next(),sc.nextInt());
            l.add(s);
        }
        System.out.println("result");
        Collections.sort(l);
        for(Student1 s:l){
            System.out.println(s.getroll());
            System.out.println(s.getname());
            System.out.println(s.getmarks());
        }
    }
}