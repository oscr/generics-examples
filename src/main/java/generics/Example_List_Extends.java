package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Extends {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        List<? extends Number> numbers = ints;

        // Compile time error
        // numbers.add(1);
    }
}
