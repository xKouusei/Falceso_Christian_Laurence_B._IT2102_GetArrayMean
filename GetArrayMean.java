import java.util.Scanner;

public class GetArrayMean {

    // Function to calculate the mean of an integer array
    public static double getArrayMean(int[] arr) {
        // Calculate the sum of elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        // Return the mean (average) of the elements
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the integers
        int[] arr = new int[n];

        // Ask for n number of integers and store them in the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
        }

        // Call the getArrayMean function and print the result
        double mean = getArrayMean(arr);
        System.out.printf("Mean of array is: %.2f\n", mean);

        scanner.close();
    }
}
