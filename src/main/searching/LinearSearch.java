package main.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,15,75,48,65,95,23,45,85,1,125,235,6};

        System.out.println("Index : "+linearSearch(arr,1111));
    }

    public static int linearSearch(int[] arr, int x){

        int index = -1;
        for(int i=0;i<arr.length-1;i++){
            if(x==arr[i]) {
                index=i;
            }
        }
        return index;

    }
}
