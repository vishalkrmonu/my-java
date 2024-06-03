import java.util.*;  
import java.util.Scanner;  

class vector{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}

 
class vector1{ 
public static void main(String args[]){ 
    int i;
    Scanner sc =new Scanner(System.in); 
Vector<Integer> v=new Vector<Integer>();  
for(i=0;i<5;i++){
v.add(sc.nextInt()); 
}
ListIterator<Integer> itr=v.listIterator(); 
System.out.println("output is ");   
while(itr.hasNext()){  
System.out.println(itr.next());   
}  
System.out.println("output is ");   
while(itr.hasPrevious()){  
System.out.println(itr.previous());   
} 
}}

class vector2{  
    public static void main(String args[]){ 
        int i;
        Scanner sc =new Scanner(System.in); 
    Vector<Integer> v=new Vector<Integer>();  
    for(i=0;i<5;i++){
    v.add(sc.nextInt()); 
    }
    ListIterator<Integer> itr=v.listIterator(); 
    System.out.println("output is ");   
    while(itr.hasPrevious()){  
    System.out.println(itr.previous());   
    }  
    }}