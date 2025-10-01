public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public GenericBox() {
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        GenericBox<String> s = new GenericBox<>("Hello, world!");
        GenericBox<Integer> i = new GenericBox<>();
        System.out.println(s);
    }

}
