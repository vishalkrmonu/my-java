import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

class M {
    public static void main(String[] args) throws Exception {
        int r, sem;
        String n;
        int m;
        String branch;
        FileWriter fw = new FileWriter("B1.txt");
        Scanner sc = new Scanner(System.in);
        String line;
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("enter the data");
            r = sc.nextInt();
            sem = sc.nextInt();
            n = sc.next();
            m = sc.nextInt();
            branch = sc.next();
            fw.write(r + "," + n + "," + m + "," + sem + "," + branch + "\n");
        }
        fw.close();
        FileReader fr = new FileReader("B1.txt");
        BufferedReader br = new BufferedReader(fr);
        String p = " ";
        int marks = 0;
        while ((line = br.readLine()) != null) {
            String[] v = line.split(",");
            if (Integer.parseInt(v[3]) > marks) {
                m = Integer.parseInt(v[3]);
                p = line;
            }
        }
        System.out.println(p);
        fr.close();
        br.close();
    }
}

class M1 {
    public static void main(String[] args) throws Exception {
        int r, sem;
        String n;
        int m;
        String branch;
        FileWriter fw = new FileWriter("B3.txt");
        Scanner sc = new Scanner(System.in);
        String line;
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("enter the data");
            r = sc.nextInt();
            sem = sc.nextInt();
            n = sc.next();
            m = sc.nextInt();
            branch = sc.next();
            fw.write(r + "," + n + "," + m + "," + sem + "," + branch + "\n");
        }
        fw.close();

        FileReader fr = new FileReader("B3.txt");
        BufferedReader br = new BufferedReader(fr);
        fw = new FileWriter("tmp.txt");
        System.out.println("enter roll");
        r = sc.nextInt();
        while ((line = br.readLine()) != null) {
            String[] y = line.split(",");
            if (r != Integer.parseInt(y[0])) {
                fw.write(line + "\n");
            }
        }
        fw.close();
        fr.close();
        br.close();

        fw = new FileWriter("B3.txt");
        fr = new FileReader("tmp.txt");
        br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            fw.write(line + "\n");
        }
        fw.close();
        fr.close();
        br.close();
    }
}

class M2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r;
        String line;
        FileWriter fw = new FileWriter("tmp.txt");
        FileReader fr = new FileReader("B4.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("enter roll");
        r = sc.nextInt();
        while ((line = br.readLine()) != null) {
            String[] y = line.split(",");
            if (r != Integer.parseInt(y[0])) {
                fw.write(line + "\n");
            }
        }
        fw.close();
        fr.close();
        br.close();
        fw = new FileWriter("B4.txt");
        fr = new FileReader("tmp.txt");
        br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            fw.write(line + "\n");
        }
        fw.close();
        fr.close();
        br.close();
    }
}