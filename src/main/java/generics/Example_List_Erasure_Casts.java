package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Erasure_Casts {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());

        // Note how decompiled code inserts cast.
        Apple apple = apples.get(0);
    }

    static class Apple {}
}
