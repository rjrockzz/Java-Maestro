public class StringBuilderClass {
    public static void main(String[] args) {
     StringBuilder bld = new StringBuilder("Arjun"); //Capacity = 16 + 5 = 21
     bld= bld.append("Sharma"); //Mutable
     bld = bld.insert(5, "Nice!");
        System.out.println(bld);
        char c = bld.charAt(6);
        System.out.println(c);
        CharSequence bb = bld.subSequence(4,7);     //CharSequence Interface
        System.out.println(bb);
        bld = bld.append(" is a nice guy!");
        System.out.println(bld);
        bld = bld.append(bb);
        System.out.println(bld);
        bld = bld.deleteCharAt(5);
        System.out.println(bld);
        bld = bld.reverse();
        System.out.println(bld);
        bld = bld.append(42).insert(2,"X").reverse().deleteCharAt(builder.length()-1).append('s');
        System.out.println(bld);
    }
}
