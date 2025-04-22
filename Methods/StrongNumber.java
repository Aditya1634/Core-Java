package Methods;
//A strong number is a number where the sum of the factorials of its digits equals the number itself.
//For example, 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145
public class StrongNumber {

	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int d = num%10;
			sum += Factorial.findFactorial(d);
			num/=10;
		}
		if(sum==temp)System.out.println("Is Strong");
		else System.out.println("Not Strong");
	}

}
