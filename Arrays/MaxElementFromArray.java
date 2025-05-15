package Arrays;

public class MaxElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,5,6,67,77,88,234};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}

}
