// hall ticket 
class Ticket extends Thread{
    public void run(){
        int i;
        for(i=0;i<=100;i++){
            System.out.println("issue "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }}}
}
class Hall extends Thread{
    public void run(){
        int i;
        for(i=0;i<=100;i++){
            System.out.println("entry ticket "+i);
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
            }}
    }
    public static void main(String[]args){
        Ticket t=new Ticket();
        Hall h=new Hall();
        t.start();
        h.start();
    }
}

// type of thread
// 1.join 2.getName() 3.getPriority() 4.setName()
// 5.current Thread 6.setPriority()


class G extends Thread{
    public void run(){
        int i;
        for(i=0;i<=100;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }

    }
    public static void main(String[]args){
G o1=new G();
G o2=new G(); 
G o3=new G();
o1.start();
o2.start(); 
o3.start();//o2.join(); jab tak o2 khtm nhi hoga tab tak o3 nhi aayega
    }
}

class G1 extends Thread{
    public static void main(String[]args){
        G1 o1=new G1();
        G1 o2=new G1();
System.out.println("name of first thread "+o1.getName());
System.out.println("name of second thread "+o2.getName());
o1.setName("A");
o2.setName("B");
System.out.println("after change name of thread "+ o1.getName());
System.out.println("after change name of thread "+ o2.getName());
    }
}

class G2 extends Thread{
    public static void main(String[]args){
        G2 o1=new G2();
        G2 o2=new G2();
System.out.println("priority of 1st thread "+o1.getPriority());
System.out.println("priority of 2nd thread "+o2.getPriority());
o1.setPriority(7);
o2.setPriority(8);
System.out.println("after change "+o1.getPriority());
System.out.println("after change "+o2.getPriority());
    }
}