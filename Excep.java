class Excep
{
	public static void main(String as[])
	{
		System.out.println("open connection");
		System.out.println("100 lines code");
		try
		{
		System.out.println("SWT 1");
			int x=Integer.parseInt(as[0]);
		System.out.println("SWT 2");
			int y=Integer.parseInt(as[1]);
	     	System.out.println(x/y);
		System.out.println("SWT 3");
		}
		catch(Exception e){
		System.out.println(e);
			
		}
		finally{
			
		System.out.println(" connection close");
			
		}
	}


}