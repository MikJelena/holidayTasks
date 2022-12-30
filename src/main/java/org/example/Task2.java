package org.example;

public class Task2 {
    int[] array;
    public void setArray(int[] array) {
        this.array = array;
    }
    public int[] adding(int a){
        int len=1;
        int[] array1;
        if(this.array == null ){
            array1=new int[len];
            array1[0]=a;
        }else{
            len = array.length+1;
            array1 = new int[len];
            System.arraycopy(array,0,array1,0,len-1);
            array1[len-1]=a;
        }
        array = new int[len];
        System.arraycopy(array1,0,array,0,len);
//        System.out.println(Arrays.toString(array));
        return array;
    }

    public int[] addingAtIndex(int a, int index){
        int len=1;
        int[] array1;
        if (this.array == null){
            array1 = new int[index+1];
            array1[index]=a;
        } else{
            len = array.length+1;
            array1 = new int[len];
            System.arraycopy(array,0,array1,0,index);
            array1[index]=a;
            if(len>index+1) System.arraycopy(array,index,array1,index+1,len-index-1);
        }
        array = new int[len];
        System.arraycopy(array1,0,array,0,len);

//        System.out.println(Arrays.toString(array));
        return array;
    }

    public int[] deleteAtIndex(int index){
        int len=1;
        int[] array1;
        if (this.array == null){
            array1 = new int[0];
            System.out.println("an array is empty");
            return array;
        }if(array.length-1<index){
            System.out.println("index is out of range");
            return array;
        }else{
            len = array.length-1;
            array1 = new int[len];
            System.arraycopy(array,0,array1,0,index);
            System.arraycopy(array,index+1,array1,index,len-index);
        }
        array = new int[len];
        System.arraycopy(array1,0,array,0,len);
//        System.out.println(Arrays.toString(array));
            return array;
    }
    public int getAtIndex(int index){

        if (this.array == null){
            System.out.println("an array is empty");
            return 0;
        }
        if (index+1>array.length){
            System.out.println("Index is out of range");
            return 0;
        }
        else{
            System.out.println(array[index]);
            return array[index];
        }
    }
}
