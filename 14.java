import java.util.Scanner;
class patten{
    public static void main(String[] args){
        int i,j,a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
           for(i=1;i<=a;i++)                //5
           {                               //45
            for(j=1;j<=b;j++)             //345
           {                             //2345
            if(i>=6-j){                 //12345
                 System.out.print(j);
            }
            }
             System.out.println();
        }
       for(i=1;i<6;i++)                //12345
        {                              //2345
            for(j=i;j<6;j++)           //345
           {                          //45
                                     //5
                  System.out.print(j);//patten3
            }
             System.out.println();
        }
         for(i=5;i>=1;i--)                //54321
           {                               //4321
            for(j=i;j>=1;j--)             //321
           {                             //21
               System.out.print(j);     //1  patten 7
            }
             System.out.println();
        }
         
             for(i=1;i<=a;i++)                //1
           {                               //21
            for(j=i;j>=1;j--)             //321
           {                             //4321
               System.out.print(j);     //54321 patten2
            }
             System.out.println();
        }
    }
}