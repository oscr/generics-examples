package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Erasure {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        List<Candy> candies = new ArrayList<>();

        System.out.println(apples.getClass() == candies.getClass());
    }

    class Apple {}
    class Candy {}
}
