import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Nov5 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<Integer>>h=new HashMap<String,ArrayList<Integer>>();
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name and 3 sub marks");

        for(i=1;i<=5;i++){
            String n=sc.next();
            ArrayList<Integer> l=new ArrayList<Integer>(); 

            for(j=1;j<=3;j++){
l.add(sc.nextInt());
            }
            h.put(n, l);
        }
        System.out.println("output");
        for(String k:h.keySet()){
            System.out.println(k);
            for(int v:h.get(k)){
                System.out.println(v);
            }
        }
    }
}
