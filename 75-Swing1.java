import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

class Data1 extends JFrame implements ActionListener {
    JTextField t1, t2;
    JRadioButton r1, r2;
    JButton b1;

    Data1() {
        setLayout(null);
        t1 = new JTextField("");
        t2 = new JTextField("");
        r1 = new JRadioButton("anagram");
        r2 = new JRadioButton("merge");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b1 = new JButton("OK");
        t1.setBounds(50, 50, 50, 30);
        t2.setBounds(50, 90, 50, 30);
        r1.setBounds(20, 130, 80, 30);
        r2.setBounds(110, 130, 80, 30);
        b1.setBounds(70, 170, 70, 30);
        add(t1);
        add(t2);
        add(r1);
        add(r2);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        Data1 d = new Data1();
        d.setSize(300, 300);
        d.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (r1.isSelected()) {
            String x = t1.getText();
            char[] c = x.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);

            String y = t2.getText();
            char[] c1 = y.toCharArray();
            Arrays.sort(c1);
            String s2 = new String(c1);
            if (s1.equals(s2)) {
                System.out.println("anagram");
            } else {
                System.out.println(" no anagram");
            }
        }

        if (r2.isSelected()) {
            int i;
            String x = t1.getText();
            String y = t1.getText();
            String z = "";
            for (i = 0; i < x.length(); i++) {
                if (z.indexOf(x.charAt(i)) == -1) {
                    z = z + x.charAt(i);
                }
            }
            for (i = 0; i < y.length(); i++) {
                if (z.indexOf(y.charAt(i)) == -1) {
                    z = z + y.charAt(i);
                }
            }
            System.out.println(z);
        }
    }

}
