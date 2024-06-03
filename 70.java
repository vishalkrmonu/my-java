import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

class Add extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    Add() {
        setLayout(null);
        l1 = new Label("num 1");
        l2 = new Label("num 2");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("+");
        l1.setBounds(20, 50, 50, 30);
        t1.setBounds(80, 50, 50, 30);
        l2.setBounds(20, 90, 50, 30);
        t2.setBounds(80, 90, 50, 30);
        b1.setBounds(50, 130, 50, 30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        Add r = new Add();
        r.setSize(200, 200);
        r.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b;
        if (e.getSource() == b1) {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            System.out.println(a + b);
        }
    }
}

class Add1 extends Frame implements ActionListener {
    Label l1;
    TextField t1;
    Button b1;

    Add1() {
        setLayout(null);
        l1 = new Label("num");
        t1 = new TextField();
        b1 = new Button("factorial");
        l1.setBounds(20, 50, 50, 30);
        t1.setBounds(80, 50, 50, 30);
        b1.setBounds(50, 100, 50, 30);
        add(l1);
        add(t1);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        Add1 r = new Add1();
        r.setSize(200, 200);
        r.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a;
        if (e.getSource() == b1) {
            a = Integer.parseInt(t1.getText());
            int fact = 1, i;
            for (i = 1; i <= a; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}


class Add2 extends Frame implements ActionListener {
    Button b1,b2;

    Add2() {
        setLayout(null);
      
        b1 = new Button("add");
        b2 = new Button("fact");
        b1.setBounds(50, 50, 50, 30);
        b2.setBounds(50, 90, 50, 30);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public static void main(String[] args) {
        Add2 r = new Add2();
        r.setSize(300, 300);
        r.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            Add a=new Add();
            a.setSize(300,300);
            a.setVisible(true);
        }
        if (e.getSource() == b2) {
            Add1 b=new Add1();
            b.setSize(300,300);
            b.setVisible(true);
        }
    }
}

