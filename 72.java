import java.awt.*;
import java.awt.event.*;

class m extends Frame implements ItemListener {
    Button b1;
    Choice c1;
    Label l1;
    m() {
        setLayout(null);
        l1 = new Label("num");
        l1.setBounds(20, 50, 50, 20);
        add(l1);
        c1 = new Choice();
        c1.setBounds(80, 50, 50, 20);
        int i;
        for (i = 0; i <= 10; i++) {
            c1.add(i + "");
        }
        add(c1);
        c1.addItemListener(this);
    }

    public static void main(String[] args) {
        m obj = new m();
        obj.setSize(200, 200);
        obj.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            String x = c1.getSelectedItem();
            int a = Integer.parseInt(x);
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}

class check extends Frame implements ItemListener {
    Label l1;
    TextField t1;
    Checkbox c1, c2, c3;

    check() {
        setLayout(null);
        l1 = new Label("name");
        l1.setBounds(20, 50, 50, 20);
        add(l1);
        t1 = new TextField("");
        t1.setBounds(70, 50, 50, 20);
        add(t1);
        c1 = new Checkbox("palindrom");
        c1.setBounds(20, 80, 80, 20);
        add(c1);
        c2 = new Checkbox("vowel");
        c2.setBounds(110, 80, 50, 20);
        add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }

    public static void main(String[] args) {
        check obj = new check();
        obj.setSize(200, 200);
        obj.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            String x = t1.getText();
            String y = "";
            int i;
            for (i = x.length() - 1; i >= 0; i--) {
                y = y + x.charAt(i);
            }
            if (x.equals(y)) {
                System.out.println("palindrom");
            } else {
                System.out.println("not palindrom");
            }
        }
        if (e.getSource() == c2) {
            String n = t1.getText();
            int c = 0, i;
            for (i = 0; i <= n.length() - 1; i++) {
                if (n.charAt(i) == 'a' || n.charAt(i) == 'n' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
                        || n.charAt(i) == 'u' || n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I'
                        || n.charAt(i) == 'O' || n.charAt(i) == 'U') {
                    c = c + 1;
                }
            }
            System.out.println(c);

        }
    }
}