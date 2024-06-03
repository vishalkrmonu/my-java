class Leap{
    public static void leap(int year){
if((year % 4 == 0) && (year % 100 ! = 0 ) || year % 400 == 0){
    System.out.println("year is leap yaer");
}else{
    System.out.println("year is  not leap yaer");
}
    }
    public static void main(String[] args) {
        leap(2017);
    }
}


class Gcd{
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,15));
    }
}


class swa{
    public void swap(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("swap number is "+a +" and " + b);
    }
    public static void main(String[] args) {
        swa s=new swa();
        s.swap(34, 87);
    }
}



class fibo{
    public static int fibon(int n){
int a=0,b=1,c;
if(n==0){
    return a;
}
    for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.println(b);
    }
    return b;

    }
    public static void main(String[] args) {
        System.out.println("nth number "+fibon(4));
    }
}


class Fibo2{  
   static int n1=0,n2=1,n3;    
    public static void printFibonacci(int count){    
       if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(count-1);    
        }    
    }    
    public static void main(String args[]){    
        int count=10;   
        int n1=0,n2=1; 
        System.out.print(n1+" "+n2);//printing 0 and 1    
        printFibonacci(count-2);//n-2 because 2 numbers are already printed   
      
    }  
   }  