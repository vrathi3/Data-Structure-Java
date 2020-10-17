package searching_sorting_algo;

public class MergeSortAlgo {
	
	public static void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			int mid=(left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left , mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int temp[] = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		while (i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		for (i = left; i <= right; i++) {
			arr[i] = temp[i - left];
		}
	}

	public static void main(String[] args) {
	 int arr[]= {2, 10, 3, -1, 4, 7, 1, 4, 0, 9};
	 
	 mergeSort(arr, 0, arr.length-1);
	 
	 printArray(arr);
	}
	
	public static void printArray(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
