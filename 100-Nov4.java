
//create a table searching type ques
import java.util.TreeMap;
import java.net.SocketPermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

class G {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("ashok", 40);
        h.put("rahul", 50);
        System.out.println(h);
        System.out.println("available= " + h.containsKey("ashok"));
        System.out.println("value of ashok " + h.get("ashok"));

        // only string print
        for (String k : h.keySet()) {
            System.out.println(k);
        }
        // string with value print
        for (String k : h.keySet()) {
            System.out.println(k + " " + h.get(k));
        }
    }
}

// TreeMap use for shorting
// LinkedHashMap use for noramlly order
class G1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> t = new TreeMap<String, Integer>();
        t.put("ashok", 40);
        t.put("rahul", 50);
        System.out.println(t);
        System.out.println("available= " + t.containsKey("ashok"));
        System.out.println("value of ashok " + t.get("ashok"));

        // only string print
        for (String k : t.keySet()) {
            System.out.println(k);
        }
        // string with value print
        for (String k : t.keySet()) {
            System.out.println(k + " " + t.get(k));
        }
    }
}

// create table and search by name mobile
class G2 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (i = 1; i <= 5; i = i + 1) {
            System.out.println("enter the name & mob");
            String n = sc.next();
            int m = sc.nextInt();
            h.put(n, m);
        }
        System.out.println("enter the name");
        String z = sc.next();
        if (h.containsKey(z)) {
            System.out.println(h.get(z));
        } else {
            System.out.println("wrong name ");
        }
        System.out.println("enter the valid mob");
        int m = sc.nextInt();
        for (String k : h.keySet()) {
            if (h.get(k) == m) {
                System.out.println(k);
            }
        }
    }
}

class G3 {
    public static void main(String[] args) {
        int i, d, m;
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> h = new HashMap<String, String>();
        HashSet<String> z = new HashSet<String>();
        String p = "";
        for (i = 1; i <= 3; i = i + 1) {
            System.out.println("enter the name & city");
            String name = sc.next();
            String city = sc.next();
            h.put(name, city);
            z.add(city);
        }
        m = 0;
        for (String city : z) {
            d = 0;
            for (String k : h.keySet()) {
                if (h.get(k).equals(city)) {
                    d++;
                }}
            if (d > m) {
                m++;
                p = city;
            }
        }
            System.out.println("maximum population is "+p);
            System.out.println("name is ");
            for (String k : h.keySet()) {
                if (h.get(k).equals(p)) {
                    System.out.println(k);
                }}
    
    }
}
