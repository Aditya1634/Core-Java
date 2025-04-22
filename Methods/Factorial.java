package Methods;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorial(5));
	}

	public static int findFactorial(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res*=i;
		}
		return res;
	}

}
