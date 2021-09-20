class A
{
	A()
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("static block");//when class is load staticblock is called
	}
}
class StaticBlock
{
public static void main(String as[])
{
	A a=new A();
}
}