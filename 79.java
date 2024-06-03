import java.util.Scanner;

// import java.io.IOException;

// class R5{
//     public void show()throws IOException{
//         throw new IOException();
//     }
//     public static void main(String[]args){
//         R5 o=new R5();
//         try{
//         o.show();
//         }
//         catch(IOException r){
//             System.out.println("io exception");
//         }
//     }
// }
// import java.util.Scanner;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.sql.SQLException;
// class P{
//     public void show() throws FileNotFoundException,IOException,SQLException{
//         Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number");
//     int a=sc.nextInt();
//     if(a>0){throw new IOException();}
//     else if(a<0){throw new FileNotFoundException(); }
//     else{throw new SQLException();}
//     }
//     public static void main(String[]args){
// P o=new P();
// try{
//     o.show();
// }
// catch(FileNotFoundException h){
//     System.out.println("file error");
// }
// catch(IOException e){
//     System.out.println("io exception");
// }

// catch(SQLException c){
//     System.out.println("sql exception");
// }
// }}

// import java.util.Scanner;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.sql.SQLException;
// class P1{
//     public void show() throws FileNotFoundException,IOException,SQLException{
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the array");
//         int []x=new int [6];
//         int c=0,d=0,i;
//         for(i=0;i<6;i++){
//             x[i]=sc.nextInt();
        
//         if(x[i]%2==0){
//             c=c+1;
//         }
//         else{
//             d=d+1;
//         }  }
//         if(c>d){throw new IOException();}
//         else if(c<d){throw new FileNotFoundException(); }
//         else{throw new SQLException();}
//     }
//         public static void main(String[]args){
//             P1 o=new P1();
//             try{
//                 o.show();
//             }
//             catch(FileNotFoundException h){
//                 System.out.println("file error");
//             }
//             catch(IOException e){
//                 System.out.println("io exception");
//             }
            
//             catch(SQLException c){
//                 System.out.println("sql exception");
//             }
    //     }
    // }


class P2{
    public static void main(String[]args){
        int a=4,b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System .out.println("error");
        }
        finally{
            System.out.println("this is finally block");
        }
    }
}

class BalanceException extends Exception{
    public String toString(){
        return "balance can not be -ve";
    }
    public static void main(String[]args)throws BalanceException{
Scanner sc=new Scanner(System.in);
System.out.println("enter the balance");
int bal=sc.nextInt();
if(bal>0){
    System.out.println(bal);
}
else {
    throw new BalanceException();
}
    }
}

class MarksException extends Exception{
    public String toString(){
        return "marks is not less than 0 or gretter than 100";
    }
    public static void main(String[]args)throws MarksException{
        Scanner sc=new Scanner(System.in);
        int i;
        int[]x=new int[5];
        System.out.println("enter the marks");
        for(i=0;i<5;i++){
           x[i]=sc.nextInt();
System.out.println( "marks is" +x[i]);
        }
for(i=0;i<5;i++){
if(x[i]>0&&x[i]<100){
    System.out.println("valid marks "+x[i]);
}
else{
    throw new MarksException();
}
 }   }
    }

    class NotException extends Exception{
        public String toString(){
            return "india is not found";
        }
        public static void main(String[]args) throws NotException{
            Scanner sc= new Scanner(System.in);
            String x=sc.nextLine();
            if(x.indexOf("india")==-1){
                throw new NotException();
            }
            else{
System.out.println("valid");
            }
        }
    }

