public class VariableArgs {
    public static void flex(Object ... data)
    {
        System.out.println("Type : " + data.getClass().getName());
        System.out.println("Data Length = " + data.length);
        System.out.println("Element values");
        for(Object element : data)
            System.out.println(element + " ");
        System.out.println();
    }

    public static void main(String... args) {
        int day = 13;
        String month = "August";
        int year = 2009;
        flex();
        flex(day);
        flex(day,year);
        flex(day,year,month);
        System.out.println();
        Object[] dateInfo = {day, year, month};
        flex(dateInfo);
        flex((Object) dateInfo);
        flex(new Object[] {dateInfo});
        System.out.println();
        flex(args);
        flex((Object)args);
        flex((Object[]) args);
    }
}
