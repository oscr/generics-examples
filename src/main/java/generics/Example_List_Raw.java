package generics;

import java.util.ArrayList;
import java.util.List;

public class Example_List_Raw {
    public static void main(String[] args) {
        List ints = new ArrayList();
        ints.add(1);
        ints.add(3.14);

        System.out.println(ints);

        int sum = 0;
        for (Object i: ints) {
            // Run time exception
            sum += (Integer)i;
        }
        System.out.println(sum);
    }
}
