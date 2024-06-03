import java.security.PublicKey;

// class M{
//     public void show(){
//         System.out.println("MAIN CLASS");
//     }
// }
// class N extends M{
//     public void show(){
//         super.show();
//         System.out.println("child class");
//     }
//     public static void main(String[] args){
//         N x=new N();
//         x.show();
//     }
// }

// class circle{
//     protected int r;
//     public void set(in{
//         r=x;
//     }
// public void cal(){
//     System.out.println(3.14*r*r);
// }}
// class Square extends circle{
//     public  void cal() {
//         super.cal();
//         System.out.println(r*r);  
//     }
//     public static void main(String[]args){
// Square s=new Square();
// s.set(7);
// s.cal();
//     }  
// }

class M{
    protected int a,b;
    public void set(int x,int y){
        a=x; b=y;
    }
    public void cal(){
    
    
    System.out.println(a+b);
}}
class N extends M{
    int i,j;
    public void cal(){
        super.cal();
        System.out.println("prime number is ");
        for (i = a; i <= b; i++){ 		 		  
               int  c=0;
           for(j =1; j<i; j++){
          if(i%j==0){
          c = c + 1;
          } }
       if (c ==1){
        System.out.println(i);
      }
     }
    }
}
class P extends N{
    public void cal(){
        super.cal();
        int r=0;
        for (i = a; i <= b; i++){ 		 		  
            int  c=0;
            int z=i;
while(z!=0){
c=z%10;
r=r*10+c;
z=z/10;
}
if(r==i){
    System.out.println(i+ "palindrom");
}
else{
    System.out.println(i+" not palindrom");

}
r=0;
}
    }
    public static void main(String[]args){
        P x=new P();
        x.set(8,15);
        x.cal();
    }
    }
