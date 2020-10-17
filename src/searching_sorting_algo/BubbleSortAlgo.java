package searching_sorting_algo;

public class BubbleSortAlgo {
	
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {-1, 2, 0, 12, 7, 9, 13, 10, -10, 60};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}

}
