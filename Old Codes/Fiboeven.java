class Fiboeven
{
static final int max_index = 9;
public static void main(String args[])
{
int lo=1;
int hi=1;
String mark;
System.out.println("1: " + lo);
for (int i = 2; i <= max_index; i++)
{
if(hi%2 ==0)
	mark="*";
else
	mark="";
System.out.println(i+": " + hi + mark);
hi=hi+lo;
lo=hi-lo;
}
System.out.println("The numbers marked as * are even numbers");
}
} 