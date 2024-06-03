import java.io.*;
import java.util.Scanner;             //  fileoutputStream   write char by char    
class D{
public static void main(String[] args) throws Exception{
FileOutputStream fos=new  FileOutputStream("A.Text");
fos.write('A');
fos.write('B');
fos.write('C');
fos.close();
}
}


class N{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new  FileOutputStream("A1.Text");
        Scanner sc=new Scanner(System.in); 
        String x=sc.next();
        int i;
        for(i=0;i<x.length();i++){
            fos.write(x.charAt(i));
        }
    }
}

class reverse{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new  FileOutputStream("A2.Text");
        int i;
        Scanner sc=new Scanner(System.in); 
        String x=sc.next();
        for(i=x.length()-1;i>=0;i--){
            fos.write(x.charAt(i));
        }
    }
    
}

class vowel{          //vowel remove
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new  FileOutputStream("A3.Text");
        Scanner sc=new Scanner(System.in); 
      String x=sc.next();
      int i;
      for(i=0;i<=x.length()-1;i++){
      if(x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='I'||x.charAt(i)=='O'||x.charAt(i)=='U'||x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u'){
    
      }
      else{
        fos.write(x.charAt(i));
      }
      }
}
}

//upercase to lowercase
class canvert{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new  FileOutputStream("A4.Text");
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        int i;
        for(i=0;i<x.length()-1;i++){
         if(x.charAt(i)>=65&&x.charAt(i)<=90){
            fos.write(x.charAt(i)+32);
         }
         else if(x.charAt(i)>=97&&x.charAt(i)<=122){
            fos.write(x.charAt(i)-32);
         }
         else{
            fos.write(x.charAt(i));
         }
        }
    }
}