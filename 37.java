import java.util.Scanner;

class Mn1 {
    public static void main(String[] args) {
        int u = 0, l = 0, d = 0, s = 0, i, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data");
        String x = sc.nextLine();
        for (i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= 65 && x.charAt(i) <= 90) {
                u = u + 1;
            } else if (x.charAt(i) >= 97 && x.charAt(i) <= 122) {
                l = l + 1;
            } else if (x.charAt(i) >= 48 && x.charAt(i) <= 57) {
                d = d + 1;
            } else {
                s = s + 1;
            }
            System.out.println("the ascii value is  " + x.charAt(i) + " = " + (int) (x.charAt(i)));
        }
if(u==1&&l==1&&d==1&&s==1){
    System.out.println(" strong password ");
}else{
    System.out.println(" weak password ");

}

        System.out.println("capital letter is " + u);
        System.out.println("small letter is " + l);
        System.out.println("number  is " + d);
        System.out.println(" special is " + s);



        // for (i = 0; i < x.length(); i++) {
        //     if (x.charAt(i) >= 48 && x.charAt(i) <= 57) {
        //         c = c + 1;
        //     }
        // }
        // if (c == 0) {
        //     System.out.println("valid");
        // } else {
        //     System.out.println("invalid");

        // }

    }

}
