import java.io.*;
class TryWithResource2
{
public static void main(String as[])throws IOException
{
int i=0;
String s1="my name is ram and i am from indorecddccd ";	
FileWriter fi=null;
try{
	fi=new FileWriter("abc.txt"); //Object of FileWriter
while(i<s1.length())
{
	fi.write(s1.charAt(i++));
}
System.out.println(10/0);
}
finally{ //always executable block
fi.close();//if connection is close then data insert otherwise not
System.out.println("data insert");
}
}
}