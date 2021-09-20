class A
{
	int x,y;
A(int x,int y)
{
	
		System.out.println(""+(x+y));
}
}
class B extends A{
B(int x,int y,int z)
{
	super(x,y);
	System.out.println(""+(x+y+z));
}
}
class ConstructorChainingSuper
{
	public static void main(String as[])
	{
		A a=new B(10,20,30);
		
	}
}