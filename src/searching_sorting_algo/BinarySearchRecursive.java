package searching_sorting_algo;

public class BinarySearchRecursive {

	public static int binarySearchRecursive(int arr[], int start, int end, int n) {
		if (end >= start) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == n) {
				return mid;
			}
			if (arr[mid] > n) {
				return binarySearchRecursive(arr, start, mid - 1, n);
			} else {
				return binarySearchRecursive(arr, mid + 1, end, n);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int start = 0;
		int end = arr.length;
		int n = 10; // n is number which element we need to search
		int result = binarySearchRecursive(arr, start, end, n);

		System.out.println("Element present at " + result);
	}

}
