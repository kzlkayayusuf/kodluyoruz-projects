package java102.adventureGame.location;

import java102.adventureGame.monster.Snake;
import java102.adventureGame.player.Player;

public class Mine extends BattleLocation {

    public Mine(Player player) {
        super(player, "Mine", new Snake(), "Surprise", 5, 3);
    }

}
