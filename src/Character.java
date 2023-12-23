public class Character {
    private int Dex;

    private int Str;

    private int Int;

    private int Con;

    private String name;

    private int level;

    private int health;

    private int stamina;

    private int mana;

    private Item [] inventory = new Item[5];

    private boolean friend;

    private int locX;

    private int locY;

    public int getDex() {
        return Dex;
    }

    public void setDex(int dex) {
        Dex = dex;
    }

    public int getStr() {
        return Str;
    }

    public void setStr(int str) {
        Str = str;
    }

    public int getInt() {
        return Int;
    }

    public void setInt(int anInt) {
        Int = anInt;
    }

    public int getCon() {
        return Con;
    }

    public void setCon(int con) {
        Con = con;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public boolean getFriend() {
        return friend;
    }

    public void setFriend(boolean friend) {
        this.friend = friend;
    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }
    public void setStartingLoc(int locX,int locY)
    {
        setLocX(locX);
        setLocY(locY);
    }
    public Character(int dex, int str, int anInt, int con, String name, int level, int health, int stamina, int mana, Item[] inventory, boolean friend) {
        Dex = dex;
        Str = str;
        Int = anInt;
        Con = con;
        this.name = name;
        this.level = level;
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
        this.inventory = inventory;
        this.friend=friend;
    }
    public void move(char movement)
    {
        if (movement == 'A')this.locX--;
        if (movement == 'D')this.locX++;
        if (movement == 'W')this.locY--;
        if (movement == 'S')this.locY++;
    }
    public void attack()
    {

    }
    public void addItemToInventory()
    {
    }
    public void removeItemFromInventory(Item item)
    {
    }
    public void useItem(Item item)
    {
    }
}
