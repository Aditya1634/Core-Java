package Methods;

public class Prime {
	public static void main(String[] args) {
		int num = 1991;
		System.out.println(isPrime(num));
	}

	public static boolean isPrime(int num) {
		if(num<=1)return false;
		for (int i = 2; i*i <= num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
}
