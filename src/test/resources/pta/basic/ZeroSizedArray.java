class ZeroSizedArray {
    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new A();
        Container ct1 = new Container();
        Container ct2 = new Container();
        ct1.setObj(0, o1);
        ct2.setObj(0, o2);
        A res1 = ct1.getObj(0);
        A res2 = ct2.getObj(0);
    }
}

class Container {
    private static final A[] EMPTY = new A[0];
    private static final int MAX_SIZE = 4;
    private A[] data;

    public Container() {
        data = EMPTY;
    }

    public void setObj(int index, A a) {
        // assert index >= 0 && index < MAX_SIZE;
        if (data == EMPTY) {
            data = new A[MAX_SIZE];
        }
        data[index] = a;
    }

    public A getObj(int index) {
        // assert index >= 0 && index < data.length;
        return data[index];
    }

}

class A {
}

