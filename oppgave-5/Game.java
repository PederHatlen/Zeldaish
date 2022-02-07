public class Game {

  public static void main(String[] args){

    Player you = new Player();
    you.setName("Link");
    System.out.println("Hello "+you.getName()+"!");

    you.removeHealth(1);
    System.out.println("Oops! It seems you lost some HP! Your HP is now "+you.getHealth());

    you.setWeapon();
    System.out.println("Awesome! You've got a weapon now, it's a "+you.getWeapon()+"!");

    you.setWeapon("Chainsaw", 15);
    System.out.println("That's lucky indeed, you found a "+you.getWeapon()+"! It's a more powerful weapon, with "+you.getWeaponStats()+" damage!");

    Enemy enemy = new Enemy();
    System.out.println("Oh no! It's a "+enemy.getType()+"! It's really dangerous. Quick, hit it with your "+you.getWeapon()+"!");
  }

}
