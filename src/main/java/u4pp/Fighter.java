package u4pp;

public class Fighter extends Combatant {

    private int level;
    private int EXP;
    private int focusStacks;
    private boolean blocking;
    
    public Fighter(String name, int maxHealth, int attack){
    super (name, maxHealth, attack);
    level = 1;
    EXP = 0;
    focusStacks = 0;
    blocking = false;
    }
    public int getEXP(){
        return EXP;
    }
    public int getFocusStacks(){
        return focusStacks;
    }
    public int getLevel(){
        return level;
    }
    public boolean getIsBlocking(){
        return blocking;
    }
    public void attack(Combatant target){
        int num = 1;
        for (int i = 0; i < focusStacks; i++){
            num *= 2;
        }
        if (focusStacks == 0){
            target.takeDamage(getAttackPower());
            
        } 
        else {
            target.takeDamage(num * getAttackPower());
            focusStacks = 0;
        }
        
    }
    public void block(){
        blocking = true;
    }
    public void focus(){
        focusStacks += 1;
    }
    public void gainEXP(int exp){
        EXP = getEXP() + exp;
        while (EXP >= level){
            EXP -= level;
            level += 1;
            setMaxHealth(getMaxHealth() + 5);
            setAttackPower(getAttackPower() + 1);
            setHealth(getMaxHealth());
        }
    }
    public void takeDamage(int damage){
        if (blocking == true){
            setHealth(getHealth() - (damage/2));
            blocking = false;
        }
        else {
            setHealth(getHealth() - damage);
            blocking = false;
        }
    }
    public String toString(){
        return super.toString() + "level: " + level + "EXP: " + EXP + "focus stacks: " + focusStacks + "is blocking: " + blocking;
    }

}

