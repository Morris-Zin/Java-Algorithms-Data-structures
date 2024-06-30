import java.util.Arrays;

public class Practise {

  public static void main(String[] args) {
    int[] toSort = { 1, 9, 2, 90 };
    bubbleSort(toSort);
    System.out.println(Arrays.toString(toSort));

    int[] selectionSortArray = { 1, 9, 2, 90, 92, 3 };
    selectionSort(selectionSortArray);
    System.out.println(Arrays.toString(selectionSortArray));
    fibonacciNumber(10);

    int[] searchingArray = { 1, 9, 2, 90, 302 };
    binarySearch(302, searchingArray);
  }

  public static void binarySearch(int target, int[] array) {
    boolean found = false;
    int l = 0;
    int r = array.length - 1;
    while (!found) {
      int mid = l + (r - l) / 2;
      if (array[mid] == target) {
        System.out.println(
          "found" + " " + array[mid] + " at the position " + mid
        );
        found = true;
      }
      if (array[mid] < target) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
  }

  public static void fibonacciNumber(int n) {
    int count = 0, first = 0, second = 1, num3 = 0;
    while (count < n) {
      System.out.println(first);
      num3 = first + second;
      first = second;
      second = num3;
      count++;
    }
  }

  public static void selectionSort(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static void bubbleSort(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
  }
}
