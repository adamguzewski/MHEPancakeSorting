
public class PancakeSort {
    // metoda odwracająca tablicę [0..maxNumberIndex]
    static void flip(int[] numbers, int i) {
        int tmp, start = 0;
        while (start < i) {
            tmp = numbers[start];
            numbers[start] = numbers[i];
            numbers[i] = tmp;
            start++;
            i--;
        }
    }

    // metoda zwracająca index maksymalnej liczby
    static int maxNumber(int[] numbers, int n) {
        int maxNumberIndex, i;
        for (maxNumberIndex = 0, i = 0; i < n; ++i) {
            if (numbers[i] > numbers[maxNumberIndex]) {
                maxNumberIndex = i;
            }
        }
        return maxNumberIndex;
    }

    // główna metoda sortująca podaną tablicę
    static void goalFunction(int[] numbers, int n) { // tablica, wielkość tablicy
        // zaczynam od całej talbicy i zmniejszam kolejno o 1 największy element
        for(int currentSize = n; currentSize > 1; --currentSize){
            // znajduję index największego elementu tablicy od indeksu 0 do wielkość -1
            int maxNumberIndex = maxNumber(numbers, currentSize);
            //przesuwam największy element tablicy o ile już nie jest ostatni
            if(maxNumberIndex != currentSize -1){
                // przenoszę max numer na początek
                flip(numbers, maxNumberIndex);
                ArrayPrinter.arrayPrinter(numbers, numbers.length);
                // przenoszę max numer na koniec odwracając tablicę
                flip(numbers, currentSize -1);
                ArrayPrinter.arrayPrinter(numbers, numbers.length);
            }
        }
    }
}
