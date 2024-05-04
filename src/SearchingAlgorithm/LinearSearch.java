package SearchingAlgorithm;

public class LinearSearch {
    public static int search(int arr[], int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i+1;
            }
        }return -1;
    }
}
