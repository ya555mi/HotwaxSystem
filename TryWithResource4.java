import java.io.*; //io package
class A implements AutoCloseable //AutoCloseable interface
{
	public void close()//overrided close method of AutoCloseable
	{
		System.out.println("close method");
	}
}
class TryWithResource4
{
	public static void main(String as[])throws IOException
	{ 
		try(FileWriter fi=new FileWriter("abc.txt");     //try-with-resource
		A a=new A())
		{
			System.out.println(10/0);
		}
	}
}