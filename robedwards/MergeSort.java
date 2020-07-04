package com.robedwards;

import java.util.Arrays;

public class MergeSort {
    
    // 10 8 7 3 6 9 5 4
    private int[] array;
    private int[] temp;
    
    public MergeSort(int[] array) {
        this.array = array;
        temp = new int[array.length];
        split(0, array.length - 1);
    }
    
    private void split(int low, int high) {
        if(low == high) {
            return;
        }
        int mid = (low + high) / 2;
        split(low, mid);
        split(mid + 1, high);
        merge(low, mid, high);
    }
    
    private void merge(int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int tempPos = low;
        while(i <= mid && j <= high) {
            if(array[i] <= array[j]) {
                temp[tempPos] = array[i];
                i++;
            }
            else {
                temp[tempPos] = array[j];
                j++;              
            }
            tempPos++;  
        }
        while(i <= mid) {
            temp[tempPos] = array[i];
            i++;
            tempPos++;
        }
        while(j <= high) {
            temp[tempPos] = array[j];
            j++;
            tempPos++;
        }
        
        for(tempPos = low; tempPos <= high; tempPos++) {
            array[tempPos] = temp[tempPos];
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{10, 8, 7, 3, 6, 9, 5, 4};
        MergeSort MergeSort = new MergeSort(array);
        // Prints [3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(array));
    }

        
        
}