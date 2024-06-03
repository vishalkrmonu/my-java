import java.util.Scanner;
class Mn2{
    public static void main(String[]args){
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the letter");
        String x=sc.nextLine();
        System.out.println(x.length());
       // System.out.println(x.charAt(0));
        for(i=0;i<x.length();i++){
            for(j=0;j<x.length();j++){
System.out.print("");
        
        }
        for(j=0;j<=i;j++){
        
        System.out.print(x.charAt(j));
        }
System.out.println();
        }

    }}
