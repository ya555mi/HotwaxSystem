class Throw
{
	public static void main(String as[])
	{
		int age=Integer.parseInt(as[0]);
	if(age<=18)
	{
	ArithmeticException ae=new ArithmeticException("Invalid age "+age);
	throw ae;
	}
	else{
		System.out.println("welcome");
	}
		System.out.println("SWT 1");
	}


}