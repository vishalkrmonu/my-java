import java.util.*;

class str {
    public static void strong(int n) {
        int m = n;
        int b, sum = 0;
        while (n > 0) {
            b = n % 10;
            int fact = 1;
            for (int i = 1; i <= b; i++) {
                fact = fact * i;
            }
            n = n / 10;
            sum = sum + fact;
        }
        System.out.println("sum of factorial digit of number " + sum);
        if (m == sum) {
            System.out.println("strong number");
        } else {
            System.out.println("no strong number");
        }
    }

    public static void main(String[] args) {
        strong(147); // 145
    }
}

//sum of cube of all digit in a number 
class armstrong {
    public static void armstromg(int n) {
        int b, sum = 0, num = n;
        while (n > 0) {
            b = n % 10;
            sum = sum + (b * b * b);
            n = n / 10;
        }
        if (num == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println(" not armstrong");
        }

    }

    public static void main(String[] args) {
        armstromg(155); // 153
    }
}

// For example-
// Number= 50113
// => 5+0+1+1+3=10
// => 1+0=1
// This is a Magic Number
class mag {
    public static void magic(int n) {
        int b, s = 0;
        while (n > 0) {
            b = n % 10;
            s = s + b;
            n = n / 10;
        }
        if (s > 9) {
            int c, sum = 0;
            while (s > 0) {
                c = s % 10;
                sum = sum + c;
                s = s / 10;
            }
            if (sum == 1) {
                System.out.println("number is magic");
            } else {
                System.out.println("number is not magic");
            }
        } else if (s == 1) {
            System.out.println("number is magic");
        } else {
            System.out.println("number is not magic");
        }
    }

    public static void main(String[] args) {
        int n = 50113; // 1234
        magic(n);
    }
}

// anagram
// Input: A = 204, B = 240
// Output: Yes

// Input: A = 23, B = 959
// Output: No

class ana {
    public static void anagram(int a, int b) {
        int c, d, i = 0, j = 0;
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        while (a > 0) {
            c = a % 10;
            arr1[i] = c;
            a = a / 10;
            i++;
        }
        Arrays.sort(arr1);

        while (b > 0) {
            d = b % 10;
            arr2[j] = d;
            b = b / 10;
            j++;
        }
        Arrays.sort(arr2);
        
        for (int k = 0; k < 3; k++) {
            if (arr1[k] != arr2[k]) {
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println(" anagram");

    }

    public static void main(String[] args) {
        int a = 242, b = 234;
        anagram(a, b);
    }
}

class NumberToArray {

    public static void anagram2(int a, int b) {
        // Convert the number to a string
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);

        int[] arr1 = new int[num1.length()];
        int[] arr2 = new int[num2.length()];
        for (int i = 0; i < num1.length(); i++) {
            arr1[i] = Character.getNumericValue(num1.charAt(i));
            arr2[i] = Character.getNumericValue(num2.charAt(i));
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int j = 0; j < arr1.length; j++) 
            if (arr1[j] != arr2[j]) {
                System.out.println("not anagram");
                return;
            }
        System.out.println("anagram");
    }

    public static void main(String[] args) {
        int a = 2345;
        int b = 2745;
        anagram2(a, b);
    }
}

class anagramnum {
    public static void anagram(int str1, int str2) {

        // String to char array

        String k1 = String.valueOf(str1);
        String k2 = String.valueOf(str2);

        char[] s1 = k1.toCharArray();
        char[] s2 = k2.toCharArray();
        if (s1.length != s2.length) {
            System.out.println("string is not anagram");
            return;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i < s1.length; i++)
            if (s1[i] != s2[i]) {
                System.out.println("not anagram");
                return;
            }
        System.out.println("number is anagram");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        int str2 = sc.nextInt();
        anagram(str1, str2);
    }
}







class While2 {
   public static void main(String[] args) {
      int b, r = 0, n, m, s = 0, t = 0, x, y = 0;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      System.out.println("enter the number " + n);
      m = n;
      while (n != 0) {
         b = n % 10;
         r = r * 10 + b;
         System.out.println("digit of cubic " + b + " is= " + b * b * b);
         s = s + b * b * b;
         t = t + b;
         n = n / 10;
      }

      System.out.println("sum of digit " + t);
      int z = t;
      while (t != 0) {
         x = t % 10;
         y = y * 10 + x;
         t = t / 10;
      }

      System.out.println("reverse number  is sum of digit " + y);
      System.out.println("sum of cubic digit " + s);
      System.out.println("reverse number is " + r);
      System.out.println("multiply of two reverse num is " + z * y);

      if (z * y == m) {
         System.out.println("number is magic");
      } else {
         System.out.println("number is  not magic");
      }

      if (s == m) {
         System.out.println("number is armstrong");
      } else {
         System.out.println("number is  not armstrong");
      }

      if (r == m) {
         System.out.println("number is palindrome");
      } else {
         System.out.println("number is  not palindrome");
      }

   }
}