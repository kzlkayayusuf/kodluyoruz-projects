package java102.adventureGame.monster;

public abstract class Monster {
    private int id;
    private String name;
    private int damage;
    private int health;

    public Monster(int id, String name, int damage, int health) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
