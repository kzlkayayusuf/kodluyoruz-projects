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
        if (selectBattleCase.equalsIgnoreCase("f")) {
            System.out.println("battle area");
        }
        return true;
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
