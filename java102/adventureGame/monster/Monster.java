package java102.adventureGame.monster;

public abstract class Monster {
    private int id;
    private String name;
    private int damage;
    private int originalDamage;
    private int health;
    private int originalHealth;
    private int award;
    private int originalAward;

    public Monster(int id, String name, int damage, int health, int award) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.originalDamage = damage;
        this.health = health;
        this.originalHealth = health;
        this.award = award;
        this.originalAward = award;
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
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getOriginalDamage() {
        return originalDamage;
    }

    public void setOriginalDamage(int originalDamage) {
        this.originalDamage = originalDamage;
    }

    public int getOriginalAward() {
        return originalAward;
    }

    public void setOriginalAward(int originalAward) {
        this.originalAward = originalAward;
    }

}
