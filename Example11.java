class Example11
{
	public static void main(String args[])
	{
		Emp[] e = new Emp[5];
		e[0]= new Emp(101, "Hp");
		e[2]= new Emp(303, "Lenovo");
		e[4]= new Emp(505, "Dell");
		for(Emp ee: e)
		{
			if(ee!=null)
			{
				System.out.println(ee.empId+"-"+ee.empName);
			}
			else
			{
				System.out.println(ee);
			}
		}
	}
}