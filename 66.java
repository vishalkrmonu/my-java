import java.awt.*;
import java.awt.event.*;
import javax.print.DocFlavor.STRING;
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
    x.setSize(1000, 500);
    x.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
        String x="seed";
        String y="it";
      String  a =t1.getText();
       String b =t2.getText();
       if(x.equals(a)&&y.equals(b)){
        System.out.println("valid");
        }
       else{
        System.out.println("invalid");
}}}}



class T1 extends Frame implements ActionListener {
    Label l1;
    TextField t1;
    Button b1;
    Button b2;
    Button b3 ;

T1(){
    setLayout((null));
l1=new Label("String");
t1=new TextField("");
b1=new Button("palindrom");
b2=new Button("duplicate remove");
b1=new Button("vowel");

l1.setBounds(40,50,50,30);
t1.setBounds(100,50,50,30);
b1.setBounds(80,100,50,50);
b1.setBounds(80,200,50,50);
b1.setBounds(80,300,50,50);

add(l1);
add(t1);
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

}
public static void main(String[] args) {
    T1 x = new T1();
    x.setSize(1000, 500);
    x.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
        String x="seed";
      String  a =t1.getText();
       if(x.equals(a)){
        System.out.println("valid");
        }
       else{
        System.out.println("invalid");
}}}}
