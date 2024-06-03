class Bank implements Runnable {
    int balance = 3000;

    synchronized public void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("go to waiting state");
            try {
                wait();
            } catch (Exception ex) {
            }

        }
        balance = balance - amount;
        System.out.println("after withdrawal amount " + balance);
    }

    synchronized public void depositive(int amount) {
        System.out.println("inside depositive");
        balance = balance + amount;
        System.out.println("after depositive = "+ balance);
        notify();
    }

    public void run() {
        String a = Thread.currentThread().getName();
        if (a.equals("W")) {
            withdrawal(500);
        } else {
            depositive(2000);
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.setName("W");
        t2.setName("D");
        t1.start();
        t2.start();
    }
}