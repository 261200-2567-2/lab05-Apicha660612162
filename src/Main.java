import java.util.Scanner;

// Implement the MaxHammer character



// Main class to demonstrate interactions
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your character:");
        System.out.println("1. Warrior (MaxHammer)");
        System.out.println("2. Gunner (ShockBom)");
        System.out.print("Enter 1 or 2: ");

        int choice = scanner.nextInt();
        Character character;

        if (choice == 1) {
            character = new Warrior();
            Hammer hammer = new BasicHammer();
            System.out.println("\n== Warrior Actions ==");
            character.levelUp();
            character.shopping();
            character.equipment(hammer);
            character.powerDrink();
            ((MaxHammer) character).attack(new Gunner());
            ((MaxHammer) character).spin();
            ((MaxHammer) character).block();
        } else if (choice == 2) {
            character = new Gunner();
            Gun gun = new BasicGun();
            System.out.println("\n== Gunner Actions ==");
            character.levelUp();
            character.shopping();
            character.equipment(gun);
            character.powerDrink();
            ((ShockBom) character).shot(new Warrior());
            ((ShockBom) character).changeBullet();
            ((ShockBom) character).shockBom();
        } else {
            System.out.println("Invalid choice! Exiting...");
        }

        scanner.close();
    }
}
