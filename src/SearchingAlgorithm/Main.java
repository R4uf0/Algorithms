package SearchingAlgorithm;

import static SearchingAlgorithm.LinearSearch.search;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        int result = search(arr, x);
        if (result == -1){
            System.out.println("Does not exist");
        }else {
            System.out.println("Element is present at index " + result);
        }
    }
}
