class A 
{
int salary=10000;
}
class Inherit extends A
{
int bonus = 100;
	public static void main(String args[])
		{
			Inherit k = new Inherit();
			System.out.println(k.salary);		
			System.out.println(k.bonus);
		}
}	