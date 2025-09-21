class Example8
{
	public static void main(String args[])
	{
		Emp[] e= new Emp[3];
		e[0]=new Emp(101, "Cyber");
		e[1]=new Emp(202, "Success");
		e[2]=new Emp(303, "Training");
		for(Emp ee: e)
		{
			System.out.println(ee.empId+"-"+ee.empName);
		}
	}
}