package Oops;

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Dog", "german-Sheperd");
        System.out.println("the animal is " + d.species);
        System.out.println("the breed is " + d.breed);
        d.getSound();
        d.barking();

    }

}

/*
 * this is a super-class where the class animal and the object species have been
 * intialised.
 * this acts has a blue-print. in which the main class can simply create an
 * object and allocate memory for it.
 */
class animal {
    String species;

    public animal(String species) {
        this.species = species;
    }

    public void getSound() {
        System.out.println("animal makes sound");
    }
}

/*
 * Now, let's create a sub-class which inherits the properties of the
 * parent-class i.e. animal
 */

class Dog extends animal {
    String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    // as we have inherited the animal class. methods such as getsound() can also be
    // called from this Dog class.

    public void barking() {
        System.out.println("the animal " + species + " of the breed " + breed + " is making sound.");
    }
}