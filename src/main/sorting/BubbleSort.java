package main.sorting;

public class BubbleSort {

    public static void doSort(int[] arr){

    }

    public static void main(String[] as){
        int[] arr = {12,15,9,78,55,96,63,45,122,32,88,7,11,56};
        System.out.println("Unsorted: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        doSort(arr);
        System.out.println("\nSorted: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
