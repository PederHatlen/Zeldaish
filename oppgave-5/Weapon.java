public class Weapon {
  private String type;
  private int damage;

  public Weapon(String type, int damage){
    this.type = type;
    this.damage = damage;
  }
  public Weapon(){
    this.type = "Wooden stick";
    this.damage = 1;
  }

  public String getType(){
    return this.type;
  }

  public int getDamage(){
    return this.damage;
  }
}
