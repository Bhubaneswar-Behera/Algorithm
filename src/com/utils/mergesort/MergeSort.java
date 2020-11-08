package com.utils.mergesort;

import java.util.Arrays;

/**
 * Reference :  https://www.youtube.com/watch?v=jlHkDBEumP0
 *
 * Based on Divide-and-conquer
 * Time Complexity O (n log n)
 *
 *
 */
public class MergeSort {

    int[] array;
    int[] tempMergeArray;
    int length;

    public static void main(String[] args) {
        int[] inputArray = {48,36,13,52,19,94,21};

        System.out.println("Before sorting : "+ Arrays.toString(inputArray));

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray);

        System.out.println("After sorting : "+ Arrays.toString(inputArray));
    }

    private void sort (int[] inputArray){
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeArray = new int[length];

        divideArray(0 , length -1);
    }

    private void divideArray (int lowerIndex, int higherIndex){

            if(lowerIndex < higherIndex){// At least 2 elements should be there in the array
                int middle = (lowerIndex + higherIndex)/2;

                //Will be used to sort teh left side of the array
                divideArray(lowerIndex, middle);

                //Will be used to sort right side of the array
                divideArray(middle+1, higherIndex);

                //start merging the array
                mergeArray(lowerIndex , middle, higherIndex);
            }
    }

    private void mergeArray(int lowerIndex, int middle , int higherIndex){

        //copy all the elements to a temporary array.
        for (int i = lowerIndex ; i <=higherIndex ;i++) {
            tempMergeArray[i] = array[i];
        }

        //Making these variables i,j and k so that the originals values
        //remain unchanged
        int i = lowerIndex;
        int j = middle +1;
        //making this as lower index for the new array
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex){

            //If the element present in the left array is less than
            // equal to right side of the element of the array
            if(tempMergeArray[i] <= tempMergeArray[j] ){
                //If the element present in the left side array's is less than
                //equal to right side of the element of the array
                //replace the value of the element in the main array
                    array[k] = tempMergeArray[i];
                    i++;
            } else{
                //If the element present in the right side array's element is less than
                // equal to right side of the element of the array
                //replace the value of the element in the main array
                array[k] = tempMergeArray[j];
                j++;
            }
            //move to the next element of the new array
            k++;
        }
        //Option 1: Put the remaining unplaced elements at the end of the array
        /*while (i <= middle) {
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }*/

        //Option 2: All the elements from the left array has been placed in the new  array.
        // But there may be some elements in the right array not being placed in the result array .
        // Put the remaining unplaced elements at the end of the array
        if(i > middle ){
            //If some left over elements are there in the the right array then place those in the result array.
            while (j <= higherIndex){
                array[k] = tempMergeArray[j];
                j++;
                k++;
            }
        } else{
            //some left over elements are there in the the left array then place those in the result array.
            while(i <= middle){
                array[k] = tempMergeArray[i];
                i++;
                k++;

            }
        }
    }
}
