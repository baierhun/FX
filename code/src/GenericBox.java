public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        GenericBox<String> s = new GenericBox<>();
        GenericBox<Integer> i = new GenericBox<>();
    }
}
