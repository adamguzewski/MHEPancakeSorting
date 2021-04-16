import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arrayToSort = NumberReader.readFile("C:\\Users\\mail2\\IdeaProjects\\MHEPancakeSorting\\input.txt");
        ArrayPrinter.arrayPrinter(arrayToSort, arrayToSort.length);

        PancakeSort.goalFunction(arrayToSort, arrayToSort.length);
        System.out.println("*************************************");
        ArrayPrinter.arrayPrinter(arrayToSort, arrayToSort.length);

    }
}
