import java.util.Scanner;
class ArrayJagged{
public static void main(String[]args){
    int i,j,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of row");
    int x[][]=new int[sc.nextInt()][]; 
    System.out.println("enter the size of column");     
     x[0]=new int[sc.nextInt()];                //  int[][]x=new int[3][];
     x[1]=new int[sc.nextInt()];                   //x[0]=new int[2];
     x[2]=new int[sc.nextInt()];                      // x[1]=new int[5];
                                                      // x[2]=new int[3];                                     
    System.out.println("enter the element");
    for(i=0;i<x.length;i++){
    for(j=0;j<x[i].length;j++){
     x[i][j]=sc.nextInt();
    }
    }
    for(i=0;i<x.length;i++){
        s=0;
        for(j=0;j<x[i].length;j++){
        System.out.print(" "+x[i][j]); 
        s=s+x[i][j];
        
        }
    System.out.println( " ="+s);
    System.out.println();
    }
}
}