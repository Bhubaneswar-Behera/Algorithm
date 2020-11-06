package com.utils.selectionsort;


import java.sql.Array;
import java.util.Arrays;

/**
 * Reference :  https://www.youtube.com/watch?v=Zbo4__XZEeM
 *              https://www.youtube.com/watch?v=9oWd4VJOwr0
 *
 * 1st run : Put the largest element at last position and swap the number , compare the rest of the elements in the next run
 * 2nd run : Put the next largest element at correct place and swap the number , compare the rest of the elements in the next run
 * . ....
 *
 *
 * Assume first element as the max/min elements and start comparing.
 *
 * Best Case : O (n 2)
 * Worst Case : O (n 2)
 * Average Case : Theta (n 2)
 *
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] inputArray =  {0,9,1,6,7,8,4};

        System.out.println("Before sorting : " + Arrays.toString(inputArray));

        //selectionSort(inputArray);
        selectionSortBasedOnMinimum(inputArray);

        System.out.println("\n After sorting : " + Arrays.toString(inputArray));

    }

    private static void selectionSort(int[] inputArray)  {
        int i , j , max ;

        for(i = inputArray.length -1 ; i > 0 ; i--) { //Shifting of the max element to the end
            max = 0;//assuming the first element is the biggest element
            for (j = 1 ; j <= i ; j++) {
                if(inputArray[j] > inputArray [max]){
                    max = j;
                }
            }

            int temp = inputArray[max];
            inputArray[max] = inputArray[i];
            inputArray[i] = temp;
        }

    }

    private static void selectionSortBasedOnMinimum(int[] inputArray)  {
        int i , j , min ;

        for(i = 0 ; i < inputArray.length - 1 ; i++) { //outer loop is for the pass i.e. n-1 times
            min = 0;//assuming the first element is the smallest element
            for (j = i+1 ; j < inputArray.length ; j++) { //inner loop is to find the smallest element and for swapping
                if(inputArray[j] < inputArray [min]){
                    min = j; //update the minimum
                }
            }

            int temp = inputArray[min];
            inputArray[min] = inputArray[i];
            inputArray[i] = temp;
        }

    }
}
