package java102.adventureGame.location;

import java102.adventureGame.player.Player;

public abstract class NormalLocation extends Location {

    public NormalLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return false;
    }

}
