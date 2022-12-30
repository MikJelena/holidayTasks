package org.example;

import java.util.Arrays;

public class Tasks3 {
    int[] array;
    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] bubbleSort(){
        int i=1;

        do{
            for(int j=0; j< array.length; j++){
                for(int k=0; k<array.length-1;k++){
                    if(array[k]>array[k+1]){
                        i=0;
                        int temp=array[k];
                        array[k]=array[k+1];
                        array[k+1]=temp;
                        i++;
                    }
                }
            }
        }while(i==0);
//        System.out.println(Arrays.toString(array));
        return array;
    }
}

