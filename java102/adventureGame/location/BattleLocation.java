package java102.adventureGame.location;

import java.util.Random;

import java102.adventureGame.monster.Monster;
import java102.adventureGame.player.Player;

public abstract class BattleLocation extends Location {

    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterNumber();
        System.out.println("you're here now: " + this.getName());
        System.out.println("Be Careful! " + monsterNumber + " " + this.getMonster().getName() + " live here!");
        System.out.print("<F>ight or <R>un away: ");
        String selectBattleCase = input.nextLine();
        if (selectBattleCase.equalsIgnoreCase("f") && combat(monsterNumber)) {
            System.out.println("***********battle area***********");
            System.out.println("you defeated all the enemies in the " + this.getName());
            return true;

        }
        if (this.getPlayer().getHealth() < 0) {
            System.out.println("You're dead!");
            return false;
        }
        return true;
    }

    public boolean combat(int monsterNumber) {
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.print("<H>it or <R>un away");
                String selectCombat = input.nextLine();
                if (selectCombat.equalsIgnoreCase("h")) {
                    System.out.println("You hit!");
                    this.getMonster().setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Monster hits you!");
                        int monsterDamage = this.getMonster().getDamage()
                                - this.getPlayer().getInventory().getArmor().getBlock();
                        if (monsterDamage < 0)
                            monsterDamage = 0;
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("you defeated the monster");
                System.out.println(this.getMonster().getAward() + " coin you won!");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getAward());
                System.out.println("your current coin: " + this.getPlayer().getCoin());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Your Health: " + this.getPlayer().getHealth());
        System.out.println(this.monster.getName() + "\'s Health: " + this.monster.getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Player Values");
        System.out.println("************************");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Coin: " + this.getPlayer().getCoin());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println();

    }

    public void monsterStats(int i) {
        System.out.println(i + ". " + this.getMonster().getName() + " Values");
        System.out.println("************************");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getDamage());
        System.out.println("Award: " + this.getMonster().getAward());
        System.out.println();
    }

    public int randomMonsterNumber() {
        Random r = new Random();

        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

}
