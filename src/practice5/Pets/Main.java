package practice5.Pets;

import practice5.Zoo.Animal;

public class Main {
    static void main(String[] args) {

       Pets cat = new Cat();
       Owner owner = new Owner();

       owner.addPet(cat);
       owner.feedPat();
       owner.forcePetToPlay();
       owner.forcePetToWalk();

       Pets dog = new Dog();
       owner.addPet(dog);

    }
}
