import java.util.Scanner;
import java.io.*;

class Student implements Serializable {
    private int roll;
    private String name;

    public void set(int r, String n) {
        roll = r;
        name = n;
    }

    public int getroll() {
        return roll;
    }

    public String getname() {
        return name;
    }
}

class W1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("c1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int i;
        System.out.println("enter the roll,name");
        for (i = 0; i < 5; i++) {
            Student s = new Student();
            s.set(sc.nextInt(), sc.next());
            oos.writeObject(s);
        }
        oos.close();
        fos.close();
    }
}

class R1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int i;
        for (i = 0; i < 5; i++) {
            Student s = (Student) ois.readObject();
            System.out.println("roll= " + s.getroll() + " name " + s.getname());
        }
        ois.close();
        fis.close();
    }
}