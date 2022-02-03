public class Game {

  public static void main(String[] args){

    Player you = new Player();
    you.setName("Link");
    System.out.println("Hello "+you.getName()+"!");

    you.removeHealth(1);
    System.out.println("Oops! It seems you lost some HP! Your HP is now "+you.getHealth());

    you.setWeapon();
    System.out.println("Awesome! You've got a weapon now, it's a "+you.getWeapon());
  }

}
