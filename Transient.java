import java.io.*;
class Transient implements Serializable
{
    int i = 10, j = 20;
    transient int k = 30;
    transient static int l = 40;
    transient final int m = 50;
    public static void main(String[] args) throws Exception
    {
        Transient input = new Transient();
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Transient output = (Transient) ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l);
        System.out.println("m = " + output.m);
    }
}
