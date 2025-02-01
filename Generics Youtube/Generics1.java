public class Generics1<T> {
    public T value ;
    public Generics1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Generics1{" +
                "value=" + value +
                '}';
    }
}
