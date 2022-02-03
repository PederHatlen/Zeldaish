public class Player {
  private String name;
  private int health;
  private Weapon weapon;

  public Player(){
    this.health = 5;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void removeHealth(int i){
    this.health = this.health - 1;
  }

  public int getHealth(){
    return this.health;
  }

  public void setWeapon(){
    weapon = new Weapon();
  }

  public String getWeapon(){
    return this.weapon.getType();
  }

  public int getWeaponStats(){
    return this.weapon.getDamage();
  }
}
