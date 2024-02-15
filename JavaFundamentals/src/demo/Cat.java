package demo;

class Cat {

    String name;
    int age;

    Cat() {
        System.out.println("A cat was created");
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("A cat was created");
    }

    void sayMeow() {
        System.out.println("Meow! My name is " + this.name);
    }

    static void staticSayMeow(){
        System.out.println("Meow!");
    }
}