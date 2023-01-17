package java102.adventureGame.location;

import java102.adventureGame.monster.Vampire;
import java102.adventureGame.player.Player;

public class Forest extends BattleLocation {

    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood", 3, 1);
    }

}
