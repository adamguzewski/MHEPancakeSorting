import java.util.Scanner;

public class GivenNumbers {
    static int[] givenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy: ");

        int numberOfElements = scanner.nextInt();
        if (numberOfElements <= 0) {
            System.out.println("Podałeś za małą ilość elementów tablicy");
        }
        int[] newArray = new int[numberOfElements];
        System.out.println("Podaj " + numberOfElements + " elementów tablicy.");
        for (int i = 0; i < numberOfElements; i++) {
            int number = scanner.nextInt();
            newArray[i] = number;
        }
        ArrayPrinter.arrayPrinter(newArray, newArray.length);
        return newArray;
    }
}
