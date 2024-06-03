class M{
    public void show(){
        System.out.println("monu");
    }
}
class N extends M{
    public void display(){                           //method
        System.out.println("sonu");
    }
public static void main(String[]args){
    N x=new N();
    x.show();
    x.display();
}}

/*class student{ 
    private int roll;                                 //overloading +method +constraction + diff parameter
    private String name;
    public void set(int r,String n){                   // diff parameter in setter 
      roll =r;
      name=n;
    }
    public int getroll(){return roll;}
    public String getname(){return name ;}
}  
class marks extends student{
    float m1,m2,m3;
    public void set(float x,float y,float z){
        m1=x;m2=y;m3=z;
    }
    public float gettotal(){return m1+m2+m3 ;}
    public static void main(String[]args){
        marks m=new marks();
        m.set(101,"monu");
        m.set(56,87,98);
        System.out.println("student details "+m.getroll()+" " + m.getname()+" total marks = " +m.gettotal());
    }
}*/

// class Data{
// protected int a;
// public void set(int x){
//     a=x;
// }}
// class D2 extends Data{
//     public void cal(){
//         int i,f=1;
//         for(i=a;i>=1;i--){
//             f=f*i;
//         }
//         System.out.println(f);
//     }
// }
// class D3 extends D2{  
//     public void cal2(){
// int m=a,b,r=0;
// while(a!=0){
// b=a%10;
// r=r*10+b;
// a=a/10;
// }
// if(r==m){
//     System.out.println("palindrom");
// }
// else{
//     System.out.println(" not palindrom");

// }
//     }

// public static  void main(String[]args) {
//     D3 d=new D3();
//     d.set(12);
//     d.cal();
//     d.cal2();
// }}


class shape{
    protected int a;
    public void set(int x){
        a=x;
    }}
class circle extends shape{
    public void cal() {
        System.out.println(3.14*a*a);
    }}
class Square extends shape{
    public void cal2(){
        System.out.println(a*a);
    }
public static void main(String[]args) {
    circle c=new circle();               //create a obj
    Square s=new Square();
    c.set(3);                 
    s.set(2);                             
    c.cal();                //call
    s.cal2();
}}