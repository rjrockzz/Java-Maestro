public class ReferenceValues{
	public static void main(String[] args) {
		Pizza fav = new Pizza();
		System.out.println("1 " + fav.meat);
		bake(fav);
		System.out.println("2 " + fav.meat);
	}
	public static void bake(Pizza baker)
	{
		baker.meat = "chicken";
		baker = null;
	}
}
class Pizza 
{
	String meat = "beef";
}