class GenericFunction
{
    static <T> void genericDisplay (T element)
    {
        System.out.println(element.getClass() +
                " = " + element);
    }
    public static void main(String[] args)
    {
        genericDisplay(11);
        genericDisplay("Arjun");
        genericDisplay(1.0f);
    }
}
