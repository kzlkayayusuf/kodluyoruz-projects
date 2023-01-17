package java102.adventureGame.location;

import java102.adventureGame.player.Player;

public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        if (checkIfAwardsFinish()) {
            char c = 4;
            System.out.println("You Win The Game, Congratulations! " + c);
            return false;
        }
        System.out.println("You're at safe house!");
        System.out.println("Your health is renewed!");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }

    public boolean checkIfAwardsFinish() {
        String[] awards = this.getPlayer().getInventory().getAwards();
        int count = 0;
        for (String award : awards) {
            if (award == null)
                count++;
        }
        return count == 0 ? true : false;
    }

}
