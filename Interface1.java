interface Inter1
{
	int x=10;
		default void show()
		{
			System.out.println("Interface="+x);
		}
}
interface Inter2
{
	int x=20; 
	default void show()
		{
			System.out.println("Interface="+x);
		}  
		}
class A implements  Inter1,Inter2{
	
			public void show()
		{
				Inter1.super.show();
				Inter2.super.show();
			System.out.println("Interface and default method="+Inter1.x);
		}
}
class Interface1
{
	public static void main(String as[])
	{
	A a=new A();
	a.show();
	}
	
}