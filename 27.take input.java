import java.util.Arrays;

class M1 {
    public static void main(String[] args) {
        int s = 0, i, m = 0;
        // for(i=0;i<args.length;i++){

        // s=s+Integer.parseInt(args[i]);

        // if(m<Integer.parseInt(args[i])){
        // m=Integer.parseInt(args[i]);
        // }}
        // System.out.println( " max is =" +m);
        // System.out.println("sum is "+s);

        int[] x = new int[args.length];
        System.out.println("acending order is ");

        for (i = 0; i < args.length; i++) {
            x[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(x);
        for (i = 0; i < args.length; i++) {
            System.out.println(x[i]);
        }

    }
}