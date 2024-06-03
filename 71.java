
import java.awt.*;
import java.awt.event.*;
import javax.print.DocFlavor.STRING;

class Z extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b1,b2;

    Z() {
        setLayout(null);
        l1 = new Label("num 1");
        l2 = new Label("num 2");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("+");
        b2 = new Button("show");

        l1.setBounds(20, 50, 50, 30);
        t1.setBounds(80, 50, 50, 30);
        l2.setBounds(20, 90, 50, 30);
        t2.setBounds(80, 90, 50, 30);
        b1.setBounds(50, 130, 50, 30);
        b2.setBounds(100, 130, 50, 30);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public static void main(String[] args) {
        Z r = new Z();
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
        if (e.getSource() == b2) {
            System.out.println("seed");
            System.out.println("it");

        }

    }
}

class T extends Frame implements ActionListener {
    Label l1,l2;
    TextField t1,t2;
    Button b1;
T(){
    setLayout((null));
l1=new Label("user");
l2=new Label("pass");
t1=new TextField("");
t2=new TextField("");
b1=new Button("log in");
l1.setBounds(40,50,50,30);
l2.setBounds(40,90,50,30);
t1.setBounds(100,50,50,30);
t2.setBounds(100,90,50,30);
b1.setBounds(80,150,50,50);
add(l1);
add(l2);
add(t1);
add(t2);
add(b1);
b1.addActionListener(this);
}
public static void main(String[] args) {
    T x = new T();
    x.setSize(300, 300);
    x.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
        String x="seed";
        String y="it";
      String  a =t1.getText();
       String b =t2.getText();
       if(x.equals(a)&&y.equals(b)){
        Z m=new Z();
        m.setSize(300,300);
        m.setVisible(true);
        this.setVisible(false);
        }
       else{
        System.out.println("invalid");
}}

}} 