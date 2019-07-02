interface function1
{
    void display();
}
public class Lambda {
    public static void main(String[] args) {
        function1 f = () -> System.out.println("Empty lamda expression");
        f.display();
    }
}
