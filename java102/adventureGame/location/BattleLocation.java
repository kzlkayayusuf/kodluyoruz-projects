package java102.adventureGame.location;

import java.util.Random;

import java102.adventureGame.monster.Monster;
import java102.adventureGame.player.Player;
import java102.adventureGame.stuff.Armor;
import java102.adventureGame.stuff.Weapon;

public abstract class BattleLocation extends Location {

    private Monster monster;
    private String award;
    private int maxMonster;
    private int index;

    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonster, int index) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
        this.index = index;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterNumber();
        System.out.println(
                "###################################################################################################");
        System.out.println("You're here now: " + this.getName());
        System.out.println("Be Careful! " + monsterNumber + " " + this.getMonster().getName() + " live here!");
        System.out.print("<F>ight or <R>un away: ");
        String selectBattleCase = input.nextLine();
        while (!((selectBattleCase.equalsIgnoreCase("f")) || (selectBattleCase.equalsIgnoreCase("r")))) {
            System.out.print("invalid value,  please re-enter: ");
            selectBattleCase = input.nextLine();
        }
        if (selectBattleCase.equalsIgnoreCase("f") && combat(monsterNumber)) {
            System.out.println(
                    "###################################################################################################");
            System.out.println("You defeated all the enemies in the " + this.getName());

            saveAwards();
            return true;

        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You're dead!");
            return false;
        }
        return true;
    }

    public void saveAwards() {
        String[] awards = this.getPlayer().getInventory().getAwards();
        awards[getIndex()] = getAward();
        this.getPlayer().getInventory().setAwards(awards);
        System.out.println("Your Award: " + getAward());
    }

    public boolean combat(int monsterNumber) {
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            System.out.println(
                    "########################################### Battle Area ###########################################");
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.print("<H>it or <R>un away: ");
                String selectCombat = input.nextLine();
                while (!(selectCombat.equalsIgnoreCase("h")) && !(selectCombat.equalsIgnoreCase("r"))) {
                    System.out.print("invalid value,  please re-enter: ");
                    selectCombat = input.nextLine();
                }
                if (selectCombat.equalsIgnoreCase("h")) {
                    fight();

                } else {
                    return false;
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("***** You defeated the monster *****");
                if (this.getName() == "Mine")
                    surpriseGift();
                System.out.println(this.getMonster().getAward() + " coin you won!");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getMonster().getAward());
                System.out.println("Your current coin: " + this.getPlayer().getCoin());
                if (this.getMonster().getName() == "Snake") {
                    this.getMonster().setAward(this.getMonster().getOriginalAward());
                    this.getMonster().setDamage(this.getMonster().getOriginalDamage());
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private void surpriseGift() {
        Random random = new Random();
        int chance = random.nextInt(101);
        if (chance >= 0 && chance < 15) {
            // win a weapon
            chance = random.nextInt(101);
            if (chance >= 0 && chance <= 20) {
                Weapon weapon = Weapon.getWeaponObjByID(3);
                System.out.println("Congrats, You win Rifle!");
                System.out.println("Your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                System.out.print("Do you want to save that gift? <Y>es or <N>o: ");
                String choose = input.nextLine();
                while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                    System.out.print("invalid value, please re-enter: ");
                    choose = input.nextLine();
                }
                if (choose.equalsIgnoreCase("y")) {
                    this.getPlayer().getInventory().setWeapon(weapon);
                    System.out.println("Your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("You missed gift!");
                }
            } else if (chance > 20 && chance < 51) {
                Weapon weapon = Weapon.getWeaponObjByID(2);
                System.out.println("Congrats, You win Sword!");
                System.out.println("Your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                System.out.print("Do you want to save that gift? <Y>es or <N>o: ");
                String choose = input.nextLine();
                while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                    System.out.print("invalid value, please re-enter: ");
                    choose = input.nextLine();
                }
                if (choose.equalsIgnoreCase("y")) {
                    this.getPlayer().getInventory().setWeapon(weapon);
                    System.out.println("Your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("You missed gift!");
                }
            } else if (chance > 51 && chance <= 100) {
                Weapon weapon = Weapon.getWeaponObjByID(1);
                System.out.println("Congrats, You win Pistol!");
                System.out.println("Your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                System.out.print("Do you want to save that gift? <Y>es or <N>o: ");
                String choose = input.nextLine();
                while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                    System.out.print("invalid value, please re-enter: ");
                    choose = input.nextLine();
                }
                if (choose.equalsIgnoreCase("y")) {
                    this.getPlayer().getInventory().setWeapon(weapon);
                    System.out.println("Your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("You missed gift!");
                }
            }
        } else if (chance >= 15 && chance < 30) {
            // win an armor
            chance = random.nextInt(101);
            if (chance >= 0 && chance <= 20) {
                Armor armor = Armor.getArmorObjByID(3);
                System.out.println("Congrats, You win Heavy Armor!");
                System.out.println("Your previous armor: " + this.getPlayer().getInventory().getArmor().getName());
                System.out.print("Do you want to save that gift? <Y>es or <N>o: ");
                String choose = input.nextLine();
                while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                    System.out.print("invalid value, please re-enter: ");
                    choose = input.nextLine();
                }
                if (choose.equalsIgnoreCase("y")) {
                    this.getPlayer().getInventory().setArmor(armor);
                    System.out.println("Your current armor: " + this.getPlayer().getInventory().getArmor().getName());
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("You missed gift!");
                }
            } else if (chance > 20 && chance < 51) {
                Armor armor = Armor.getArmorObjByID(2);
                System.out.println("Congrats, You win Intermediate Armor!");
                System.out.println("Your previous armor: " + this.getPlayer().getInventory().getArmor().getName());
                System.out.print("Do you want to save that gift? <Y>es or <N>o: ");
                String choose = input.nextLine();
                while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                    System.out.print("invalid value, please re-enter: ");
                    choose = input.nextLine();
                }
                if (choose.equalsIgnoreCase("y")) {
                    this.getPlayer().getInventory().setArmor(armor);
                    System.out.println("Your current armor: " + this.getPlayer().getInventory().getArmor().getName());
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("You missed gift!");
                }
            } else if (chance > 51 && chance <= 100) {
                Armor armor = Armor.getArmorObjByID(1);
                System.out.println("Congrats, You win Slight Armor!");
                System.out.println("Your previous armor: " + this.getPlayer().getInventory().getArmor().getName());
                System.out.print("Do you want to save that gift? <Y>es or <N>o: ");
                String choose = input.nextLine();
                while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                    System.out.print("invalid value, please re-enter: ");
                    choose = input.nextLine();
                }
                if (choose.equalsIgnoreCase("y")) {
                    this.getPlayer().getInventory().setArmor(armor);
                    System.out.println("Your current armor: " + this.getPlayer().getInventory().getArmor().getName());
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("You missed gift!");
                }
            }
        } else if (chance >= 30 && chance < 55) {
            // earn coin
            chance = random.nextInt(101);
            if (chance >= 0 && chance <= 20) {
                System.out.println("Congrats, You win Coin!");
                this.getMonster().setAward(10);
            } else if (chance > 20 && chance < 51) {
                System.out.println("Congrats, You win Coin!");
                this.getMonster().setAward(5);
            } else if (chance > 51 && chance <= 100) {
                System.out.println("Congrats, You win Coin!");
                this.getMonster().setAward(1);
            }
        } else {
            System.out.println("Unfortunately, You didn't win gift!");
        }
    }

    private void fight() {
        if (randomAttack()) {
            System.out.println("***** You hit! *****");
            this.getMonster().setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
            afterHit();
            if (this.getMonster().getHealth() > 0) {
                System.out.println();
                System.out.println("***** Monster hits you! *****");
                int monsterDamage = this.getMonster().getDamage()
                        - this.getPlayer().getInventory().getArmor().getBlock();
                if (monsterDamage < 0)
                    monsterDamage = 0;
                this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                afterHit();
            }
        } else {
            if (this.getMonster().getHealth() > 0) {
                System.out.println("***** Monster hits you! *****");
                int monsterDamage = this.getMonster().getDamage()
                        - this.getPlayer().getInventory().getArmor().getBlock();
                if (monsterDamage < 0)
                    monsterDamage = 0;
                this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                afterHit();
            }
            if (this.getPlayer().getHealth() > 0) {
                System.out.println();
                System.out.println("***** You hit! *****");
                this.getMonster().setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                afterHit();
            }
        }
    }

    private void afterHit() {
        System.out.println("Your Health: " + this.getPlayer().getHealth());
        System.out.println(this.monster.getName() + "\'s Health: " + this.monster.getHealth());
    }

    private boolean randomAttack() {
        double randomNumber = Math.random() * 100;
        return (randomNumber >= 50);
    }

    private void playerStats() {
        System.out.println("Player Values");
        System.out.println("************************");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Coin: " + this.getPlayer().getCoin());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("************************");

    }

    private void monsterStats(int i) {
        System.out.println(i + ". " + this.getMonster().getName() + " Values");
        System.out.println("************************");
        System.out.println("Health: " + this.getMonster().getHealth());
        if (this.getMonster().getDamage() == -1) {
            Random random = new Random();
            int damage = random.nextInt(4) + 3;
            this.getMonster().setDamage(damage);
        }
        System.out.println("Damage: " + this.getMonster().getDamage());
        System.out.println("Award: " + this.getMonster().getAward());
        System.out.println("************************");
    }

    private int randomMonsterNumber() {
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
