package com.utils.bubblesort;

public class Test {
    public static void main(String[] args) {

        int[] inputArray =  {0,9,1,6,7,8,4};

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

    private static void insertionSort(int[] inputArray)  {

        int i , j , temp ;

        for(i = 1 ; i < inputArray.length  ;i++){
            temp = inputArray[i];
            j = i;

            while(inputArray[j-1] > temp && j > 0) {
                inputArray[j] = inputArray[j-1];
                    j--;
            }
            inputArray[j] = temp;
        }

    }
}
