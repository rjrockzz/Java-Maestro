public class ClassNamedMethod{
	ClassNamedMethod()
	{
		System.out.println("Constructor");
	}
	void ClassNamedMethod()
	{
		System.out.println("Method");
	}
	public static void main(String[] args) {
		new ClassNamedMethod().ClassNamedMethod(); //Constructor call followed by method call 
	}
}