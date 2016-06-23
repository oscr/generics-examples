package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Super {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        List<Number> nums = new ArrayList<>();
        List<Object> objs = new ArrayList<>();

        addValue(ints);
        addValue(nums);
        addValue(objs);

        printValues(ints);
        printValues(nums);
        printValues(objs);
    }

    public static <T> void addValue(List<? super Integer> list) {
        list.add(1);
    }

    public static <T> void printValues(List<?> list) {
        System.out.println(list);
    }
}
