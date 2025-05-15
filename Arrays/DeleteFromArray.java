package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,4,3,45,5,5};
		System.out.println("enter element you want to delete");
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(n==arr[i])count++;
		}
		int newArr[] = new int[arr.length-count];
		if(count == 0)System.out.println("Element doesnt exist in Array");
		if(count > 0) {
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==n)continue;
				newArr[j++]=arr[i];
			}
			System.out.println(Arrays.toString(newArr));
		}
	}

}
