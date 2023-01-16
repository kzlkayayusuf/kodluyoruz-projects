package java102.adventureGame.location;

import java102.adventureGame.player.Player;
import java102.adventureGame.weapon.Weapon;

public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "Toolstore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("**********Welcome to Toolstore!**********");
        System.out.println("1 - Weapons");
        System.out.println("2 - Shields");
        System.out.println("3 - Out");
        System.out.print("You're choose: ");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.print("invalid value,  please re-enter: ");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("we look forward to seeing you again");
                break;
            default:
                System.out.println("");
                break;
        }
        return true;

    }

    public void printWeapon() {
        System.out.println("**********Weapons**********");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(
                    w.getId() + " - " + w.getName() + " <Coin: " + w.getPrice() + " , Damage: " + w.getDamage());
        }

    }

    public void buyWeapon() {

        System.out.print("Please choose your weapon: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("invalid value,  please re-enter: ");
            selectWeaponID = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getCoin()) {
                System.out.println("you don't have enough coin!");
            } else {
                System.out.println(selectedWeapon.getName() + " was bought!");
                int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                this.getPlayer().setCoin(balance);
                System.out.println("Your remaining balance: " + this.getPlayer().getCoin());
                System.out.println("your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());

            }
        }
    }

    public void printArmor() {
        System.out.println("Armor");
    }
}
