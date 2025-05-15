package Arrays;

public class SecondMaxElementsFromArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int max = arr[0];
		int secondMax = arr[1];
		
		max = Math.max(max, secondMax);
		secondMax = Math.min(max, secondMax);
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i]>max) {
				secondMax = max;
				max=arr[i];
			}
		}
		System.out.println(secondMax);
	}
}
