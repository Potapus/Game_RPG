
public class Monster extends Character{
    private int expToGive;

    public Monster(int dex, int str, int anInt, int con, String name, int level, int health, int stamina, int mana, Item[] inventory, boolean friend,int expToGive) {
        super(dex, str, anInt, con, name, level, health, stamina, mana, inventory, false);
        this.expToGive=expToGive;
    }
}