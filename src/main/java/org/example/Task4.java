package org.example;

public class Task4 {

    public int[] mergeSort(int[] array){
        if(array.length<=1){
            return array;
        }
        int middle = array.length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length-middle];

        System.arraycopy(array, 0, leftArray,0,middle);
        System.arraycopy(array, middle, rightArray, 0, array.length-middle);

        mergeSort(leftArray);
        mergeSort(rightArray);
        mergeArrays(array, leftArray, rightArray);
        return array;
    }
    public void mergeArrays(int[] array, int[] leftArray, int[] rightArray){
        int i=0, j=0, n=0;
        while (i< leftArray.length && j<rightArray.length){
            if(leftArray[i]<rightArray[j]){
                array[n]=leftArray[i];
                i++;
            }else {
                array[n]=rightArray[j];
                j++;
            }
            n++;
        }
        if(i< leftArray.length) System.arraycopy(leftArray, i, array, n, leftArray.length-i);
        if(j<leftArray.length) System.arraycopy(rightArray, j, array, n, rightArray.length-j);
    }
}

