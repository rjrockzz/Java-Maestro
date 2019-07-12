import java.io.FileInputStream;
public class test
{
	public static void main(String[] args) {
		try{
			FileInputStream hey = new FileInputStream("F:\\Arjun\\arjun.txt");
			int i = 0;
			while((i=hey.read())!=-1)
				{
				System.out.println((char)i);
				}
			hey.close();
			System.out.println("Success");
		}catch(Exception e){System.out.println(e);}
	}
}