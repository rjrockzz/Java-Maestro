class Generosity<T ,U>
{
    T obj;
    U obj1;
    Generosity (T obj , U obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }
    public void getit()
    {
        System.out.println(this.obj);
        System.out.println(this.obj1);
    }

    public static void main(String[] args) {
        Generosity <Integer,String> i = new Generosity<Integer,String>(15, "Atjun");
        i.getit();
    }
}
