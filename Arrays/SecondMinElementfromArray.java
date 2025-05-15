package Arrays;

public class SecondMinElementfromArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7};
		int min = arr[0];
		int secondMin = arr[1];
		
		min = Math.max(min, secondMin);
		secondMin = Math.min(min, secondMin);
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i]<min) {
				secondMin = min;
				min=arr[i];
			}
		}
		System.out.println(secondMin);
	}

}
