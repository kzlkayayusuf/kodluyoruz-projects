package java102.adventureGame.location;

import java102.adventureGame.player.Player;
import java102.adventureGame.stuff.Armor;
import java102.adventureGame.stuff.Weapon;

public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "Toolstore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("**********Welcome to Toolstore!**********");
        boolean showMenu = true;
        while (showMenu) {
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
                    buyArmor();
                    break;
                case 3:
                    System.out.println("we look forward to seeing you again");
                    showMenu = false;
                    break;
                default:
                    System.out.println("");
                    break;
            }

        }
        return true;

    }

    public void printWeapon() {
        System.out.println("********** Weapons **********");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(
                    w.getId() + " - " + w.getName() + " < Coin: " + w.getPrice() + " , Damage: " + w.getDamage()
                            + " >");
        }
        System.out.println("0 - Out");

    }

    public void buyWeapon() {

        System.out.print("Please choose your weapon: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("invalid value,  please re-enter: ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("You don't have enough coin!");
                } else {
                    System.out.println(selectedWeapon.getName() + " was bought!");
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Your remaining balance: " + this.getPlayer().getCoin());
                    System.out
                            .println("Your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Your current weapon: " + this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }
    }

    public void printArmor() {
        System.out.println("********** Armors **********");
        for (Armor a : Armor.armors()) {
            System.out.println(
                    a.getId() + " - " + a.getName() + "< Coin: " + a.getPrice() + " , Armor: " + a.getBlock() + " >");
        }
        System.out.println("0 - Out");
    }

    public void buyArmor() {

        System.out.print("Please choose a armor: ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("invalid value,  please re-enter: ");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("you don't have enough coin!");
                } else {
                    System.out.println(selectedArmor.getName() + " was bought!");
                    int balance = this.getPlayer().getCoin() - selectedArmor.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Your remaining balance: " + this.getPlayer().getCoin());
                    System.out.println("Your previous armor: " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your current armor: " + this.getPlayer().getInventory().getArmor().getName());

                }
            }
        }
    }
}
