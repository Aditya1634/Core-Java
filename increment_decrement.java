class Main{
	public static void main(String[] args){
		int a = 17;
		int b = -21;
		int c = ++a - b++ + b - ++b + a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}