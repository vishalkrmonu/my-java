import java.util.ArrayList;
import java.util.Scanner;
class Nov2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> l=new ArrayList<String>();
        int i,j;
        System.out.println("enter the 5 word");
        for(i=1;i<=5;i++){
            l.add(sc.next());
        }
        String p=l.get(0);
        for(i=0;i<p.length();i++){
int c=0;
for(j=1;j<l.size();j++){
    String k=l.get(j);
    if(k.charAt(i)!=p.charAt(i)){
        c=1;
    }
}   
if(c==1){
    break;
}else{
    System.out.println("comman letter is "+p.charAt(i));
}
        }
    }
}


class T{
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        int i,c=0;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=2;i++){
            l.add(sc.next());
        }
        for(String v:l){
            for(i=0;i<v.length();i++){
            if(v.charAt(i)=='A'||v.charAt(i)=='E'||v.charAt(i)=='I'||v.charAt(i)=='O'||v.charAt(i)=='U'||v.charAt(i)=='a'||v.charAt(i)=='A'||v.charAt(i)=='e'||v.charAt(i)=='i'||v.charAt(i)=='o'||v.charAt(i)=='u'){ 
            
                c=c+1;
            }}
            System.out.println(c);
        c=0;
        }
    }}