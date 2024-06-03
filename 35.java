import java.util.Scanner;
import java.util.*;

class  duplicateStr{
    public static void printDupli(String s){  
    int i,j;
    System.out.println("dupalicate char is");
     for(i=0;i<s.length();i++){
     for(j=i+1;j<s.length();j++){
    if( s.charAt(i)==(s.charAt(j))){
    System.out.println(s.charAt(i));
     }  
    }
    }    
   }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s= sc.next();
    printDupli(s);
    }
 } 


        class  removeduplicateStr1{
            public static void removeDupli(String s){
                        int i,j;
                        String v="";
                        System.out.println("dupalicate char is");
                            for(i=0;i<s.length();i++){
                                boolean isdupli=false;
                            for(j=i+1;j<s.length();j++){
                                if( s.charAt(i)==(s.charAt(j))){
                                  //System.out.println(s.charAt(i));
                                  isdupli=true;
                                }     
                            } 
                            if(!isdupli)
                                v=v+s.charAt(i);
                        }
                        System.out.println("after remove duplicate="+v);    
                    }
                    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                       String s= sc.next();
                        removeDupli(s);
                    }
                } 


class removeduplicatestr {
  public static void remove(String s){
    HashSet<Character> set=new HashSet<Character>();
    int i,j;
   for(i=0;i<s.length();i++){
     set.add(s.charAt(i));}
     System.out.println(set);
   }
   public static void main(String[] args) {
   String s="vermaa";
         remove(s);
    }
}

class firstrepaetStr {
    public static void firstdupli(String s){
        int i,j;
            for(i=0;i<s.length();i++){
            for(j=i+1;j<s.length()-1;j++){
                if(s.charAt(i)==s.charAt(j)){
                  System.out.println("1st reapiting elemenet ="+s.charAt(i));
                  break;
                }  
            }
            break;
        }    
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
        firstdupli(s);
    }
}

class firstnonreapetstr {
    public static void FirstNonDupli(String s){
        int i,j;
            for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
                if(i !=j && s.charAt(i)==s.charAt(j)){
                break;
                } 
                if(j==s.length()-1){
            System.out.println("first non reapitng charecter ="+s.charAt(i));
            return;
            } 
            }
            }             
    }      
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       String s=sc.next();
      FirstNonDupli(s);
}
}