import org.example.Task2;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    Task2 task2 = new Task2();

    @org.junit.jupiter.api.Test
    void addingToEmptyArray() {

        int[] expected = {5};
        int[] output = task2.adding(5);

        assertArrayEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void addingToArray() {

        int[] array = {1,2,3};
        task2.setArray(array);
        int[] expected = {1,2,3,5};
        int[] output = task2.adding(5);

        assertArrayEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void addingAtIndexToArray() {

        int[] array = {1,2,3};
        task2.setArray(array);
        int[] expected = {1,2,5,3};
        int[] output = task2.addingAtIndex(5,2);

        assertArrayEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void addingAtIndexToEmptyArray() {

        int[] expected = {5};
        int[] output = task2.addingAtIndex(5,0);

        assertArrayEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void deleteAtIndexToEmptyArray() {

        int[] expected = null;
        int[] output = task2.deleteAtIndex(1);

        assertNull(output);
    }

    @org.junit.jupiter.api.Test
    void deleteAtIndex() {

        int[] array = {1,2,3};
        task2.setArray(array);
        int[] expected = {1,3};
        int[] output = task2.deleteAtIndex(1);

        assertArrayEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void deleteAtNotExistingIndex() {

        int[] array = {1,2,3};
        task2.setArray(array);
        int[] expected = {1,2,3};
        int[] output = task2.deleteAtIndex(6);

        assertArrayEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void getAtIndexToEmptyArray() {

        int expected = 0;
        int output = task2.getAtIndex(1);

        assertEquals(expected,output);
    }

    @org.junit.jupiter.api.Test
    void getAtIndex() {

        int[] array = {1,2,3};
        task2.setArray(array);
        int expected = 2;
        int output = task2.getAtIndex(1);

        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void getAtNotExistingIndex() {

        int[] array = {1,2,3};
        task2.setArray(array);
        int expected=0;
        int output = task2.getAtIndex(6);

        assertEquals(expected, output);
    }



}