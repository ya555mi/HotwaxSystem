class InvalidAgeException extends RuntimeException
{
// InvalidAgeException()
// {
	// System.out.println("welcome");
// }
InvalidAgeException(String s)
{
super(s);
}

}
class CustomException
{
public static void main(String as[])
{
int age=Integer.parseInt(as[0]);
if(age<18)
{
// InvalidAgeException ae=new InvalidAgeException("InvalidAge is "+age);
throw new InvalidAgeException("InvalidAge is "+age);
// throw ae;
}	
else
	System.out.println("welcome");
}
}