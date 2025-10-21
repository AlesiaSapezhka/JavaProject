package practice5.Pets;

public class Owner {
   private Pets pet;

   public void addPet(Pets pet) {
       this.pet =pet;
       System.out.println("Добавили животное");
   }

   public void feedPat() {
       this.pet.eat();
       System.out.println("Покормили животное");
   }

   public void forcePetToPlay(){
       if (this.pet instanceof Playable playable){
           playable.play();
       } else {
           System.out.println("Ошибка - животное не играет. ");
       }
   }

   public void forcePetToWalk(){
       if (this.pet instanceof Walkable walkable){
           walkable.walk();
       } else {
           System.out.println("Ошибка - животное не гуляет. ");
       }
   }

    public void removePet(Pets pet) {
        this.pet = null;
    }
}
