import java.util.Random;

public class ArrayGenarate {
    static int[] arrayGenerate(int n) {
        Random number = new Random();
        int[] generatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            generatedArray[i] = number.nextInt(2000)-1000;
        }
        return generatedArray;
    }
}
