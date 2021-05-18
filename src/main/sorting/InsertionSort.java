package main.sorting;

public class InsertionSort {

    public static void doSort(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;++i){
            int key = arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
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
