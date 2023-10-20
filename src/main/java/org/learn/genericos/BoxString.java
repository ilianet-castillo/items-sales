package org.learn.genericos;

public class BoxString {
    private String a;
    private String b;
    private String c;
    private String d;

    public boolean AddString(String elem1) {
        boolean result = false;
        if (a == "") {
            a = elem1;
            result = true;
        } else if (b == "") {
            b = elem1;
            result = true;
        } else if (c == "") {
            c = elem1;
            result = true;
        } else if (d == "") {
            d = elem1;
            result = true;
        } else {
            System.out.println("This box is full");
        }
        return result;
    }

    @Override
    public String toString() {
        return "BoxString{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}

