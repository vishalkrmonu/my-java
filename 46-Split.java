import java.util.Scanner;

class Split {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

 //   int i;
//     String x="a,b,cde,fgh,ijk";
//     String[]y=x.split(",");
// for(i=0;i<y.length;i++){
//     System.out.print(y[i]);
// }

// int i,s=0;
// String x=sc.next();
// String[]y=x.split(",");
//  for(i=0;i<y.length;i++){
//     s=s+Integer.parseInt(y[i]);
//  }
//     System.out.print(s);

// 
// int i;
//     String x="a,b,cde,fgh,ijk";
//     String[]y=x.split(",");
// for(i=y.length-1;i>=0;i--){
//     System.out.print(y[i]);
// }

// int i;
//     String x="vishal,gupta,monu";
//     String[]y=x.split(",");
// for(i=0;i<y.length;i++){

//  if(i==y.length-1){
//     System.out.println(y[i]);
//  }
//  else{
//     System.out.println(y[i].charAt(0));
//  }}
 
int i,j;
    String x="vishal,gupta,monu";
    String[]y=x.split(",");
for(i=0;i<y.length;i++){
    String k="";
for(j=y[i].length()-1;j>=0;j--){
k=k+y[i].charAt(j);
}
    System.out.println(k);
}
}}