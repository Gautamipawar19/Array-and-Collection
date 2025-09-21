class Example12
{
	public static void main(String args[])
	{
		System.out.println("Inside main");
		String[] s = new String[3];
		s[0]= "Cyber";
		s[1]= "Success";
		s[2]= "Training";
		int[] a= m1(s);
		System.out.println("Back to main");
		for(int aa:a)
		{
			System.out.println(aa);
		}
	}	 
	static int[] m1(String[] s)
	{
		System.out.println("Inside m1 method");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		int[] a={10,20,30};	//Instance + Initialization
		return a;//address
	}
}