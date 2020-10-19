package com.utils.quicksort;

/**
 *
 *
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {4,2,5,6,3};

        System.out.println("Before sorting");
        printArray(inputArray);

        quickSort(inputArray,0,inputArray.length-1);

        System.out.println("\n After sorting");
        printArray(inputArray);
    }
    private static void quickSort (int[] inputArray, int startPosition , int endPosition){
            if(startPosition < endPosition){
                int element = partitioning(inputArray, startPosition , endPosition);
                quickSort(inputArray , startPosition,element -1);
                quickSort(inputArray , element + 1,endPosition);
            }
    }

    private  static int partitioning(int[] inputArray, int startPosition , int endPosition){

        int i = startPosition - 1;
        int pivot = endPosition;

        for(int j = startPosition; j <= endPosition ; j++){
               if (inputArray[j] <= inputArray[pivot]) {
                    i++;
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                    //j++;
               }
        }
        return i;
    }

    private static void printArray(int[] inputArray){
        for(int i = 0 ; i < inputArray.length ; i++){
            System.out.print(" " +inputArray[i]);
        }
    }
}
