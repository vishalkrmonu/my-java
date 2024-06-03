import java.util.Scanner;

class Employe{
    private String name;
    private float price;
    private float discount;

public void set(String n,float p,float d ){
    name=n;
    price =p;
    discount=d;
}
public String getname(){ return name;}
public float getprice(){ return price;}
public float getdiscount(){ return discount;}
public float getact(){  return price-price*discount/100;}
}
class p{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   // float t,t1,t2;

   Employe s2=new Employe();
   System.out.println("enter the employe s2 ");
   s2.set(sc.next(),sc.nextFloat(),sc.nextFloat());
   System.out.println(s2.getname()+s2.getprice()+s2.getdiscount());
    // t2=s2.getprice()-(s2.getprice()*s2.getdiscount()/100);
    // System.out.println(t2);

    Employe s=new Employe();
    s.set("a" ,400,10);
    System.out.println(s.getname() + s.getprice() + s.getdiscount());
//    t=s.getprice()-(s.getprice()*s.getdiscount()/100);
//    System.out.println(t);

    Employe s1=new Employe();
    s1.set("b",200,20);
    System.out.println(s1.getname() + s1.getprice() + s1.getdiscount());
    // t1=s1.getprice()-(s1.getprice()*s1.getdiscount()/100);
    // System.out.println(t1);
 
if(s.getact()>s1.getact()&&s.getact()>s2.getact()){
System.out.println("after discount large amount of employe s is = "+s.getact());
}
else {
    System.out.println("after discount large amount of employe s1 is  "+s1.getact());
}
}}