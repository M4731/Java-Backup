package main;

public class Example2 {

    public static void main(String[] args) {
        A a1 = new A();
        a1.x = 10;
        a1.m();

        B b1 = new B();
        b1.x = 20;
        b1.m();

        B b2 = new B(1,2,3);
        b2.m();;
    }
}
