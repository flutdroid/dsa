package com.project.dsagfg.arrays;

public class ArrayGfg {
    static void insertAtEnd(int [] arr, int x){
        arr[arr.length -1] = x;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void insertAtIndex(int[] arr, int x, int pos){
        int index = pos -1;
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
            if (i == pos){
                arr[pos] = x;
                break;
            }
        }
        for (int j:
             arr) {
            System.out.print(j + " ");
        }
    }

    static int maxIndexDiff(int[] arr){
        int maxDiff = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    maxDiff = Math.max(maxDiff, (j-i));
                }
            }
        }
        return maxDiff;
    }

    static void maxAndSecondMax(int[] arr){
        int max = 0;
        int secMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                secMax = max;
                max = arr[i];
            }
        }
        System.out.print(max + "and" + secMax);
    }
    static boolean isSortedAndRotated(int[] arr){
        int firstIndex = 0;
        int lastIndex = arr.length-1;
        int count  = 0;
        while (firstIndex<lastIndex){
            if (arr[firstIndex]>arr[lastIndex]){
                return true;
            }
            firstIndex++;
            lastIndex--;
        }
        return false;
    }
    static void reverseInGroups(int[] arr, int x){
        int index = x-1;
        for (int i = 0; i < arr.length; i++) {
            if (i == index){
                int low = 0;
                int high = index;
                while (low<high){
                    int temp = arr[low];//1
                    arr[low] = arr[high];//5
                    arr[high] = temp;//1
                    low++;
                    high--;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }

    static void arrange(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr[i]]);
        }
    }
    static void rotateAnArr(int[] arr, int x){
        for (int k = 0; k < x; k++) {
            int ele = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = ele;
        }
        for (int j:
             arr) {
            System.out.print(j);
        }
    }

    //16, 17, 4, 3, 5, 2
    static void leaders(int[] arr){
        int leader = arr[arr.length-1];
        System.out.print(leader + " ");//2
        for (int i = arr.length-1; i > 0 ; i--) {
            if (arr[i-1]>leader){
                leader = Math.max(leader,arr[i-1]);//2,5
                System.out.print(leader + " ");//5
            }
        }
    }

    static void reArrangeAlt(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[high];
                arr[i+1] = arr[low];
                low = low + 2;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        int[] arr1 = {15, 10, 20, 40};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
       // insertAtIndex(arr,90,2);
        //System.out.print(maxIndexDiff(arr1));
        leaders(arr1);
    }
}
