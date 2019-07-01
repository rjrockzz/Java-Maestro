public class MethodsWithVariableArguments {
static void show(String...values){
    System.out.println("Showing Variable Arguments");
}
    public static void main(String[] args) {
    show();
    show("my", "name", "is", "Arjun");
    }
}
