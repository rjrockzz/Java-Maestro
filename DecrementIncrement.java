public class DecrementIncrement {
    public static void main(String[] args){
            int var=5;
            System.out.println(var++);
            System.out.println(var);
            System.out.print("\n"+ (--var + var++ + --var + var-- + var++ + ++var));
    }
}
