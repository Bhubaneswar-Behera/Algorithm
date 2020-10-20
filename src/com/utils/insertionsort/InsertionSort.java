package com.utils.insertionsort;

/**
 * Best Case : Omega (n)
 * Worst Case : O (n 2)
 * Average Case : O (n 2)
 *
 */
public class InsertionSort {

    public static void main(String[] args) {


        int[] inputArray =  {4, 0, 1, 5, 2, 6};

        System.out.println("Before sorting");
        printArray(inputArray);


        insertionSort(inputArray);

        System.out.println("\n After sorting");
        printArray(inputArray);
    }

    private static void printArray(int[] inputArray){
        for(int i = 0 ; i < inputArray.length ; i++){
            System.out.print(" " +inputArray[i]);
        }
    }
    private static void insertionSort(int[] inputArray) {
        int i ; //for incrementing the array
        int j; //for comparision
        int temp; //for  storing temporary value

        for(i = 1 ; i < inputArray.length ; i++){ // Iterate over all array
            temp = inputArray [i];
            j = i;
            while ( j > 0 && inputArray [j -1] > temp) {
                inputArray [j]= inputArray [j -1];
                j--;
            }
            inputArray[j] =  temp;
        }
    }

}
