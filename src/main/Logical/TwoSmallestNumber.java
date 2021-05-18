package main.Logical;

public class TwoSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {12,45,65,25,35,95,75,15,85,58,52,54,56,1,90};
        findSmallest(arr);

    }

    public static void findSmallest(int[] arr){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]<first){
                second = first;
                first = arr[i];
            }else if(arr[i]<second && arr[i]!= first){
                second = arr[i];
            }
        }

        System.out.println("First smallest: "+first+" Second smallest: "+second);
    }
}
