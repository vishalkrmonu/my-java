import java.util.Scanner;
class Twod{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i,j,s=0,t=0,m=0,t1=0;
        int [][]a=new int [3][3];
System.out.println("element");

for(i=0;i<a.length;i++){
for(j=0;j<a[i].length;j++){
a[i][j]=sc.nextInt();
if(i==j){
    s=s+a[i][j];
}
if((i+j)==2){
    m=m+a[i][j];
}
}
}
System.out.println(" sum of diagonal opp=" +m);

System.out.println(" sum of diagonal =" +s);


for(i=0;i<a.length;i++){
    for(j=0;j<a[i].length;j++){
        System.out.print( " "+a[i][j]);

        
    }

System.out.println();
}
for(i=0;i<a.length;i++){
    t=0;t1=0;
    for(j=0;j<a[i].length;j++){
        t=t+a[i][j];
        t1=t1+a[j][i];
    }
    System.out.println("sum of column =" +t1);

System.out.println("sum of row =" +t);
 }
 System.out.println("transpose is ");

 for(i=0;i<a.length;i++){
    for(j=0;j<a[i].length;j++){
        System.out.print( " "+a[j][i]);
    }
    System.out.println();

 }
}
}