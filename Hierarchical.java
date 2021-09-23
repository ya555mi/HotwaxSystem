class A{
void show() //class A show method
{
	System.out.println("class A");
}
}
class B extends A{
void show() //class B show method
{
	System.out.println("class b");
}
}
class C extends A{
void show() //class C show method
{
	System.out.println("class C");
}
}
class Hierarchical
{
public static void main(String as[])
{
	C c=new C();
	c.show();
}
}