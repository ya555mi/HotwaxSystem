class A{
A() //class A constructor
{
	System.out.println("class A");
}
}
class B extends A{
B() //class B constructor
{
	System.out.println("class b");
}
}
class C extends B{
C() //class C constructor
{
	System.out.println("class C");
}
}
class Multilevel
{
public static void main(String as[])
{
	C c=new C();
}
}