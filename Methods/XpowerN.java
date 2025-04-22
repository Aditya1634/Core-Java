package Methods;

public class XpowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xPowerN(2,10));
	}
	public static int xPowerN(int x, int n) {
		int res =1;
		for (int i = 0; i < n; i++) {
			res*=x;
		}
		return res;
		
	}

}
