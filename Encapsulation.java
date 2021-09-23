class A{
private int x=10;
private int y=10;
void show()
{
	System.out.println(""+x);
	System.out.println(""+y);
}
}
class Encapsulation
{
public static void main(String as[])
{
	A a=new A();
	// System.out.println(a.y);//error:-y has private access in A
	a.show();
}
}