import org.example.Tasks3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3 {

    Tasks3 tasks3 = new Tasks3();


 @Test
    void bubbleSortTest(){

    int[] array = {3,7,4,9,10,50,6};
//     int[] array = {100,6,4,9,12};
     tasks3.setArray(array);

    int[] expected = {3,4,6,7,9,10,50};
//     int[] expected = {4,6,9,12,100};
     int[] output = tasks3.bubbleSort();

     assertArrayEquals(expected,output);

 }




}