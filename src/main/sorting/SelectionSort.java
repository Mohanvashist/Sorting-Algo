package main.sorting;

public class SelectionSort {

    public static void doSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min_index]>arr[j])
                    min_index=j;
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
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
