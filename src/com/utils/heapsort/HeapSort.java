package com.utils.heapsort;

import java.util.Arrays;

/**
 * Reference :  Theory  :   https://www.youtube.com/watch?v=Q_eia3jC9Ts
 *              Code    :   https://www.youtube.com/watch?v=SkeQsjpG_fo
 *
 *
 * Max Heap  : Parent >= Child and Tree must be as Left as possible
 *
 * Steps :
 * 1. Create a Max heap
 * 2. Delete data from the root (and replace with the last element of the heap)
 *
 * Using Heapify method
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] inputArray = {15, 5, 20, 1, 17, 10, 30};

        System.out.println("Before sorting : " + Arrays.toString(inputArray));

        heapsort(inputArray);

        System.out.println("After  sorting : " + Arrays.toString(inputArray));
    }

    /**
     * build the max heap
     *
     * @param inputArray
     */
    private static void heapsort (int[] inputArray){
        int length = inputArray.length;
        //length/2 as non-leaf node which is at the largest index
        // For example length = 7, i = 7/2 -1  ==> 3 -1 =2   inputArray[2 = 20]
        //Build max heap
        for(int parentNodeIndex = length/2 -1  ; parentNodeIndex >= 0 ; parentNodeIndex--){
            heapify(inputArray, length, parentNodeIndex);
        }

        //Put the first element (which is the largest and put at the end) and again heapify the rest of the element
        //that's why length -1 to exclude the element which is already at the correct position
        for(int i = length - 1 ; i >= 0 ; i--){
            int temp = inputArray [0];
            inputArray [0]  = inputArray [i];
            inputArray [i] = temp;

            //Start the heapify method from 0th index again
            heapify(inputArray, i,0);
        }
    }

    /**
     * To store the elements in the heap
     *
     *
     * @param inputArray
     * @param length
     * @param i
     */
    private static void heapify(int[] inputArray , int length , int parentNodeIndex){
        int largest = parentNodeIndex; //parent node index
        int leftChildNodeIndex = 2 * parentNodeIndex  + 1; //left child index
        int rightChildNodeIndex = 2 * parentNodeIndex + 2; //right child index

        if(leftChildNodeIndex < length && inputArray[leftChildNodeIndex] > inputArray [largest]){ // parent node is greater than the left child
            largest = leftChildNodeIndex;
        }
        if(rightChildNodeIndex < length  && inputArray[rightChildNodeIndex] > inputArray [largest]){ // parent node is greater than the right child
            largest = rightChildNodeIndex;
        }

        //If the largest is updated
        if ( largest != parentNodeIndex){
            int temp = inputArray[parentNodeIndex];
            inputArray [parentNodeIndex] = inputArray[largest];
            inputArray [largest] = temp;
            heapify (inputArray , length , largest);
        }
    }
}
