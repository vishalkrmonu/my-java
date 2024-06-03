import java.util.*;

class Uni {
    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Convert the HashSet to an array
        Integer[] arr3 = set.toArray(new Integer[0]);

        // Print the result array
        System.out.println(Arrays.toString(arr3));
        
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4, 5, 6 };
        int arr2[] = { 3, 5, 6, 8, 9 };
        union(arr1, arr2);
    }
}



// intersection of two arrays
class intersection {
    public static int Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int x : arr1) {
            set.add(x);
        }
        System.out.println("intersection element");
        for (int x : arr2) {
            if (set.contains(x)) {
                System.out.println(x);
                count++;
                set.remove(x);
            }
        }
        System.out.println("count ");
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 2, 7, 8, 6 };
        System.out.println(Intersection(arr1, arr2));
    }
}

