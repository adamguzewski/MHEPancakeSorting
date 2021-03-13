
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PancakeSort {

    public static int pancakeSort(String fileName) throws FileNotFoundException {
        File input = new File(fileName);
        Scanner linia = new Scanner (input);
        String linia1 = linia.nextLine();
        System.out.println(linia1);
        return 1;
    }
}
