import java.util.*;

public class Bubblesort {
    public static final Random random = new Random();
    public static final int TEST_DATA_AMOUNT = 20;

    public static int[] generateRandomIntArray() {
        int[] randomArray = new int[TEST_DATA_AMOUNT];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
}
