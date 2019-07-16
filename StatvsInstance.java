class StatvsInstance 
{
	public static int a = 10;
	public int b = 30;
	public static void main(String[] args) {
		StatvsInstance t1 = new StatvsInstance();
		StatvsInstance t2 = new StatvsInstance();
		t1.a = 1;
		System.out.println(t1.a);
		System.out.println(t2.a);
		t1.b = 15;
		System.out.println(t1.b);
		System.out.println(t2.b);	
	}
}