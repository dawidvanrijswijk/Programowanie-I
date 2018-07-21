package Programowanie.zaj3;

public  class Box<T>
{
    protected T val;

    public Box(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Box{" +
                "val='" + val + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        return val != null ? val.equals(box.val) : box.val == null;
    }

    @Override
    public int hashCode() {
        return val != null ? val.hashCode() : 0;
    }
}
