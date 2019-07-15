public class GenericConstructorinNonGenericClass {
    private double grade;
    private String Name;
    <V ,T extends Number> GenericConstructorinNonGenericClass (V str , T x)
    {
        Name = (String) str;
        grade = x.doubleValue();
    }
    void display()
    {
        System.out.println(Name + "  " + grade);
    }

    public static void main(String[] args) {
        GenericConstructorinNonGenericClass ge[] = new GenericConstructorinNonGenericClass[5];
        ge[0] = new GenericConstructorinNonGenericClass("Arjun" , 87.2);
        ge[1] = new GenericConstructorinNonGenericClass("Arjun" , 87.2);
        ge[2] = new GenericConstructorinNonGenericClass("Arjun" , 87.2);
        ge[3] = new GenericConstructorinNonGenericClass("Arjun" , 87.2);
        ge[4] = new GenericConstructorinNonGenericClass("Arjun" , 87.2);
        for(GenericConstructorinNonGenericClass x : ge)
        {
            x.display();
        }
    }
}
