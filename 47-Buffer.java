import java.util.Scanner;

class Buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // StringBuffer sb = new StringBuffer("vishal");
        // System.out.println(sb);
        // sb.append("a");
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        // String y = sb.toString();
        // System.out.println(y);

        // String x = sc.next();
        // StringBuffer sb = new StringBuffer(x);
        // sb.reverse();
        // String y = sb.toString();
        // if (x.equalsIgnoreCase(y)) {
        // System.out.println("palindrom");
        // } else {
        // System.out.println(" not palindrom");
        // }

        int i;
        String k="";
         String x = sc.next();

        String[] y = x.split("@");

       for (i = 0; i < y.length; i++) {
        String[] z = y[i].split(",");
        StringBuffer sb=new StringBuffer(z[1]);
        sb.reverse();
        k=k+z[0]+","+sb+","+z[2]+"@";
       }
           System.out.print(k);


       }

        
    }
