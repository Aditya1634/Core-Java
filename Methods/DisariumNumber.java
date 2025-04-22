package Methods;
public class DisariumNumber {
//	A Disarium number is a number where the sum of its digits raised to the power of their position (starting from 1) equals the number itself
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 135;
		int temp = num;
		int count = CountDigits.countDigits(num);
		int sum = 0;
		while(num != 0) {
			int ld = num % 10;
			sum = sum + XpowerN.xPowerN(ld,count);
			count--;
			num = num/10;
		}
		if(temp == sum) {
			System.out.println("Is Disarium");
		}
		else {
			System.out.println("Not a Disarium");
		}
	}
}
