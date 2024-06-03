import java.io.*;
class Student implements Serializable{
    private int roll;
    private String name;
    public void set(int r,String n){
        roll=r; name=n;
    }
    public int getroll(){return roll;}
    public String getname(){return name;}
}
class W{
    public static void main(String[]args)throws Exception{
        FileOutputStream fos=new FileOutputStream("c.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s=new Student();
        s.set(101,"vishal");
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}

class R{
    public static void main(String[]args)throws Exception{
        FileInputStream fis=new FileInputStream("c.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s=(Student)ois.readObject();
        System.out.println(s.getroll());
        System.out.println(s.getname());
        ois.close();
        fis.close();
    }}

