import java.util.Scanner;
class Employe {
        private int id;
        private String name;
        private String department;
        private long mobile;
        private float salary;
        public void set(int i, String n, String d, long m, float s) {
            id = i;
            name = n;
            department = d;
            mobile = m;
            salary = s;
        }
        public int getid() { return id;}
        public String getname() { return name; }
        public String getdepartment() { return department;}
        public long getmobile() { return mobile;}
        public float getsalary() { return salary;}
    }
    class V {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Employe s = new Employe();
            System.out.println("enter the 1st data");
            s.set(sc.nextInt(), sc.next(), sc.next(), sc.nextLong(), sc.nextInt());
            System.out.println("the Employe id is = "+s.getid()+" name is = "+s.getname()+" the department is = "+s.getdepartment()+" mobile number is ="+s.getmobile()+" salary is = "+s.getsalary());
        
            Employe s1 = new Employe();
            System.out.println("enter the 2nd data");
            s1.set(sc.nextInt(), sc.next(), sc.next(), sc.nextLong(), sc.nextInt());
            System.out.println("the Employe id is = "+s1.getid()+" name is = "+s1.getname()+" the department is = "+s1.getdepartment()+" mobile number is ="+s1.getmobile()+" salary is = "+s1.getsalary());

           
            System.out.println("enter the department");
           String a =sc.next();
            if(s.getdepartment().equals(a)){
            System.out.println("the Employe id is = "+s.getid()+" name is = "+s.getname()+" the department is = "+s.getdepartment()+" mobile number is ="+s.getmobile()+" salary is = "+s.getsalary());  
            }
            else{
            System.out.println("the Employe id is = "+s1.getid()+" name is = "+s1.getname()+" the department is = "+s1.getdepartment()+" mobile number is ="+s1.getmobile()+" salary is = "+s1.getsalary());  
            }
    }}
    