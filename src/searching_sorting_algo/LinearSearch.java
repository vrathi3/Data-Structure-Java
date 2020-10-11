package searching_sorting_algo;

public class LinearSearch {
	
	public static int linearSearchPractice(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {2, -1, 3, 4, 0, 12, 6, -12};
		int result=linearSearchPractice(arr, -1);
		System.out.println("Element Present at " + result);
	}

}
