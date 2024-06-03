import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Data extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JComboBox a;
    JRadioButton r1,r2;
    JButton b1;

    Data(){
        setLayout(null);
    l1=new JLabel("Name");
    l2=new JLabel("mob");
    l3=new JLabel("branch");
    l4=new JLabel("gender");
    t1=new JTextField("");
    t2=new JTextField("");
    a=new JComboBox();
    a.addItem("it");
    a.addItem("cse");
    r1=new JRadioButton("male");
    r2=new JRadioButton("female");

    ButtonGroup bg=new ButtonGroup();
    bg.add(r1); 
    bg.add(r2);

b1=new JButton("OK");
l1.setBounds(20,50,50,30);
t1.setBounds(80,50,50,30);
l2.setBounds(20,90,50,30);
t2.setBounds(80,90,50,30);
l3.setBounds(20,130,50,30);
a.setBounds(80,130,50,30);
l4.setBounds(20,170,50,30);
r1.setBounds(90,170,50,30);
r2.setBounds(150,170,50,30);
b1.setBounds(50,220,70,30);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(a);
add(r1);
add(r2);
add(b1);
b1.addActionListener(this);
    }
    public static void main(String[] args) {
        Data d = new Data();
        d.setSize(300, 300);
        d.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name=t1.getText();
        String mob=t2.getText();
        String branch=a.getSelectedItem().toString();
        String g="";
        if(r1.isSelected()){
            g=r1.getText();
        }else{
            g=r2.getText();
        }
        System.out.println(name);
        System.out.println(mob);
        System.out.println(branch);
        System.out.println(g);

    }
}