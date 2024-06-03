class prime extends Thread {
    public void run() {
        int i, j, c = 0;
        for (i = 1; i <= 100; i++) {
            for (j = 1; j <i; j++) {
                if (i % j == 0) {
                    c++;
                } }
            if (c == 1) {
                System.out.println(i + "  is prime");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }}
            c = 0;
        }}}
class palindrom extends Thread {
    public void run() {
        int r = 0, n, i, b;
        for (i = 1; i <= 100; i++) {
            n = i;
            while (n != 0) {
                b = n % 10;
                r = r * 10 + b;
                n = n / 10;
            }
            if (i == r) {
                System.out.println(i + " is palindrom");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
            r = 0;
        }}}
class armstrong extends Thread {
    public void run() {
        int r = 0, n, i, b;
        for (i = 1; i <= 100; i++) {
            n = i;
            while (n != 0) {
                b = n % 10;
                r = r + b * b * b;
                n = n / 10;
            }
            if (i == r) {
                System.out.println(i + " is armstrong");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
            r = 0;
        }
    }
    public static void main(String[] args) {
        prime p = new prime();
        p.setPriority(7);
        palindrom p1 = new palindrom();
        p1.setPriority(6);
        armstrong a = new armstrong();
        a.setPriority(5);
        p.start();
        p1.start();
        a.start();
     }
}

//  Runnable interface

class M implements Runnable{
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
    M o1=new M();
    Thread t1=new Thread(o1);
    Thread t2=new Thread(o1);
    Thread t3=new Thread(o1);
    t1.start();
    t2.start();
    t3.start();

}
}