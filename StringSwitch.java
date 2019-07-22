public class StringSwitch {
    public static final String MEDIUM = "Medium";
    public static final String HOT = "Hot";

    public static void main(String[] args) {
        String spice = "Medium Hot";
        switch(spice)
        {
            case "Mild":
            case "Medium" + " " + "Hot":
                System.out.println("Enjoy!");
                break;
            default:
                System.out.println("No man!");
        }
    }
}
