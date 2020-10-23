package com.utils.bubblesort;


/**
 *
 * Best Case : O (n)
 * Worst Case : O (n 2)
 * Average Case : Theta (n 2)
 *
 */


public class BubbleSortAdvanced {
    public static void main(String[] args) {
        int[] inputArray = {1,4,0,3,9,6,2};

        System.out.println("Before sorting");
        printArray(inputArray);

        bubbleSort(inputArray);
        
        System.out.println("\n After sorting");
        printArray(inputArray);
    }

    private static void printArray(int[] inputArray){
        for(int i = 0 ; i < inputArray.length ; i++){
            System.out.print(" " +inputArray[i]);
        }
    }
    private static void bubbleSort(int[] inputArray) {
        boolean swapFlag = false;

        for ( int i = 0; i < inputArray.length -1 && !swapFlag ; i ++) {

            swapFlag = true;

            for (int j = 0 ; j < (inputArray.length -1) - i ; j ++){

                if(inputArray[j] > inputArray [j+1]){
                    swapFlag = false;
                    int temp = inputArray [j];
                    inputArray[j] = inputArray [j+1];
                    inputArray[j+1] = temp;
                }
            }

        }
    }

}
