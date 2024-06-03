 import java.awt.*;

// class monu extends Frame{
//     Button b1;                      //just a help program
//     Label l1;
//     TextField t1;
//     Choice c1;
//     monu(){
//         setLayout(null);
//         b1=new Button("ok");
//         b1.setBounds(x,y,z);               //location
//         add(b1);
//         l1=new Label("name");
//         l1.setBounds(x,y,z);
//         add(l1);
//         t1=new TextField("   ");
//         t1.setBounds(x,y,z);
//         add(t1);
//         c1=new Choice();
//         c1.add("a");
//         c1.add("b");
//         c1.setBounds(x,y,z);
//         add(c1);
//     }
// }

 
 


// class M extends Frame{
//     public static void main(String[]args){
//         M x=new M();
//         x.setSize(1000,300);
//         x.setVisible(true);
//     }
// }

import javax.security.auth.callback.ChoiceCallback;

// class My extends Frame{
//     Button b1,b2;
//     My(){
//         GridLayout g=new GridLayout(1,2);
//         setLayout(g);
//         b1=new Button("ok");
//         b2=new Button("cancel");
// add(b1);
// add(b2);
//     }
//     public static void main(String[]args){
//         My m=new My();
//         m.setSize(1000,300);
//         m.setVisible(true);
//     }
// }

// class Me extends Frame{
//     Label l1,l2;
//     TextField t1,t2;
//     Button b1,b2;
//     Me(){
//         GridLayout g=new GridLayout(3,2);
//                 setLayout(g);
//         l1=new Label("num1");
//         l2=new Label("num2");
// t1=new TextField("num3");
// t2=new TextField("num4");
// b1=new Button("ok");
// b2=new Button("ok1");
// add(l1);
// add(l2);
// add(t1);
// add(t2);
// add(b1);
// add(b2);
//     }
//     public static void main(String[]args){
//         Me m=new Me();
//         m.setSize(500,500);
//         m.setVisible(true);
//     }
// }


// class Me1 extends Frame{
// Checkbox c1,c2,c3;
// Button b1;
// Me1(){
//     GridLayout g=new GridLayout(4,1);
//     setLayout(g);
//     c1=new Checkbox("c");
//     c2=new Checkbox("c++");
//     c3=new Checkbox("java");
//     add(c1);
//     add(c2);
//     add(c3);
// b1=new Button("ok");
// add(b1);
// }
// public static void main(String[]args){
//     Me1 m=new  Me1();
//     m.setSize(500,500);
//     m.setVisible(true);
// }
// }

// class Me2 extends Frame{
//     Choice c1,c2,c3;
//     Button b1,b2;
//     Me2(){
//         GridLayout g=new GridLayout(5,2);
//         setLayout(g);
//         c1=new Choice();
//         c2=new Choice();
//         c3=new Choice();
//         int i;
//         for(i=1;i<100;i++){
//             c3.add(i+ " ");
//         }
//         add(c3);
//         c2.add("1st year");
//         c2.add("2nd year");
//         c2.add("3rd year");
//         add (c2);i
       
//         c1.add("cse");
//         c1.add("it");
//         c1.add("mech");
//         add (c1);
//         b2=new Button("cancel");
//         b1=new Button("ok");
// add(b2);
//         add(b1);
//     }
//     public static void main(String[]args){
//         Me2 m=new Me2();
//         m.setSize(500,500);
//         m.setVisible(true);
//     }
// }


// class Me3 extends Frame{
//     Button b1,b2;
//     Me3(){
//         setLayout(null);
//         b1=new Button("ok");
//         b2=new Button("cancel");
//         b1.setBounds(100,50,80,30);
//         b2.setBounds(180,50,80,30);
//         add(b1);
//         add(b2);
//     }
//     public static void main(String[]args){
//         Me3 m=new Me3();
//         m.setSize(500,500);
//         m.setVisible(true);
//     }
// }

class Me4 extends Frame{
    Button b1,b2;
    Label l,l1,l2,l3,l4;
    TextField t,t1,t2,t3,t4;
    Choice c,c1,c2;
    Me4(){
        setLayout(null);
        b1=new Button("submit");
        b2=new Button("cancel");
        b1.setBounds(100,150,50,50);
        b2.setBounds(200,150,50,50);
        add(b1);
        add(b2);
        l=new Label("Name");
        l1=new Label("roll"); 
        l2=new Label("branch");
        l3= new Label("section");
        l4=new Label("college");
        l.setBounds(5,50,50,20);
        l1.setBounds(110,50,30,20);
        l2.setBounds(210,50,40,20);
        l3.setBounds(5,80,50,20);
        l4.setBounds(110,80,50,20);

        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        t=new TextField("      ");
        t4=new TextField("               ");
        t.setBounds(55,50,50,20);
        t4.setBounds(160,80,50,20);
        add(t);
        add(t4);
        c=new Choice();
        c.add(" ");
        c.add("A");
        c.add("B");
        c.add("C");

        c1=new Choice();
        int i;
        c1.add(" ");
        for(i=1;i<100;i++){
            c1.add(i+ " ");
        }
        c2=new Choice();
        c2.add(" ");
        c2.add("cse");
        c2.add("it");
        c2.add("mech");
        c.setBounds(55,80,50,20);
        c1.setBounds(150,50,50,30);
        c2.setBounds(250,50,40,30);
        add(c);
        add(c1);
        add(c2);

        
    }
    public static void main(String[]args){
        Me4 m=new Me4();
        m.setSize(500,500);
        m.setVisible(true);
    }
}