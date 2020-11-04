package com.utils.bubblesort;

import java.util.Arrays;

/**
 *
 * Best Case : O (n 2)
 * Worst Case : O (n 2)
 * Average Case : Theta (n 2)
 *
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] inputArray = {1,4,0,3,9,6,2};

        System.out.println("Before sorting : " + Arrays.toString(inputArray));

        //bubbleSort(inputArray);
        bubbleSortWithIndexZero(inputArray);

        System.out.println("\n After sorting : " + Arrays.toString(inputArray));
    }

    /**
     * comparing from 1 to the length
     *
     * @param inputArray
     */
    private static void bubbleSort(int[] inputArray) {
        for(int i = 1 ; i < inputArray.length ; i++){
            for(int j = 1 ; j < inputArray.length ; j++){
                if(inputArray[j-1] > inputArray [j]){
                    int temp = inputArray[j -1];
                    inputArray[j -1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }

        }
    }

    /**
     * Comparing 0 to length -1
     *
     * @param inputArray
     */

    private static void bubbleSortWithIndexZero(int[] inputArray) {
        for(int i = 0 ; i < inputArray.length -1 ; i ++){
            for(int j = 0 ; j < inputArray.length -1 ; j++) {
                if(inputArray[j] > inputArray [j + 1] ) {
                        int temp = inputArray [j];
                        inputArray [j] = inputArray [j+1];
                        inputArray [j + 1] = temp ;
                }
            }
        }
    }
}
