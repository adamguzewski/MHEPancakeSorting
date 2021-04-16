import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int[] given = GivenNumbers.givenNumbers();

        PancakeSort.goalFunction(given, given.length);
        ArrayPrinter.arrayPrinter(given, given.length);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj ilość elementów w tablicy: ");
//        int number = scanner.nextInt();
//
//        scanner.nextLine();
//
//        int[] gen = ArrayGenarate.arrayGenerate(number);
//        ArrayPrinter.arrayPrinter(gen, gen.length);
//        PancakeSort.goalFunction(gen, gen.length);
//        ArrayPrinter.arrayPrinter(gen, gen.length);

//        int[] arrayToSort = NumberReader.readFile("C:\\Users\\mail2\\IdeaProjects\\MHEPancakeSorting\\input.txt");
//        ArrayPrinter.arrayPrinter(arrayToSort, arrayToSort.length);
//
//        PancakeSort.goalFunction(arrayToSort, arrayToSort.length);
//        System.out.println("*************************************");
//        ArrayPrinter.arrayPrinter(arrayToSort, arrayToSort.length);
//
//        int[] generatedArray = ArrayGenarate.arrayGenerate(6);
//        ArrayPrinter.arrayPrinter(generatedArray, generatedArray.length);
//        PancakeSort.goalFunction(generatedArray, generatedArray.length);
//        System.out.println("*************************************");
//        ArrayPrinter.arrayPrinter(generatedArray, generatedArray.length);

//        scanner.close();

    }
}
