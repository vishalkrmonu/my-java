import java.util.Scanner;
import java.util.Arrays;
class x{
    int[] a=new int[5];
    public void input(){
        int i;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the array");
    
   for(i=0;i<5;i++){
    a[i]=sc.nextInt();
   }
}}
class w extends x{
    public void cal(){
        super.input();
        int i;
        int m=0;
        for(i=0;i<5;i++){
        if(m<a[i]){
        m=a[i];
        }}
        System.out.println(" max num is"+m);
     }}
class y extends x{
    public  void cal(){
        super.input();
        int i,j,m;
        for(i=0;i<5;i++){
        for(j=i+1;j<5;j++){
            if(a[i]>a[j]){
                m=a[i];
              a[i]=a[j];
              a[j]=m;
            }}}
        System.out.println("min num is"+a[0]);
    }}
class z extends x{
    public void cal(){
        super.input();
        Arrays.sort(a);
        int i;
        System.out.println( "acending order is");
        for(i=0;i<5;i++){
            System.out.println(a[i]);
        }}
         public static void main(String[] args){
            z s=new z();
            w n=new w();
            y m=new y();
        
            s.cal();
        
            n.cal();
            
            m.cal();
         }}
          