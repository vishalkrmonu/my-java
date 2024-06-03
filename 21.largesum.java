class lar {
    public static int largesum(int arr[]) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(largesum(arr));
    }
}


class mis {
    public static void missing(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6 };
        missing(arr);
    }
}

class large {
    public static void largestfactorial(int arr[]) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (m < arr[i]) {
                m = arr[i];
            }
        }
        int fact = 1;
        if (m == 0 || m == 1) {
            System.out.println(1);
        }
        for (int i = 1; i <= m; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 1, 2 };
        largestfactorial(arr);
    }
}

// Java program to find a triplet
class FindTriplet {

    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    public static void find3Numbers(int arr[]) {
        int sum = 22;
        // Fix the first element as A[i]
        for (int i = 0; i < arr.length - 2; i++) {
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr.length - 1; j++) {
                // Now look for the third number
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        break;
                    }
                }
            }
        }

    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        find3Numbers(arr);
    }
}



class como{
    public static void common(int arr1[], int arr2[],int arr3[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i] == arr2[j] && arr2[j] ==arr3[k]) {
                        System.out.println(arr1[i]);
                    }
                }
            }
        }

    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int arr1[] = { 1, 4, 6, 10, 8 };
        int arr2[] = { 1, 4, 45, 10, 8 };
        int arr3[] = { 1, 4, 45, 6, 10, 8 };
        common(arr1, arr2, arr3);
    }
}