package OopAbstraction;


public abstract class Animal {
    abstract void makeSound();

}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Wof Wof");
    }
}


class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Miay Miay");

    }
}


class Maain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myCat.makeSound();
        myDog.makeSound();
    }
}
