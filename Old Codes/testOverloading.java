class Adder
{
static int add(int a,int b)
	{
	return a+b;
	}
static int add(int a, int b, int c)
	{
	return a+b+c;
	}
}
class testOverloading
{
public static void main ( String args[])
{
System.out.println(Adder.add(11,11));
System.out.println(Adder.add(12,11,430));
}
}