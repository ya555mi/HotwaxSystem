interface Inter1{
default void show() //Inter 1 show method
{
	System.out.println("Inter 1");
}
}
interface Inter2{
default void show() //Inter 2 show method
{
	System.out.println("inter 2");
}
}

class A implements Inter1,Inter2{
	public void show() //class A show method
	{
		Inter1.super.show();
		Inter2.super.show();
	System.out.println("class A show method");
		
	}
}
class Multiple 
{
public static void main(String as[])
{
A a=new A();
a.show();
}
}