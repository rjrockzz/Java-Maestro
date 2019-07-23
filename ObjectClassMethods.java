class CloneMethods implements Cloneable {
    @Override
    public CloneMethods clone() {
        CloneMethods obj = null;
        try {
            obj = (CloneMethods) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return obj;
    }
}
public class ObjectClassMethods{
    public static void main(String[] args) {
        CloneMethods obj1 = new CloneMethods();
        CloneMethods obj2 = new CloneMethods();
        String str1 = "Arjun";
        String str2 = "Arjun";
        System.out.println("Hash Code for str1 = " + str1.hashCode());
        System.out.println("Hash Code for str2 = " + str2.hashCode()+ "\n");

        System.out.println("Hash Code for obj1 = " + obj1.hashCode());
        System.out.println("Hash Code for obj2 = " + obj2.hashCode()+ "\n");

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("(str1==str2) = " + (str1==str2)+"\n");

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
        System.out.println("(obj1==obj2) = " + (obj1==obj2)+"\n");

        System.out.println("The object representation (class@hash value format) = " + obj1);
        String text = obj1.toString();
        String text2 = str1.toString();
        System.out.println("The toString method for its textual representation (Object)= " + text );
        System.out.println("The toString method for its textual representation (String)= " + text2 );

        //Array Shallow Copying
        CloneMethods[] arr1 = {new CloneMethods(), new CloneMethods(), new CloneMethods()};
        CloneMethods[] arr2 = arr1.clone();
        boolean b = arr1==arr2;
        System.out.println("arr1==arr2 : " + b);
        for(int x = 0; x< arr1.length; x++){
            System.out.println("arr1["+x+"] == arr2["+ x +"] : "+ (arr1[x]==arr2[x]));
        }
        System.out.println();
        //Object cloner
        CloneMethods obj3 = obj1.clone();
        System.out.println("Hash Code for obj3 : "+ obj3.hashCode());
        System.out.println("Raw Object :" + obj3);
        System.out.println("obj1==obj3 : "+ (obj1==obj3));
    }
}

