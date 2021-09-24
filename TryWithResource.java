class A implements AutoCloseable
{
	public void close(){
		System.out.println("close method");
	}

}
class TryWithResource
{
public static void main(String as[])
{
	try(A a=new A();){}
}
}