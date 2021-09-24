import java.io.*;
class TryWithResource3s
{
public static void main(String as[])throws IOException
{
int i=0;
String s1="my name is ram and i am from ";	

try(FileWriter fi=new FileWriter("abc.txt");){ //Object of FileWriter
while(i<s1.length())
{
	fi.write(s1.charAt(i++));
}
System.out.println(10/0);
System.out.println("data insert");
}
}
}