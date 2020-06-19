
// import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] newArr = readIntegers(count);
        int minValue = findMin(newArr);
        System.out.println("The minimum value is- " + minValue);
    }

    public static int[] readIntegers(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            scanner.nextLine();
            arr[i] = num;
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}