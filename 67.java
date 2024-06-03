import java.awt.*;
import java.awt.event.*;

class check1 extends Frame implements ActionListener {
    Button b1;
    Checkbox c1, c2, c3, c4;

    check1() {
        setLayout(null);
        c1 = new Checkbox("c");
        c1.setBounds(20, 50, 50, 20);
        add(c1);

        c2 = new Checkbox("c++");
        c2.setBounds(20, 80, 50, 20);
        add(c2);

        c3 = new Checkbox("java");
        c3.setBounds(20, 110, 50, 20);
        add(c3);

        c4 = new Checkbox("web");
        c4.setBounds(20, 140, 50, 20);
        add(c4);

        b1 = new Button("ok");
        b1.setBounds(50, 170, 50, 20);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        check1 c1 = new check1();
        c1.setSize(200, 200);
        c1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String x;
            if (c1.getState()) {
                x = c1.getLabel();
                System.out.println(x);
            }
            if (c2.getState()) {
                x = c2.getLabel();
                System.out.println(x);
            }
            if (c3.getState()) {
                x = c3.getLabel();
                System.out.println(x);
            }
            if (c4.getState()) {
                x = c4.getLabel();
                System.out.println(x);
            }

        }
    }
}

class check2 extends Frame implements ActionListener {
    Button b1;
    Label l1, l2, l3, l4;
    Checkbox c1, c2, c3, c4;

    check2() {
        setLayout(null);
        c1 = new Checkbox("1");
        c1.setBounds(20, 50, 50, 20);
        add(c1);

        c2 = new Checkbox("2");
        c2.setBounds(20, 80, 50, 20);
        add(c2);

        c3 = new Checkbox("3");
        c3.setBounds(20, 110, 50, 20);
        add(c3);

        c4 = new Checkbox("4");
        c4.setBounds(20, 140, 50, 20);
        add(c4);

        b1 = new Button("ok");
        b1.setBounds(50, 170, 50, 20);
        add(b1);

        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        check2 c1 = new check2();
        c1.setSize(200, 200);
        c1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int s = 0;
            if (c1.getState()) {
                s = s + Integer.parseInt(c1.getLabel());
            }
            if (c2.getState()) {
                s = s + Integer.parseInt(c2.getLabel());
            }
            if (c3.getState()) {
                s = s + Integer.parseInt(c3.getLabel());
            }
            if (c4.getState()) {
                s = s + Integer.parseInt(c4.getLabel());
            }
            System.out.println(s);
        }
    }
}


class check3 extends Frame implements ActionListener {
    Button b1;
    TextField t1;
    Label l1;
    check3() {
        setLayout(null);
        l1 = new Label("name");
        l1.setBounds(20, 50, 50, 20);
        add(l1);
        t1 = new TextField("");
        t1.setBounds(70, 50, 50, 20);
        add(t1);
        b1 = new Button("palindrom");
        b1.setBounds(20, 90, 50, 20);
        add(b1);

        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        check3 c = new check3();
        c.setSize(200, 200);
        c.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String x;
            x = t1.getText();
            int i;
            String y = "";
            for (i = x.length() - 1; i >= 0; i--) {
                y = y + x.charAt(i);
            }
            if (x.equals(y)) {
                System.out.println("palindrom");
            } else {
                System.out.println(" not palindrom");

            }
        }
    }

}