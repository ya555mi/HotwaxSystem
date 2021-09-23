class A
{ 
void show()
{
	System.out.println("class A");
}
}
class B extends A{
	void show(){
	System.out.println("class B");	                      //by default sub class ka first statement super hota he
	}
}

class SingleM{
	public static void main(String as[]){
		
		B b=new B();
		b.show();
		
		
		
	}
	
}