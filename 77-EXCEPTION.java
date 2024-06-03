import java.util.function.ObjDoubleConsumer;

class M{
    public static void main(String[]args){
        int a=4,b=0,c;
        System.out.println("x");                      //exception handling for ArithemeticException
        System.out.println(a/b);
        System.out.println("y");
    }
}

class M1{
    public static void main(String[]args){
        int a=4,b=0;
        System.out.println("ashok");
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException g){
            System.out.println("number is not divide by zero");
        }
        System.out.println("y");
    }
}

class Mn{
    public static void main(String[]args){              //exception handling for ArrayIndexOutOfBoundsException variable
        int x[]=new int[5];
        System.out.println(x[7]);
    }
}

class Mn1{
    public static  void main(String[]args){
        int x[]=new int [5];
        try{
            System.out.println(x[7]);
        }
        catch(ArrayIndexOutOfBoundsException g){
            System.out.println("index of array is not here");
        }
        System.out.println("y");
    }
}


class Mg{
    public static void main(String[]args){
        int a=Integer.parseInt("ashok");                       //exception handling for  NumberFormatException
        System.out.println("babu");
    }
}

class Mg1{
    public static void main(String[]args){
        try{
            int a=Integer.parseInt("ashok");
        }
        catch( NumberFormatException g){
            System.out.println("don't convert string to number");
        }
        System.out.println("babu");
    }
}


class Mh{
    public static void main(String[]args){
        int[]x=new int[5];                               //exception handling for ArrayIndexOutOfBoundsException
        int b=0;
        System.out.println(x[7]/b);
    }
}

class Mh1{
    public static void main(String[]args){
        int[]x=new int[5];                             
        int b=0;
        try{
        System.out.println(x[7]/b);
        }
        catch(ArrayIndexOutOfBoundsException g){
            System.out.println("index of array is not here");
        }
        // catch(ArithemeticException h){
        //     System.out.println("correction");
        // }
    }
}


class Mk{
    public static void main(String[]args) {
        int a=Integer.parseInt(args[0]);           //  given value with runtime example:java Mk 4 6
        int b=Integer.parseInt(args[1]);
        System.out.println("sum is ="+(a+b));
        try{
            System.out.println(a/b);
          }
          catch(ArithmeticException r){
            System.out.println("number can't be divide by zero ");
          }
          }
}