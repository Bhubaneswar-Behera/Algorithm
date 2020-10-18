package com.utils.mergesort;

public class MergeSort {

    int[] array;
    int[] tempMergeArray;
    int length;

    public static void main(String[] args) {
        int[] inputArray = {48,36,13,52,19,94,21};

        System.out.println("Before sorting");
        printArray(inputArray);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray);

        System.out.println("\n After sorting");
        printArray(inputArray);
    }

    private void sort (int[] inputArray){
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeArray = new int[length];

        divideArray(0 , length -1);

    }

    private void divideArray (int lowerIndex, int higherIndex){

            if(lowerIndex < higherIndex){
                int middle = lowerIndex + (higherIndex -lowerIndex)/2;
                //Will be used to sort teh left side of the array
                divideArray(lowerIndex, middle);

                //Will be used to sort right side of the array
                divideArray(middle+1, higherIndex);

                //start merging the array
                mergeArray(lowerIndex,middle,higherIndex);
            }
    }

    private void mergeArray(int lowerIndex, int middle , int higherIndex){

        //put all the elements present inside the array in the temporary array.
        for (int i = lowerIndex ; i <=higherIndex ;i++) {
            tempMergeArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle +1;
        //making lower index as we will go till the last of the higherIndex
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
            //move to the next element of array
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }

    private static void printArray(int[] inputArray){
        for(int i = 0 ; i < inputArray.length ; i++){
            System.out.print(" " +inputArray[i]);
        }
    }
}
