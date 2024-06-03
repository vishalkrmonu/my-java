import java.awt.*;
import java.awt.event.*;


class M extends Frame implements ActionListener{                  
    Button b1,b2;
    M(){                                  //AWTListener
       b1=new Button("ok");
       b2=new Button("ok2");
add(b1);
add(b2);
GridLayout g=new GridLayout(1,2);
        setLayout(g);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public static void main(String[]args){
        M x=new M();
        x.setSize(1000,500);
        x.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            System.out.println("A");
        }
        else{
            System.out.println("Bs");

        }
    }
}




class M1 extends Frame implements ActionListener {
    Button b1, b2, b3, b4;
    TextField t1, t2;
    Label l1, l2;

    M1() {
        setLayout((null));
        l1 = new Label("num 1");
        l2 = new Label("num 2");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        l1.setBounds(20, 50, 50, 30);
        t1.setBounds(80, 50, 50, 30);
        l2.setBounds(150, 50, 50, 30);
        t2.setBounds(210, 50, 50, 30);
        b1.setBounds(40, 100, 50, 50);
        b2.setBounds(100, 100, 50, 50);
        b3.setBounds(40, 170, 50, 50);
        b4.setBounds(100, 170, 50, 50);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public static void main(String[] args) {
        M1 x = new M1();
        x.setSize(1000, 500);
        x.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b;
        if (e.getSource() == b1) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            System.out.println(a + b);
        } else if (e.getSource() == b2) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            System.out.println(a - b);
        } else if (e.getSource() == b3) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            System.out.println(a * b);
        } else {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            System.out.println(a / b);
        }
    }
}



class M1 extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2;
    Choice c3;
    Button b1;

    M1() {
        setLayout(null);
        l1 = new Label("num 1");
        l2 = new Label("num 2");
        l3 = new Label("num 3");
        t1 = new TextField();
        t2 = new TextField();
        c3 = new Choice();
        c3.add("");
        int i;
        for (i = 1; i < 100; i++) {
            c3.add(i + "");
        }
        b1 = new Button("% cal");
        l1.setBounds(20, 50, 50, 30);
        l2.setBounds(20, 90, 50, 30);
        l3.setBounds(20, 130, 50, 30);
        t1.setBounds(80, 50, 50, 30);
        t2.setBounds(80, 90, 50, 30);
        c3.setBounds(80, 130, 50, 30);
        b1.setBounds(100, 200, 50, 50);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(c3);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        M1 x = new M1();
        x.setSize(1000, 500);
        x.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b, c;
        if (e.getSource() == b1) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            c = Integer.parseInt(c3.getSelectedItem());
            System.out.println((a + b + c) * 100 / 300);
        }
    }
}

class M2 extends Frame implements ActionListener {
    Label l1;
    TextField t1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    M2() {
        setLayout(null);
        l1 = new Label("num");
        t1 = new TextField();
        b1 = new Button("prime");
        b2 = new Button("palindrom");
        b3 = new Button(" factorial");
        b4 = new Button(" armstrong");

        l1.setBounds(20, 50, 50, 30);
        t1.setBounds(80, 50, 50, 30);
        b1.setBounds(50, 100, 60, 50);
        b2.setBounds(120, 100, 60, 50);
        b3.setBounds(50, 200, 60, 50);
        b4.setBounds(120, 200, 50, 50);

        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public static void main(String[] args) {
        M2 x = new M2();
        x.setSize(1000, 500);
        x.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a;
        if (e.getSource() == b1) {
            a = Integer.parseInt(t1.getText());
            int c = 0, i;
            for (i = 1; i < a; i++) {
                if (a % i == 0) {
                    c = c + 1;
                }
            }
            if (c == 1) {
                System.out.println(a + " is prime ");
            } else {
                System.out.println(a + " is not prime number ");

            }
        } else if (e.getSource() == b2) {
            a = Integer.parseInt(t1.getText());
            int n = a, b, r = 0;
            while (a != 0) {
                b = a % 10;
                r = r * 10 + b;
                a = a / 10;
            }
            if (r == n) {
                System.out.println("number is palindrome");
            } else {
                System.out.println("number is  not palindrome");
            }
        } else if (e.getSource() == b3) {
            a = Integer.parseInt(t1.getText());
            int fact = 1;
            int i;
            for (i = 1; i <= a; i++) {
                fact = fact * i;
            }
            System.out.println("factoral is " + fact);
        } else {
            a = Integer.parseInt(t1.getText());
            int n = a, b, s = 0;
            while (a != 0) {
                b = a % 10;
                s = s + b * b * b;
                a=a/10;
            }
            if (s == n) {
                System.out.println("number is armstrong");
            } else {
                System.out.println("number is  not armstrong");
            }

        }
    }
}