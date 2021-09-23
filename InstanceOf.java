class InstanceOf
{
public static void main(String as[])
{
Object o=new Object();
// String s=(String)o;
if(o instanceof String)
{
System.out.println(o instanceof Object);//true
System.out.println(o instanceof String);//false
System.out.println(s instanceof String);//true
System.out.println(o instanceof Object);//true
}
}
}