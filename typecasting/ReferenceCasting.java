package typecasting;


class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
        public void sound1()
        {
        	System.out.println("supermethod");
        }
    }

class Dog extends Animal {
    public void sound2() {
    	//super.sound();
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class ReferenceCasting {
    public static void main(String[] args) {
        // Upcasting: Dog reference is upcast to an Animal reference
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Calls the Dog's overridden sound() method due to polymorphism
        myAnimal.sound();
        myAnimal.sound1();
        
        // Attempting to call fetch() would cause an error:
        // myAnimal.fetch(); // Error: fetch() is not defined in Animal

        // Downcasting: Casting the Animal reference back to a Dog reference
        Dog myDog = (Dog) myAnimal; // Downcasting
        myDog.sound();  // Calls Dog's sound() method
        myDog.fetch();  // Now we can call fetch() since myDog is a Dog reference

        // Checking type before downcasting (safe downcasting)
        if (myAnimal instanceof Dog) {
            Dog safeDog = (Dog) myAnimal;
            safeDog.fetch(); // Safe to call fetch() after checking type
        }
    }
}
