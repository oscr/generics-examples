package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Generic {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        //ints.add("Hello world"); // Compile time error!

        System.out.println(ints);
    }
}
