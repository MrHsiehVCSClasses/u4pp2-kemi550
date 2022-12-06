package u4pp;
import java.util.Random;

public class RandomMonster extends Monster {

    public RandomMonster(String name, int health, int attack, int exp){
        super(name, health, attack, exp);
    }
    public void takeTurn(Combatant target){
        Random randomNum = new Random();
        if (randomNum.nextInt(100) < 50){
            super.takeTurn(target);
        }
        else {
            setHealth(0);
        }
    }
    public String toString(){
        return super.toString() + "monster has a 50% chance to attack/miss/sleep/etc.";
    }
}
