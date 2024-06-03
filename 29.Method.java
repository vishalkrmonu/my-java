import java.util.Scanner;

class Method{
    void add(){
        int a=3,b=5,fact=1,j,c=0,i;
        int s=a+b;
        
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
for(i=1;i<n;i++){
    if(n%i==0){
        c=c+1;
    }}
if (c ==1){
    System.out.println(n+" is prime number ");
}
else{
    System.out.println("no prime number " +n);
 
}
        for(j=1;j<=n;j++)
        {
            fact=fact*j;
        }
            System.out.println("Factorial of " +n+ " is = "+fact);
System.out.println("vishal");
System.out.println("sum =" +s);

    }
    public static void main(String[]args){
        Method obj=new Method();
        obj.add();
    }
}