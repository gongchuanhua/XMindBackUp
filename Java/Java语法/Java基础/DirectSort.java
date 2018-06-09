package com.java.day180602;

/**
 * 〈一句话功能简述〉
 * 〈〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/2
 */
public class DirectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{23,43,6,23,4,5,23,54,65,676,7565};
        printArray(arr);
        //directSort(arr);
        bubbleSort(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        //reversalArray(arr);
        printArray(arr);
        System.out.println(halfSearchArray(arr,44));
    }

    /**
     * 直接/选择排序
     * @param arr
     */
    public static void directSort(int[] arr){
        for (int a=0;a<arr.length-1;a++){
            for (int b=a+1;b<arr.length;b++){
                if (arr[a]>arr[b]){
                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        for (int a=0;a<arr.length-1;a++){
            for (int b=0;b<arr.length-2;b++){
                if (arr[b]>arr[b+1]){
                    int temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                }
            }
        }
    }

    /**
     * 数组翻转
     * @param arr
     */
    public static void reversalArray(int[] arr){
        for (int a=0;a<arr.length/2;a++){
            int temp = arr[a];
            arr[a] = arr[arr.length-1-a];
            arr[arr.length-1-a] = temp;
        }
    }

    /**
     * 数组打印输出
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int a=0;a<arr.length;a++){
            if (a == 0){
                System.out.print("["+arr[a]+",");
            }else if (a == arr.length-1){
                System.out.print(arr[a]+"]");
            }else{
                System.out.print(arr[a]+",");
            }
        }
    }

    /**
     * 二分法查找（必须为有序数组）
     * @param arr
     * @param num
     * @return
     */
    public static boolean halfSearchArray(int[] arr,int num){
        int start = 0;
        int end = arr.length-1;
        int half = (start + end)/2;
        while (arr[half]!=num){
            if (arr[half]>num){
                end = half-1;
            }else if (arr[half]<num){
                start = half+1;
            }
            half = (start + end)/2;
            if (start > end){
                return false;
            }
        }
        return true;
    }
}