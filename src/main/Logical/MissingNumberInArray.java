package main.Logical;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7,8,9};
        int[] arr2 = {5,6,2,1,3};

        System.out.println("Missing number in arr1: " + missingNumber(arr1));
        System.out.println("Missing number in arr2: " +missingNumber(arr2));
    }

    public static int missingNumber(int[] arr){
        int n = arr.length+1;

        int sum = n*(n+1)/2;
        int actualSum=0;
        for(int i= 0;i<=arr.length-1;i++){
            actualSum = actualSum + arr[i];
        }

        int missingNumber =sum-actualSum;
        return missingNumber;
    }
}
