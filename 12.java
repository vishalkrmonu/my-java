class Day20{
    public static void main(String[]args){
        int i,j,c;
           for(i=1;i<=5;i++){                       // *
            for(j=1;j<=i;j++){                      // **
                System.out.print("*");             //  ***
                                                   //  ****
            }                                     //   ***** 
            System.out.println();
        }

        for(i=1;i<=5;i++){                   //opp
            for(j=1;j<=6-i;j++){             
                System.out.print("*");     
                                             
            }                                
            System.out.println();
        }
        
        for(i=0;i<=4;i++){                //   1
            for(j=1;j<=2*i+1;j++){        //   123
                System.out.print(j);      //   12345
                                          //   1234567
            }                             //   123456789
            System.out.println();
    }
    
    for(i=0;i<=4;i++){                        // opp
        for(j=1;j<=9;j++){
            if(j<=9-2*i){
            System.out.print(j);

        }} 
        System.out.println();
}

for(i=0;i<=4;i++){                 //  1
    for(j=1;j<=9;j++){             //  23
        if(j>=i+1 && j<=2*i+1){    //  345
        System.out.print(j);       //  4567
    }}                             //  56789
   System.out.println();
}



}}