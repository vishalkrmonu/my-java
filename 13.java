class Day21{
    public static void main(String[]args){
     int i,j,c=2;
     
      for(i=1;i<=5;i++){               
        for(j=1;j<=5;j++){              
            System.out.print(j);      
        }
        for(j=5;j>=1;j--) {
            System.out.print(j);

        }                 
            System.out.println();                           
     
    }
   
    for(i=1;i<=5;i++)
    {
        for(j=4;j>=i;j--)
       {
        System.out.print(" ");
    }
    for(j=1;j<=i;j++){
         System.out.print(j);
    }
System.out.println();
}


for(i=1;i<=5;i++)
{
    for(j=4;j>=i;j--)
   {
    System.out.print(" ");
}
for(j=1;j<=i;j++){
     System.out.print("* ");
}
System.out.println();
}




for(i=1;i<=5;i++)
{
    for(j=4;j>=i;j--)
   {
    System.out.print(" ");
}
for(j=1;j<=i;j++){
     System.out.print(j);
}
for(j=i-1;j>=1;j--){
    System.out.print(j);
}
System.out.println();
}


for(i=1;i<=5;i++){                         //     *****
    for(j=1;j<=5;j++){                       //   *   *
        if(i==1||i==5||j==1||j==5){          //   *   *
    System.out.print("*");                 //  *   *
}                                            //   *****
else{
   System.out.print(" ");
} }
System.out.println();

}

for(i=1;i<=5;i++){             //   *
    for(j=1;j<=5;j++){         //     *
        if(i==j){              //       *
    System.out.print("*");   //         * 
}                               //           *
else{
   System.out.print(" ");
} }
System.out.println();

}

for(i=1;i<=5;i++){
    for(j=5;j>=1;j--){
        if(i==j){                 //opp
    System.out.print("*");
}
else{
   System.out.print(" ");
} }
System.out.println();
}

for(i=0;i<=4;i++){
    for(j=1;j<=9;j++){
        if(j==i+1||j==9-i){              // add two above
    System.out.print("*");
}
else{
   System.out.print(" ");
} }
System.out.println();

}

for(i=0;i<=4;i++){
    for(j=1;j<=9;j++){
        if(j==i+1||j==9-i){      
    System.out.print("*");
}
else{
   System.out.print(" ");
} }
System.out.println();

}


for(i=1;i<=7;i++){
    System.out.print("*");}
System.out.println();

for(i=1;i<=6;i++){
    for(j=1;j<=6;j++){
        if(j==1||j==7-i){
System.out.print("*");
        }
        else{
            System.out.print(" ");
         }
    }
System.out.println();

}




for(i=1;i<=7;i++){
    for(j=1;j<=7;j++){
        if(i==1||j==1||j==8-i){
System.out.print("*");
        }
        else{
            System.out.print(" ");
         }
    }
System.out.println();

}

}}


