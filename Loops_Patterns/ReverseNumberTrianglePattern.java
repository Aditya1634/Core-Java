package Loops_Patterns;

//1 2 3 4 
// 2 3 4
//  3 4
//   4
public class ReverseNumberTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1; i<=n; i++) {
			for(int j =i; j<=n; j++) {
				if(j%2==1)System.out.print(" ");
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
