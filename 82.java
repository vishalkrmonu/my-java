import java.util.Scanner;     //inputstream   read char by char
import java.io.*;
class read{
    public static void main(String[] args) throws Exception{
     FileInputStream fis=new FileInputStream("A1.text");
     int c;
     while(true){
        c=fis.read();
        if(c==-1){
            break;
        }
        System.out.println(c);
     }
     fis.close();
    }
}

class read1{
    public static void main(String[] args) throws Exception{
     FileInputStream fis=new FileInputStream("A1.Text");  
     int c,d=0;
     while(true){
        c=fis.read();
        if(c==-1){
            break;
        }
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            d=d+1;
        }
     } 
     System.out.println(d);
    }
}

class read2{
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("A1.Text");  // read
        FileOutputStream fos=new FileOutputStream("A5.readwrite");   //write
        int c;
        while(true){
            c=fis.read();
            if(c==-1){
                break;
            }
            fos.write(c);
        }
    }
}

class read3{
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("A1.Text");    //read1
        FileInputStream fis1=new FileInputStream("A2.Text");     //read2
        FileOutputStream fos=new FileOutputStream("A6.readwrite");    //write=read1+read2
        int c,d;
        while(true){
            c=fis.read();
            if(c==-1){
                break;
            }
            fos.write(c);}
            while(true){
            d=fis1.read();
            if(d==-1){
                break;
            }
            fos.write(d);}
    }
}

class read4{
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("A1.Text");    //read1
        FileOutputStream fos=new FileOutputStream("A7.readwrite");    //write=read ka reverse
        int c;
        while(true){
            c=fis.read();
            if(c==-1){
                break;
            }
            int i;
            for(i=c.length()-1;i>=0;i++){

            }
    }
}