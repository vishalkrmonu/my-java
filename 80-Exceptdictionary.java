import java.io.*;
import java.util.Scanner;

class M {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("press 1 to add word and meaning");
            System.out.println("press 2 to know the meaning");
            int n = sc.nextInt();
            if (n == 1) {
                String wrd = sc.next();
                String mean = sc.next();
                FileWriter fw = new FileWriter("D.text", true);
                fw.write(wrd + "-" + mean + "\n");
                fw.close();
            }
            if (n == 2) {
                FileReader fr = new FileReader("D.text");
                BufferedReader br = new BufferedReader(fr);
                String line;
                String m = sc.next();
                while ((line = br.readLine()) != null) {
                    String[] z = line.split("-");
                    if (z[0].equals(m)) {
                        System.out.println(z[1]);
                    }
                }
                fr.close();
            }
        }
    }
}