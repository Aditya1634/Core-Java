package Loops_Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 || j==1 || i+j==n+1)System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
