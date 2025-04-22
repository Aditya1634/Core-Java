class ATM
{
	public static void main(String [] args)
	{
	
		int balance=6400;
		int note=500;
		int TotalNotes=balance/note;
		int remaining=balance%note;
		System.out.println("Total number of notes are :"+TotalNotes);
		System.out.println("Total remaining amount is :"+remaining);

	}


}