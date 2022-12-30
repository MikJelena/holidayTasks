import org.example.Task1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class Task1Test {

    Task1 task1 = new Task1();

    @Test
    void adding(){


        int[] expected = {5,10};
        int[] output = task1.add(10);

        assertArrayEquals(expected, output);



    }

}
