package generics;

public class Example_Arrays {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3};
        Number[] numbers = ints;

        // Run time exception
        numbers[0] = 3.14;
    }
}
