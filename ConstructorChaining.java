class A
{
	int x,y;
A(int x,int y)
{
	this(10,20,30); //ConstructorChaining
		System.out.println(""+(x+y));
}
A(int x,int y,int z)
{
	System.out.println(""+(x+y+z));
}
}
class ConstructorChaining
{
	public static void main(String as[])
	{
		A a=new A(10,20);
		// a.show();
	}
}