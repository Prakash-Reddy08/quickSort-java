import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After: ");
        printArray(numbers);
    }
    
    private static void quickSort(int[] numbers,int start,int pivote){

    }

    private static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
}
