package Methods;

public class CountDigits {
	public static int countDigits(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n/=10;
		}
		return count;
	}
}
