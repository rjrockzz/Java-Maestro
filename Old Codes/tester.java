class A
{
public static void hi()
{
System.out.println("Hello 1");
}
}
class B extends A
{
public static void hello()
{
System.out.println("My Bro!");
}
}
class tester
{
public static void main(String[] args)
{
B obj = new B();
B.hi();
B.hello();
}
} 
