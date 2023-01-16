package java102.adventureGame.location;

import java102.adventureGame.monster.Zombie;
import java102.adventureGame.player.Player;

public class Cave extends BattleLocation {

    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "food", 3);
    }

}
