package java102.adventureGame.location;

import java102.adventureGame.monster.Bear;
import java102.adventureGame.player.Player;

public class River extends BattleLocation {

    public River(Player player) {
        super(player, "River", new Bear(), "Water", 2, 2);
    }

}
