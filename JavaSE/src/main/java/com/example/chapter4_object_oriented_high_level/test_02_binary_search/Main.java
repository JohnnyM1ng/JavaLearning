package com.example.chapter4_object_oriented_high_level.test_02_binary_search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 1;
        int a = binarySearch(arr, target);
        System.out.println(a);
    }

    public static int binarySearch(int[] arr, int target){
        int length = arr.length;
        int left = 0;
        int right = length-1;
        int middle = (left + right)/2;
        do{
            if(arr[middle]<target&&arr[middle+1]>target){
                return -1;
            }
            if(arr[middle]<target){
                left = middle + 1;
                middle = (left + right)/2;
            }
            else{
                right = middle - 1;
                middle = (left + right)/2;
            }
        }while (arr[middle]!=target);
       return middle;
    }
}
