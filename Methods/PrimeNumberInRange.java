package Methods;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(Prime.isPrime(i))System.out.println(i);
		}
	}
}
