package BubbleSort;

public class BubbleSortExample {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n-1; i++) {
            swapped = false;
            for (j = 0; j < n-i-1; j++) { // Fixed syntax error here, changed ", j < n-i-1;" to "; j < n-i-1;"
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}