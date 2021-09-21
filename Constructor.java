class A
{
	int x,y;
A(int x,int y)
{
	this.x=x;//this keyword point instance variable
	this.y=y;
	
}
void show()
{
	System.out.println(""+x);
	System.out.println(""+y);
}
}
class Constructor
{
	public static void main(String as[])
	{
		A a=new A(10,20);
		a.show();
	}
}