package org.learn.genericos;

public class BoxAny<T> {

    private T first;

    private T second;
    private T third;
    private T fourth;

    public boolean addAny(T elem) {
        boolean result = true;
        if (first == null) {
            first = elem;
        }
        if (second == null) {
            second = elem;
        }
        if (third == null) {
            third = elem;
        }
        if (fourth == null) {
            fourth = elem;
        }
        else {
            System.out.println("This box is full");
        }
        return result;
    }

    @Override
    public String toString() {
        return "BoxAny{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                '}';
    }
}


