class Example16
{
	public static void main(String args[])
	{
		Emp e1= new Emp(101, "Cyber");
		String s1="Success";
		Integer i1=100;
		Object[] o= new Object[3];
		//Upcasting
		o[0]=e1;
		o[1]=s1;
		o[2]=i1;
		for(Object oo: o)
		{
			if (oo instanceof Emp)
			{	
				Emp ee=(Emp)oo;
				System.out.println(ee.empId+"-"+ee.empName);
			}
			else if (oo instanceof Integer)
			{
				Integer ii=(Integer)oo;
				System.out.println(ii);
			}
			else if (oo instanceof String)
			{
				String ss=(String)oo;
				System.out.println(ss);
			}
		}
	}
}