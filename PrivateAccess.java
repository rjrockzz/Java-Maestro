class farmer
{
    private int width;          //motive to hide the implementation from the user
    private int length;
    private int arjun;
    public void set(int a, int b)
    {
        length = a;
        width = b;
    }
    public int getArjun() {
        return arjun;
    }

    public void setArjun(int arjun) {
        this.arjun = arjun;
    }

    public int getArea()
    {
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
public class PrivateAccess extends farmer{
    public static void main(String[] args) {
        farmer p1 = new farmer();
        p1.set(2, 3);
        double area = p1.getArea();
        System.out.println(area);
        p1.setArjun(23);
        System.out.println(p1.getArjun());
    }
}
