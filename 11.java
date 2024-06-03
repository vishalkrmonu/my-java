class Day19{
    public static void main(String[]args){
     int i,j,c=2;
      for(i=1;i<=5;i++){               //  1
        for(j=1;j<=i;j++){              //   10
            System.out.print(j%2);      //   101
        }                              //    1010
                                       //    10101
     System.out.println();
    }
    for(i=1;i<=5;i++){
        for(j=5;j>=i;j--){                   //opp
            System.out.print(j%2);
        }
     System.out.println();
    }                                        //   1
     for(i=1;i<=5;i++){                    //     01
        for(j=i;j>=1;j--){                 //     101
            System.out.print(j%2);         //     0101
        }                                  //     10101
     System.out.println();
    }


    for(i=1;i<=5;i++){              //    1
        for(j=1;j<=i;j++){            //  22
            System.out.print(i);      //  333
        }                            //   4444
     System.out.println();             // 55555
    }

    for(i=5;i>=1;i--){                //opp
        for(j=1;j<=i;j++){
            System.out.print(i);
        }
     System.out.println();
    }

    for(i=5;i>=1;i--){                 //     5
        for(j=5;j>=i;j--){             //     44
            System.out.print(i);       //     333
        }                              //     2222
     System.out.println();             //     11111
    }
    for(i=1;i<=4;i++){                           // 1
        for(j=1;j<=i;j++){                       // 23     c=1
            System.out.print(c);                 // 456
            c=c+1;                              // 78910
        }                                      
     System.out.println();             
    }
    for(i=1;i<=4;i++){                           //opp
        for(j=1;j<=i;j++){                       
            System.out.print(c);           //c=10   
            c=c-1;                           
        }                                       
     System.out.println();             
    }
    for(i=1;i<=4;i++){                                 //  2        
        for(j=1;j<=i;j++){                             //  46
            System.out.print(c);           //c=2      //   81012
            c=c+2;                                    //   14161820
        }                                       
     System.out.println();             
    }
}}