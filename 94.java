// Thread synchronization or thread safety
// synchronized

class M implements Runnable {
    int a = 1;
    public void run() {
        System.out.println(a);
        a++;
    }
    public static void main(String[] args) {
        M o1 = new M();
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o1);
        Thread t3 = new Thread(o1);
        Thread t4 = new Thread(o1);
        Thread t5 = new Thread(o1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class M1 implements Runnable {
    int a = 1;
    synchronized public void run() {
        System.out.println(a);
        a++;
    }
    public static void main(String[] args) {
        M1 o1 = new M1();
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o1);    //line by line incresed value 
        Thread t3 = new Thread(o1);
        Thread t4 = new Thread(o1);
        Thread t5 = new Thread(o1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

//array list is not synchronization
//vector is synchronization


class M2 implements Runnable{
    int a=3;
    public void run(){
        if(a<=0){
            System.out.println("ticket not available");
        }else{
            System.out.println("ticket number "+a);
            a--;
        }
    }
    public static void main(String[]args){
        M2 o1=new M2();
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o1);
        Thread t3=new Thread(o1);
        Thread t4=new Thread(o1);
        Thread t5=new Thread(o1);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
    }
}

class M3 implements Runnable{
    int a=3;
   synchronized public void run(){
        if(a<=0){
            System.out.println("ticket not available");
        }else{
            System.out.println("ticket number "+a);
            a--;
        }
    }
    public static void main(String[]args){
        M3 o1=new M3();
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o1);
        Thread t3=new Thread(o1);
        Thread t4=new Thread(o1);
        Thread t5=new Thread(o1);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
    }
}