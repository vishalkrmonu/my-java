import java.util.Scanner;

class student {

    int roll;
    String name;
    float m1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] x = new student[3];
        int i,n=0;
        for (i = 0; i < 3; i++) {
            x[i] = new student();
            System.out.println("enter data");
            x[i].roll = sc.nextInt();
            x[i].name = sc.next();
            x[i].m1 = sc.nextFloat(); 
        
        System.out.println("the results is");
        float m = 0;
        String p=null;
        for (i = 0; i < 3; i++) {
            System.out.println("roll =" + x[i].roll + " ," + "name is " + x[i].name + " , " + "marks is " + x[i].m1);
            if (m < x[i].m1) {
                m = x[i].m1;
                n=x[i].roll;
                p=x[i].name;
            }
        }
        System.out.println("the max marks is =" + m +","+ " roll is =" +n +","+ "name is  "  +p );

    }
    }
}
