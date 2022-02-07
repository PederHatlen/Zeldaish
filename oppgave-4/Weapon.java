public class Weapon {
  private String type;
  private int damage;
  
  public Weapon(){
    this.type = "Wooden stick";
    this.damage = 1;
  }
  public Weapon(String type, int damage){
    this.type = type;
    this.damage = damage;
  }

  public String getType(){
    return this.type;
  }

  public int getDamage(){
    return this.damage;
  }
}
