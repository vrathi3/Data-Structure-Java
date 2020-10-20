package arrays_Problem;

public class Triplet {
	
	public static boolean findTriplet(int arr[] , int n) {
		for (int i = 0; i<n-1; i++) {
			int left= i+1;
			int right=n-1;
			int x=arr[i];
			
			while (left < right) {
				if(arr[left] + arr[right] + x==0) {
					left++;
					right--;
					return true;
				}
				else if (arr[left] + arr[right] + x < 0) {
					left ++;
				}
				else {
					right --;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int arr[]={0, -1, 2, -3, 1};
		
		boolean result = findTriplet(arr, arr.length);
		System.out.println(result);
		

	}

}
