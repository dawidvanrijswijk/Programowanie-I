package Programowanie.zaj2;

import java.util.Objects;

public class Vector3D<D extends Number> {

    public static class Vector3d<T> {
        private T a, b, c;

        public Vector3d(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public T getA() {
            return a;
        }

        public void setA(T a) {
            this.a = a;
        }

        public T getB() {
            return b;
        }

        public void setB(T b) {
            this.b = b;
        }

        public T getC() {
            return c;
        }

        public void setC(T c) {
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vector3d<?> vector3d = (Vector3d<?>) o;
            return Objects.equals(a, vector3d.a) &&
                    Objects.equals(b, vector3d.b) &&
                    Objects.equals(c, vector3d.c);
        }

        @Override
        public int hashCode() {

            return Objects.hash(a, b, c);
        }

        @Override
        public String toString() {
            return "Vector3d{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }
    }
}

