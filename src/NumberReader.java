import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberReader {

    public static int[] readFile(String filePath) throws FileNotFoundException {
        File newFile = new File(filePath);
        Scanner scanner = new Scanner(newFile);
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;

        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            int intNumber = Integer.parseInt(number);
            numbers.add(intNumber);
            i++;
        }
        int[] arrayNumbers = new int[numbers.size()];
        int j = 0;

        for (Integer arrayNumber : numbers) {
            arrayNumbers[j++] = arrayNumber;
        }
        return arrayNumbers;
    }
}
