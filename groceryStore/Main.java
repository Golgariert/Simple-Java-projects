
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryMenu menuList = new GroceryMenu();

    public static void main(String[] args) {

        boolean quit = false;
        printInstr();
        int choice = 0;

        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstr();
                    break;
                case 1:
                    addMenu();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    menuList.printMenuList();
                    break;
                case 4:
                    modifyStuff();
                    break;
                case 5:
                    quit = true;
                    break;

            }
        }

    }

    public static void printInstr() {
        System.out.println("Press\n"
                + "0 - Print Menu \n"
                + "1 - Add Item to the menu\n"
                + "2 - Remove the item from the list\n"
                + "3 - Print the whole list of Items on the list:\n"
                + "4 - Modify Item\n"
                + "5 - QUIT\n"
                + "...");
    }

    public static void addMenu() {
        System.out.println("Please Enter a grocery Item: ");
        menuList.addMenuList(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.println("Please Enter a grocery Item to remove: ");
        int itemNum = scanner.nextInt();
        menuList.removeMenu(itemNum);
    }

    public static void modifyStuff() {
        menuList.printMenuListTwo();
        System.out.println("Please enter a number which you want to replace: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter a replacement item: ");
        String item = scanner.nextLine();
        menuList.modifyItem(itemNum - 1, item);

    }

}

// Print Menu list +
// Modify Menu list +
// Remove Menu list +
// Grocery store +
