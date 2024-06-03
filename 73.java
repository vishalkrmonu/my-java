

import java.awt.*;
import java.awt.event.*;

class D extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7;
    Checkbox c1, c2, c3, c4;
    Label l1;
    int index;
    CheckboxGroup cbg;
    String[] question = { "pm of india", "2+4", "8+9" };
    String[] op1 = { "narendra", "16", "15" };
    String[] op2 = { "vishal", "25", "75" };
    String[] op3 = { "monu", "72", "80" };
    String[] op4 = { "sonu", "6", "17" };
    int[] ans = { 1, 4, 4 };

    D() {
        setLayout(null);
        cbg = new CheckboxGroup();
        l1 = new Label("question");
        c1 = new Checkbox("a", cbg, false);
        c2 = new Checkbox("b", cbg, false);
        c3 = new Checkbox("c", cbg, false);
        c4 = new Checkbox("d", cbg, false);
        b1 = new Button("que1");
        b2 = new Button("que2");
        b3 = new Button("que3");
        b4 = new Button("que4");
        b5 = new Button("next");
        b6 = new Button("prev");
        b7 = new Button("ans");
        b1.setBounds(20, 50, 50, 30);
        b2.setBounds(70, 50, 50, 30);
        b3.setBounds(120, 50, 50, 30);
        b4.setBounds(170, 50, 50, 30);
        l1.setBounds(50, 90, 50, 30);
        c1.setBounds(40, 130, 50, 30);
        c2.setBounds(100, 130, 50, 30);
        c3.setBounds(40, 170, 50, 30);
        c4.setBounds(100, 170, 50, 30);
        b5.setBounds(40, 210, 50, 50);
        b6.setBounds(100, 210, 50, 50);
        b7.setBounds(160, 210, 50, 50);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

    }

    public static void main(String[] args) {
        D r = new D();
        r.setSize(300, 300);
        r.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            index = 0;
            l1.setText(question[0]);
            c1.setLabel(op1[0]);
            c2.setLabel(op2[0]);
            c3.setLabel(op3[0]);
            c4.setLabel(op4[0]);
        }
        if (e.getSource() == b2) {
            index = 1;
            l1.setText(question[1]);
            c1.setLabel(op1[1]);
            c2.setLabel(op2[1]);
            c3.setLabel(op3[1]);
            c4.setLabel(op4[1]);
        }
        if (e.getSource() == b3) {
            index = 2;
            l1.setText(question[2]);
            c1.setLabel(op1[2]);
            c2.setLabel(op2[2]);
            c3.setLabel(op3[2]);
            c4.setLabel(op4[2]);
        }
        if (e.getSource() == b4) {
            index = 3;
            l1.setText(question[3]);
            c1.setLabel(op1[3]);
            c2.setLabel(op2[3]);
            c3.setLabel(op3[3]);
            c4.setLabel(op4[3]);
        }
        if (e.getSource() == b5) {
            index++;
            l1.setText(question[index]);
            c1.setLabel(op1[index]);
            c2.setLabel(op2[index]);
            c3.setLabel(op3[index]);
            c4.setLabel(op4[index]);
        }
        if (e.getSource() == b6) {
            index--;
            l1.setText(question[index]);
            c1.setLabel(op1[index]);
            c2.setLabel(op2[index]);
            c3.setLabel(op3[index]);
            c4.setLabel(op4[index]);
        }
        if (e.getSource() == b7) {
            int p = 0;
            if (c1.getState()) {
                p = 1;
            } else if (c2.getState()) {
                p = 2;
            } else if (c3.getState()) {
                p = 3;
            } else {
                p = 4;
            }
            if (ans[index] == p) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        
       

    }
}