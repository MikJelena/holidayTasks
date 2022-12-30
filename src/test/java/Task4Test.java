import org.example.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Task4Test {

    Task4 task4 = new Task4();

    @Test
    void mergeSortTest(){
        int[] array = {3,7,4,9,10,50,6};
//     int[] array = {100,6,4,9,12};

        int[] expected = {3,4,6,7,9,10,50};
//     int[] expected = {4,6,9,12,100};
        int[] output = task4.mergeSort(array);

        assertArrayEquals(expected,output);
    }

}
