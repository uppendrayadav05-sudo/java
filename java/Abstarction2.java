abstract class Animal {
    abstract void sound();

    abstract void behavior();

    void color() {
        System.out.println("Animal color is white");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor is called");
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void behavior() {
        System.out.println("Dog is loyal");
    }

    void color() {
        System.out.println("Dog color is black");
    }
}

class Abstraction2{
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.behavior();
        d.color();
    }
}