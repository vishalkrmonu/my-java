import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.Collections;

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
class M implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.getroll()>s2.getroll()){
            return 1;
        }else{
            return -1;
        }
    }
}
class N implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.getname().compareTo(s2.getname())>0){
            return 1;
        }else{
            return -1;
        }
    }
}
class P implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.getmarks()>s2.getmarks()){
            return 1;
        }else{
            return -1;
        }
    }
}

class T{
    public static void main(String[] args) {
        ArrayList<Student>l=new ArrayList<Student>();
        Scanner sc= new Scanner(System.in);
        int i;
        for(i=1;i<5;i++){
            Student s=new Student();
            s.set(sc.nextInt(), sc.next(),sc.nextFloat());
            l.add(s);
        }
        System.out.println("soting by roll");
        Collections.sort(l,new M());
        for(Student s:l){
            System.out.println(s.getroll());
            System.out.println(s.getname());
            System.out.println(s.getmarks());
        }
        System.out.println("sorting by name");

        Collections.sort(l,new N());
        for(Student s:l){
            System.out.println(s.getroll());
            System.out.println(s.getname());
            System.out.println(s.getmarks());
        }
        System.out.println("sorting by marks");

        Collections.sort(l,new P());
        for(Student s:l){
            System.out.println(s.getroll());
            System.out.println(s.getname());
            System.out.println(s.getmarks());
        }
    }
}

  
 class list{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("monu");  
al.add("Ajay");  
ListIterator<String> itr=al.listIterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
System.out.println("output is ");  
while(itr.hasPrevious()){
System.out.println(itr.previous());  

}
}  
}  

class list1{  
    public static void main(String args[]){  
    LinkedList<Integer> al=new LinkedList<Integer>();  
    int s=0;
    al.add(10);  
    al.add(20);  
    al.add(30);  
    al.add(40);  
   ListIterator<Integer> itr=al.listIterator();  
    while(itr.hasNext()){ 
        int a=itr.next(); 
    System.out.println(a); 
    s=s+a;
 }  
 System.out.println("sum of number  "+s);
System.out.println("output is ");  
    while(itr.hasPrevious()){
    System.out.println(itr.previous());  
    
    }
    }  
    }