package com.utils.insertionsort;

import java.util.Arrays;

/**
 *  Reference : https://www.youtube.com/watch?v=9DK8w7U43lI
 *
 * Like playing cards
 * Make a temporary for copying the data
 *
 * Best Case : Omega (n)
 * Worst Case : O (n 2)
 * Average Case : O (n 2)
 *
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] inputArray =  {4, 0, 1, 5, 2, 6};

        System.out.println("Before sorting : " + Arrays.toString(inputArray));

        insertionSort(inputArray);

        System.out.println("\n After sorting : " + Arrays.toString(inputArray));

    }

    private static void insertionSort(int[] inputArray) {
        int i ; //for incrementing the array
        int j; //for comparision
        int temp; //for  storing temporary value

        for(i = 1 ; i < inputArray.length ; i++){ // Iterate over all array
            temp = inputArray [i];
            j = i - 1;
            //Comparing the values in the window
            while ( j >= 0 && inputArray [j] > temp) {
                //swap the values
                inputArray [j+1]= inputArray [j];
                //Decrease the counter
                j--;
            }
            //assign the value of a[j+1] after the swap
            inputArray[j+1] =  temp;
        }
    }

}
