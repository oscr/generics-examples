package generics;

public class Example_Varargs {
    public static void main(String[] args) {
        Integer[] j = makeGenericArray(1, 2, 3);
    }

    // Gives warning: Possible heap pollution from parameterized vararg type T
    public static  <T> T[] makeGenericArray(T... values) {
        return values;
    }
}
