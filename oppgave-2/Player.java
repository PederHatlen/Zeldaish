public class Player {
  private String name;
  int health;

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
    this.health -=i;
  }

  public int getHealth(){
    return this.health;
  }
}
