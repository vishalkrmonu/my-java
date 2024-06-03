import java.util.*;

class Vowel {
    public static void countvowel(String s) {
        int count = 0, d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            } else {
                d++;
            }
        }
        System.out.println("no of vowell=" + count + " " + "num of consonent is=" + d);
    }

    public static void main(String[] args) {
        String s = "rungta";
        countvowel(s);
    }
}

class Vowel1 {
    public static void removevowel(String s) {
        String v = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
            } else {
                v = v + s.charAt(i);
            }
        }
        System.out.println("after remove vovel stri is=" + v);
    }

    public static void main(String[] args) {
        String s = "rungta";
        removevowel(s);
    }
}

class vowel2 {
    public static void nextvowel(String x) {
        int i;
        char c = ' ';
        String b = " ";
        for (i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if (c == 'a') {
                b = b + 'e';
            } else if (c == 'e') {
                b = b + 'i';
            } else if (c == 'i') {
                b = b + 'o';
            } else if (c == 'o') {
                b = b + 'u';
            } else if (c == 'u') {
                b = b + 'a';
            } else {
                b = b + c;
            }
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        nextvowel(x);
    }
}

class anag {
    public static void anagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        if (s1.length != s2.length) {
            System.out.println("string is not anagram");
            return;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i < s1.length; i++){
            if (s1[i] != s2[i]) {
                System.out.println("not anagram");
                return;
            }}
        System.out.println("string is anagram");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        anagram(str1, str2);
    }
}