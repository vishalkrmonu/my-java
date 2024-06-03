import java.util.Scanner;

//method with return value
class method{
    int fact(){
        int i,n,fact=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        method obj=new method();
        System.out.println("factorial is="+obj.fact());
}
}