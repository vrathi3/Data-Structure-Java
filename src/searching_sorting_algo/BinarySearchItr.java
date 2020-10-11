package searching_sorting_algo;

public class BinarySearchItr {
	
	public static int binarySearchItrative(int arr[], int n) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = start + (end - start);
			if (arr[mid] == n) {
				return mid;
			}
			if (arr[mid] < n) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {2, 4, 5, 8, 10, 40 , 60};
		int result=binarySearchItrative(arr, 60);
		System.out.println("Element present at "+ result);
	}

}
