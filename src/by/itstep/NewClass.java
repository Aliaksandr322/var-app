package by.itstep;

class Value {
    int i;
}
public class NewClass {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.i);
        System.out.println(v2.i);
        System.out.println(v1.equals(v2));
        System.out.println(v1.i == v2.i);
    }
}
