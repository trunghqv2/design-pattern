// Animal class (Abstract Product)
abstract class Animal {
    abstract void makeSound();
}

// Dog class (Concrete Product)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Gâu gâu!");
    }
}

// Cat class (Concrete Product)
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meo meo!");
    }
}

// AnimalFactory class (Abstract Creator)
abstract class AnimalFactory {
    abstract Animal createAnimal();
}

// DogFactory class (Concrete Creator)
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}

// CatFactory class (Concrete Creator)
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}

// Usage
public class FactoryMethodExample {
    public static void main(String[] args) {
        // Using DogFactory to create Dog
        AnimalFactory dogFactory = new DogFactory();
        Animal animal1 = dogFactory.createAnimal();
        animal1.makeSound(); // Output: Gâu gâu!

        // Using CatFactory to create Cat
        AnimalFactory catFactory = new CatFactory();
        Animal animal2 = catFactory.createAnimal();
        animal2.makeSound(); // Output: Meo meo!
    }
}
