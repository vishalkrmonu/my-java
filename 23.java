import java.util.Scanner;

class matrix {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("first matrix ");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[3][3];
        System.out.println("second matrix");
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[3][3];
        System.out.println("sum matrix ");
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            System.out.print(" " + c[i][j]);
        }
        System.out.println();
    }

    /* int[][] d = new int[3][3];
        System.out.println("results matrix ");
        for (i = 0; i < d.length; i++) {
            for (j = 0; j < d[i].length; j++) {
                d[i][j]=0;
                for(int k=0;k<d.length;k++){
                    d[i][j] = a[i][k] * b[k][j];
                }
                
            System.out.print(" " + d[i][j]);
        }
        System.out.println();
    }
    */
}
}
