interface Inter1
{
	public boolean equals(Object o);
}
/*  by default all class extends Object class  */
class Interface2 implements  Inter1
{
	public static void main(String as[])
	{
	A a=new A();
	System.out.println(a.equals(a));
	}
	
}