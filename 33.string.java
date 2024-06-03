import java.util.HashMap;
import java.util.Scanner;

class Str{
    public static void duplication(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
           s=s+str.charAt(i);
        }
 System.out.println(s);
    }

    public static void main(String[] args) {
        String str="vishal";
        duplication(str);
    }
}

class palindromStr{
    public static boolean palindrom(String s,int i,int j){
        if(i==j){
            return true;
        }
        else if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        
        return palindrom(s,i+1,j-1);
       
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(palindrom(s,0,s.length()-1));
    }
}

class palindromStr1{
    public static void  palindrom(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
           r=r+s.charAt(i);
        }  
        System.out.println("reverse string is ="+r);  
        if(r.equals(s)){
        System.out.println("string is palindrom");
                }  
                else{
        System.out.println("string is not  palindrom");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
          palindrom(s);
    }
}


// charecter accurancy

class  charoccu{
    public static  void charOcc(String s){
        HashMap<Character,Integer> map =new HashMap<Character,Integer>();
        int i,count=1;
        for(i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);}
        
        else{
        map.put(s.charAt(i),1);
    }
        }
        System.out.println(map);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    charOcc(s);
}
}


 class isomatricStr {
    public static void isomatric(String str1,String str2){
        HashMap<Character,Character>map=new HashMap<Character,Character>();
          
        if(str1.length()!=str2.length()){
            System.out.println("not isomatric");
            return;
        }
        for(int i=0;i<str1.length();i++){
          char c =str1.charAt(i);
          char d=str2.charAt(i);

          if(map.containsKey(c)&& !map.get(c).equals(d)||!map.containsKey(c)&&map.containsKey(d)){
            System.out.println("not isomatric");
              return;
          }
          else{
            map.put(c,d);
          }
        }
        System.out.println("string is isomatric");
    }
    public static void main(String[] args) {
        String str1="naam";
        String str2="keel";
        isomatric(str1,str2);
}
}