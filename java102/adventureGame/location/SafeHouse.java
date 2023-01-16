package java102.adventureGame.location;

import java102.adventureGame.player.Player;

public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You're at safe house!");
        System.out.println("your health is renewed!");
        return true;
    }

}
