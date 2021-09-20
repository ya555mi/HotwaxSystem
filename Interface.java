interface Inter1
{
	int x=10; //compiler by default add final,static and public
	 void show();  //compiler by default add abstract and public
}
class A implements  Inter1{
	
			public void show()
		{
			System.out.println("Interface="+x);
		}
}
class Interface 
{
	public static void main(String as[])
	{
	A a=new A();
	a.show();
	}
	
}