package main.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Index : "+binarySearch(arr,0,arr.length-1,9));
    }

    public static int binarySearch(int[] arr,int l, int r, int x){

        if(r>=1){
            int mid = l +(r-l)/2;

            if(arr[mid]==x) {
                return mid;
            }

            if(x>arr[mid])
                return binarySearch(arr,mid+1,r,x);

            if(x<arr[mid])
                return binarySearch(arr,l,mid-1,x);
        }
        return -1;
    }
}
