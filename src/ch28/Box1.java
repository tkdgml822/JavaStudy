package ch28;

class Box1<T, U> {
    private T id;
    private U con;

    public Box1(T i, U c) {
        id = i;
        con = c;
    }

    public void showIt() {
        System.out.println("ID: " + id + ", " + "Contents" + con);
    }
}
