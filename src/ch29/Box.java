package ch29;

class Box<T> {
    private T ob;

    public Box(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}
