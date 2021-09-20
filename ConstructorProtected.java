class A
{

protected void A(int x,int y)
{
	
		System.out.println(""+(x+y));
}
}
class ConstructorProtected
{
	public static void main(String as[])
	{
		// A a=new A(80,30);
		A a=new A();
		a.A(10,20);
	}
}