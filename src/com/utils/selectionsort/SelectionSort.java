package com.utils.selectionsort;


/**
 *
 * 1st run : Put the largest element at nth place
 * 2nd run : Put the next largest element at n -1 place
 * . ....
 *
 *
 * Best Case : O (n 2)
 * Worst Case : O (n 2)
 * Average Case : Theta (n 2)
 *
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] inputArray =  {0,9,1,6,7,8,4};

        System.out.println("Before sorting");
        printArray(inputArray);

        selectionSort(inputArray);

        System.out.println("\n After sorting");
        printArray(inputArray);
    }

    private static void printArray(int[] inputArray){
        for(int i = 0 ; i < inputArray.length ; i++){
            System.out.print(" " +inputArray[i]);
        }
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
}
