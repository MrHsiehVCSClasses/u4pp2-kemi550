package u4pp;

public class Monster extends Combatant {
    
    int monsterEXP;

    public Monster(String name, int health, int attack, int exp){
        super(name, health, attack);
        if (exp < 0){
            monsterEXP = 0;
        } else {
            monsterEXP = exp;
        }
    }
    public int getExpGiven(){
        return monsterEXP;
    }
    public void takeTurn(Combatant target){
        target.takeDamage(getAttackPower());
    }
    public String toString(){
        return super.toString() + "monster EXP: " + monsterEXP;
    }
}
