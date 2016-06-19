package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Invariant {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();

        // Compile time error
        //List<Number> numbers = ints;
    }
}
