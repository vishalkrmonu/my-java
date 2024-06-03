class Demo implements Runnable {
    public void run() {
        int i;
        String name = Thread.currentThread().getName();
        if (name.equals("E")) {
            for (i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + "  is even");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                    }
                }
            }
        } else if (name.equals("O")) {
            for (i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " is odd");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                    }
                }
            }
        } else {
            for (i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + " is divisible by three ");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);
        t1.setName("E");
        t2.setName("O");
        t3.setName("T");
        t1.start();
        t2.start();
        t3.start();

    }
}