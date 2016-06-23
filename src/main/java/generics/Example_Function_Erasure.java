package generics;

public class Example_Function_Erasure {
    public static void main(String[] args) {
        new Example_Function_Erasure().run();
    }

    private void run() {
        Integer i = 1;
        Integer j = getValueBack(i);
    }

    // check with javap
    public <T> T getValueBack(T value) {
        return value;
    }
}
