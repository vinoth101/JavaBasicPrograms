import java.util.Arrays;

class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
class multiple{
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        Dog r =new Dog();
        r.bark();
        r.eat();
        
    }}

