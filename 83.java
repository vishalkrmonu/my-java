import java.io.*;
import java.util.Scanner;

class W {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("A.text");
        fw.write("ashok");
        fw.close();
    }
}

class W1 {
    public static void main(String[] args) throws Exception {
        int r;
        String n;
        Float m;

        FileWriter fw = new FileWriter("A.text1");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data");
        r = sc.nextInt();
        n = sc.next();
        m = sc.nextFloat();
        fw.write(r + " " + n + " " + m + " \n");
        fw.close();
    }
}

class W2 {
    public static void main(String[] args) throws Exception {
        int r, i;
        String n;
        Float m;
        FileWriter fw = new FileWriter("A.text1", true); // same file store
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.println("enter the data");
            r = sc.nextInt();
            n = sc.next();
            m = sc.nextFloat();
            fw.write(r + " " + n + " " + m + " \n");
        }
        fw.close();
    }
}

class W3 {
    public static void main(String[] args) throws Exception {
        String line;
        FileReader fr = new FileReader("A.text1");
        BufferedReader br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}

class W4 {
    public static void main(String[] args) throws Exception {
        int r, sem;
        String n;
        Float m;
        String branch;
        FileWriter fw = new FileWriter("B.txt", true); // same file store
        Scanner sc = new Scanner(System.in);
        String line;
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("enter the data");
            r = sc.nextInt();
            sem = sc.nextInt();
            n = sc.next();
            m = sc.nextFloat();
            branch = sc.next();
            fw.write(r + "," + n + "," + m + "," + sem + "," + branch + "\n");
        }
        fw.close();
        FileReader fr = new FileReader("B.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("enter the roll");
        r = sc.nextInt();
        while ((line = br.readLine()) != null) {
            String[] k = line.split(",");
            if (Integer.parseInt(k[0]) == r) {
                System.out.println(line);
            }
        }
        fr.close();
        br.close();
    }
}