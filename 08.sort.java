import java.util.*;

class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        System.out.println("ascending order is =");
        for (int i = 0; i < n; i++) { // iteration
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 6, 5 };
        int n = 5;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// selection sort
class selection {
    public static void selectionSort(int[] arr, int n) {
        System.out.println("acending  order =");
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap(i,smallest)
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 8, 2 };
        int n = 5;
        selectionSort(arr, n); // calling for function
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class insertion {
    public static void insertionSort(int[] arr, int n) {
        System.out.println("acending order =");
        for (int i = 1; i < n; i++) {
            
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 8, 2 };
        int n = 5;
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
