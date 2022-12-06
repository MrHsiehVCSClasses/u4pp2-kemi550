package u4pp;

public class Combatant {

    private String name1;
    private int maxHealth1;
    private int attack1;
    private int health1;
    
    
    public Combatant(String name, int maxHealth, int attack){
        name1 = name;
        maxHealth1 = maxHealth;
        attack1 = attack;
        health1 = maxHealth;
    }
    public String getName(){
        return name1;
    }
    public int getHealth(){
        return health1; 
    }
    public int getMaxHealth(){
        return maxHealth1;
    }
    public int getAttackPower(){
        return attack1;
    }
    public void setHealth(int health){
        if (health > maxHealth1) {
            health1 = maxHealth1;
        } else if (health < 0) {
            health1 = 0;
        } else {
        health1 = health;
        }
    }
    public void setMaxHealth(int health){
        if (health <= 0) {
            maxHealth1 = 1;
        } else {
            maxHealth1 = health;
        } if (maxHealth1 < health1) {
            health1 = maxHealth1;
        }
    }
    public void setAttackPower(int attackPower){
        if (attackPower >= 0) {
            attack1 = attackPower;
        } else {
            attack1 = 0;
        }
    }

    public void takeDamage(int damage){
        int newHealth;
        if (damage >= 0) {
            newHealth = health1 - damage;
            setHealth(newHealth);
        }
    }
    public boolean canFight(){
        if (health1 > 0) {
            return true;
        }
        return false;
    }
    public String toString(){
        return "name: " + name1 + "health: "+ health1 + "max health: " + maxHealth1 + "attack power: " + attack1;
    }
    
}
