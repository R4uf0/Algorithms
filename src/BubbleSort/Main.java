package BubbleSort;

import static BubbleSort.Printer.printArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        BubbleSortExample.bubbleSort(arr, n);

        System.out.print("Sorted array : ");
        printArray(arr, n);
    }
}