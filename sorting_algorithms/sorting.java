import java.lang.Math;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        System.out.println("Unsorted array:");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 50.0);
        }
        System.out.println(Arrays.toString(arr) + "\n");
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        int[] arr4 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            arr3[i] = arr[i];
            arr4[i] = arr[i];
        }
        arr  = bubble(arr);
        arr2 = selection(arr2);
        arr3 = insertion(arr3);
        arr4 = quick(arr4, 0, arr4.length);
        System.out.println("Bubble:");
        System.out.println(Arrays.toString(arr) + "\n");
        System.out.println("Selection:");
        System.out.println(Arrays.toString(arr2) + "\n");
        System.out.println("Insertion:");
        System.out.println(Arrays.toString(arr3) + "\n");
        System.out.println("Quick:");
        System.out.println(Arrays.toString(arr4));
    }

    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j]     = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) {
                    lowest = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i]      = arr[lowest];
            arr[lowest] = temp;
        }
        return arr;
    }

    public static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j   = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] quick(int[] arr, int low, int high) {
        if (low < high) {
            int finalPosition = partition(arr, low, high);
            quick(arr, low, finalPosition);
            quick(arr, finalPosition + 1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high) {
        int index = low + 1;

        for (int i = index; i < high; i++) {
            if (arr[i] < arr[low]) {
                // swap arr[i] and arr[index]
                swap(arr, i, index);
                index++;
            }
        }
        index--;
        // swap low with index
        swap(arr, low, index);
        return index;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }
}
