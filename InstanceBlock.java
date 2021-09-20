class A{
	A()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("Instance block");//instance block is first priority of jvm
	}
}
class InstanceBlock
{
public static void main(String as[])
{
	A a=new A();
}
}