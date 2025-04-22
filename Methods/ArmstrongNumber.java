package Methods;
//An Armstrong number is a number where the sum of the cubes of its digits equals the number itself.
public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		int count = CountDigits.countDigits(num);
		while(num!=0) {
			int d = num%10;
			sum += XpowerN.xPowerN(d, count);
			num/=10;
		}
		if(sum == temp) {
			System.out.println("Is Armstrong");
		}
		else {
			System.out.println("Is not Armstrong");
		}
	}
}
