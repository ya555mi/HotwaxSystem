import java.io.*;
class Throws
{
public static void main(String as[])throws FileNotFoundException
{
	System.out.println("softwaves_1");
	// try{
	PrintWriter pw=new PrintWriter("xyz.txt");
	pw.print("Hotwax");
	pw.close();
	// }
	// catch(FileNotFoundException e){	
	// System.out.println("");
	// }
	System.out.println("softwaves_2");
	
}
}
