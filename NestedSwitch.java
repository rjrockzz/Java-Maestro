import java.util.Scanner;
public class NestedSwitch {
    static String ans;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Enter the Month = ");
            int month = scn.nextInt();
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("It snows!");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("It spring!");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Sunshine Summer!");
                    break;
                case 9:
                case 10:
                case 11:
                    switch (month) {
                        case 10:
                            System.out.println("Halloween!");
                            break;
                        case 11:
                            System.out.println("ThanksGiving!");
                            break;
                        default:
                            System.out.println("Autumn!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Sorry , wrong case selected!");
                    break;
            }
            System.out.println("Do you want to enter more??(yes/no)");
            ans = scn.next();
        }while(ans.equalsIgnoreCase("YES"));
    }
}