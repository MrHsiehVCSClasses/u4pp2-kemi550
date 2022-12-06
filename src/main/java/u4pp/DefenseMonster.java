package u4pp;

public class DefenseMonster extends Monster {

    private int defensenum;

    public DefenseMonster(String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
        defensenum = defense;
    }
    public int getDefense(){
        return defensenum;
    }
    public void takeDamage(int damage){
        if (damage - getDefense() > 0){
            super.takeDamage(damage - defensenum);
        }
        else {
            super.takeDamage(0);
        }
    }
    public String toString(){
        return super.toString() + "defense: " + defensenum;
    }
}
