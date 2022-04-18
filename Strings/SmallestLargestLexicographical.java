import java.util.Scanner;

public class SmallestLargestLexicographical {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String temp1= "";
        String temp2= "";
        smallest = s.substring(0, k);
        temp2 = s.substring(0, k);
        largest = s.substring(1, k+1);
        for(int i = 0; i <= s.length()-k; i++){
            if(smallest.compareTo(largest)>0){
                temp1 = largest;
                largest = smallest;
                smallest = temp1;
            }
            smallest =  s.substring(i, i+k);

            if(smallest.compareTo(temp2)>0){
                temp1 = smallest;
                smallest = temp2;
                temp2 = temp1;
            }
            temp2 = s.substring(i, i+k);
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}