package generics;

import java.util.Arrays;
import java.util.List;

public class Example_List_Wildcard {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2);

        printAll_wildcard(ints);
        //printAll_raw(ints);
    }

    private static void printAll_wildcard(List<?> list) {
        list.forEach(System.out::println);
    }

    // Note compiler warning for raw type
    private static void printAll_raw(List list) {
        list.forEach(System.out::println);
    }
}
