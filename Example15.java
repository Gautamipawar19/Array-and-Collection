class Example15
{  
	public static void main(String args[])
	{
		String[][] s={{"A", "B", "C"}, {"D", "E", "F"}};
		for (int i=0; i<s.length; i++)
		{
			for (int j=0; j<s[0].length; j++)
			{
				System.out.print(" "+s[i][j]);
			}
			System.out.println();
		}
	}
}