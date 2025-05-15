package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40};
		System.out.println("Enter value to be stored in Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter Index");
		int idx = sc.nextInt();
		int[] newArr = new int[arr.length+1];
		
		if(idx>=0 && idx < newArr.length) {
			newArr[idx] = n;
			int k=0;
			for (int i = 0; i < newArr.length; i++) {
				if(i!=idx)newArr[i]=arr[k++];
			}
			System.out.println(Arrays.toString(newArr));
		}
		else System.out.println("Enter correct index");
	}

}
