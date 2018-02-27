
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        Player anton = new Player();
        System.out.println(anton.getHandleName());

        System.out.println("============================");

        anton.setNameAndLevel("Anthony", 5);
        System.out.println(anton.getHandleName());
        System.out.println("Level: " + anton.getLevel());
        System.out.println("Level: " + anton.getLives());
//        System.out.println(anton.getWeapon().getName());   

//        Weapon antonWeapon = anton.getWeapon();
//        System.out.println(antonWeapon.getName().toUpperCase());
        System.out.println(anton.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        anton.setWeapon(myAxe);
        System.out.println(anton.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        anton.pickUpLoot(redPotion);

        anton.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        anton.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        anton.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        anton.showInventory();

        //       Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);
        boolean wasDeleted = anton.dropLoot(redPotion);
        System.out.println(wasDeleted);
        anton.showInventory();

        System.out.println("\n===========Inheritance project===========\n");

//        Enemy enemy = new Enemy("Test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();
        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        System.out.println("================================");

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        System.out.println("================================");

        VampyreKing vamp = new VampyreKing("Vamp");
        vamp.showInfo();

        while (vamp.getLives() > 0) {
            if (vamp.dodges()) {
                continue;
            }
            if (vamp.runAway()) {
                System.out.println("Vamp ran away.");
                break;
            } else {
                vamp.takeDamage(12);
                vamp.showInfo();

            }

        }
        
        System.out.println("\n===========For Loop project===========\n"); 
        
        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility potion", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Dark potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();
        
        System.out.println(conan.score());
        conan.dropLoot("Cursed shield");
        System.out.println(conan.score());

    }

}
