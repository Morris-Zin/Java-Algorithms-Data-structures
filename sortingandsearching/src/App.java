import java.util.Arrays;

public class App {

  //Position 5 queens are on the chess board, position them so that any cell in the board is under attack. 

  public static void main(String[] args) throws Exception {
    int arr[] = { 3, 2, 9, 2, 1, 10, 291 };
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    int nextarr[] = { 3, 2, 390, 2, 0, 12 };
    selectionSort(nextarr);
    System.out.println(Arrays.toString(nextarr));

    int searchArr[] = { 21, 2, 3, 4 };
    System.out.println(binarySearch(searchArr, 3));

    fibonacciNumber(10);
  }

  

  public static int binarySearch(int arr[], int target) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == target) {
        return target;
      }
      if (arr[mid] > target) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return -1;
  }

  public static void selectionSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void fibonacciNumber(int n) {
    int count = 0;
    int num1 = 0, num2 = 1;
    while (count < n) {
      int num3 = num1 + num2;
      System.out.print((num1 + " "));
      num1 = num2;
      num2 = num3;
      count++;
    }
  }
}
