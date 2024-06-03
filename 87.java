import java.util.Scanner;
import java.io.*;
class Student implements Serializable {
    private String name;
    private int id;
    private String dept;

    public void set(String n, int e, String d) {
        name = n;
        id = e;
        dept = d;
    }
    public String getname() {
        return name;
    }
    public int getid() {
        return id;
    }
    public String getdept() {
        return dept;
    }
}
class W2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("c2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int i;
        System.out.println("enter the name ,id, dept");
        for (i = 0; i < 5; i++) {
            Student s = new Student();
            s.set(sc.next(), sc.nextInt(), sc.next());
            oos.writeObject(s);
        }
        oos.close();
        fos.close();
    }
}

class R2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i;
        FileInputStream fis = new FileInputStream("c2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("enter the id ");
        int x = sc.nextInt();
        for (i = 0; i < 5; i++) {
            Student s = (Student) ois.readObject();
            if (x == s.getid()) {
                System.out.println(" name " + s.getname() + " id=" + s.getid() + " dept=" + s.getdept());
            }
        }
        ois.close();
        fis.close();
    }
}