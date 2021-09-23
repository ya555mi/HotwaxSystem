class A
{ 
A()
{
	System.out.println("class A");
}
}
class B extends A{
	B(){
	System.out.println("class B");	                      //by default sub class ka first statement super hota he
	}
}

class C extends A{
	C(){
	System.out.println("class c");	                       //by default sub class ka first statement super hota he
	}
}
class Single{
	public static void main(String as[]){
		
		C c=new C();
		B b=new B();
		
		
		
	}
	
}