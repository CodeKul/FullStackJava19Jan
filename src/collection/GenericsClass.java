package collection;

public  class GenericsClass<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    /**
     *  1)  ? question mark means any type
     *  2) T -> type E -> Element  K -> Key  V -> Value
     */

    public static void main(String[] args) {
        GenericsClass<?> obj = new GenericsClass();
//        obj.add(20);
        System.out.println(obj.get());

        GenericsClass<String> obj1 = new GenericsClass<>();
        obj1.add("abbb");
        System.out.println(obj1.get());

    }
}
