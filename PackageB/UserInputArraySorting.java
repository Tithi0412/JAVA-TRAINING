package PackageB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInputArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of input array 1: ");
        int size1 = scanner.nextInt();
        int[] input1 = new int[size1];
        System.out.println("Enter elements for input array 1:");
        for (int i = 0; i < size1; i++) {
            input1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of input array 2: ");
        int size2 = scanner.nextInt();
        int[] input2 = new int[size2];
        System.out.println("Enter elements for input array 2:");
        for (int i = 0; i < size2; i++) {
            input2[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of input array 3: ");
        int size3 = scanner.nextInt();
        int[] input3 = new int[size3];
        System.out.println("Enter elements for input array 3:");
        for (int i = 0; i < size3; i++) {
            input3[i] = scanner.nextInt();
        }

        

        int[] merged = mergeArrays(input1, input2, input3);
        int[] sortedMerged = sortArray(merged);

        System.out.println("Sorted and Merged Array: " + Arrays.toString(sortedMerged));

        List<Integer> commonElements = findCommonElements(sortedMerged);
        System.out.println("Common Elements: " + commonElements);
        
        List<Integer> evenNumbers = separateEvenNumbers(sortedMerged);
        List<Integer> oddNumbers = separateOddNumbers(sortedMerged);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int[] merged = new int[arr1.length + arr2.length + arr3.length];
        int index = 0;

        for (int num : arr1) {
            merged[index] = num;
            index++;
        }

        for (int num : arr2) {
            merged[index] = num;
            index++;
        }

        for (int num : arr3) {
            merged[index] = num;
            index++;
        }

        return merged;
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static List<Integer> findCommonElements(int[] arr) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !commonElements.contains(arr[i])) {
                commonElements.add(arr[i]);
            }
        }
        return commonElements;
    } public static List<Integer> separateEvenNumbers(int[] arr) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static List<Integer> separateOddNumbers(int[] arr) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
    
}
