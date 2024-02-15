package demo;

public class ExampleStatic {
    public static void main(String[] args) {
        Cat c = new Cat("Tom",3);
        c.sayMeow();

        c.staticSayMeow();
        Cat.staticSayMeow();
    }
}
