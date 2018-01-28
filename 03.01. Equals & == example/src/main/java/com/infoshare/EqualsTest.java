package com.infoshare;

import java.util.Objects;

public class EqualsTest {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsTest that = (EqualsTest) o;
        return a == that.a &&
                Double.compare(that.b, b) == 0 &&
                Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }

    int a;
    double b;
    String c;

    EqualsTest(int a, double b, String c) {
        this.a =a;
        this.b =b;
        this.c =c;
    }

}

