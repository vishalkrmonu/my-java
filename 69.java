import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

class R extends Frame implements ActionListener {
    Label l1, l2;
    Choice c1, c2;
    Button b1;
    Checkbox c3;

    R() {
        setLayout(null);
        c1 = new Choice();
        c1.add("pizza");
        c1.add("maggi");
        c1.add("pasta");
        c2 = new Choice();
        int i;
        c2.add("");
        for (i = 1; i < 100; i++) {
            c2.add(i + "");
        }
        l1 = new Label("item");
        l2 = new Label("quantity");
        b1 = new Button("ok");
        c3 = new Checkbox("Gst");
        l1.setBounds(40, 50, 50, 30);
        l2.setBounds(40, 90, 50, 30);
        c1.setBounds(100, 50, 50, 30);
        c2.setBounds(100, 90, 50, 30);
        c3.setBounds(40, 130, 50, 30);
        b1.setBounds(100, 130, 50, 30);
        add(l1);
        add(l2);
        add(c1);
        add(c2);
        add(b1);
        add(c3);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        R r = new R();
        r.setSize(200, 200);
        r.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int amt = 0;
        String x = c1.getSelectedItem();
        int a = Integer.parseInt(c2.getSelectedItem());
        if (x.equals("pizza")) {
            amt = a * 100;
        }
        if (x.equals("maggi")) {
            amt = a * 70;
        }
        if (x.equals("pasta")) {
            amt = a * 10;
        }
        if (c3.getState()) {
            amt = amt + amt * 28 / 100;
        }
        System.out.println("total amount is =" + amt);

    }
}

// next game  tic tac toe