import java.util.Scanner;

public class TlKochbuchFuerSingles {

    public static void main(String[] args) {
        System.out.println("Willkommen zum TlKochbuchFuerSingles!");

        String[] recipes = {
                "Spiegelei",
                "Spaghetti mit Tomatensoße",
                "Lieferdienst anrufen"
        };

        displayRecipes(recipes);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nBitte wähle eine Option (1/2/3): ");
            int choice = scanner.nextInt();

            if (choice == 1 || choice == 2 || choice == 3) {
                switch (choice) {
                    case 1:
                        printSpiegeleiRecipe();
                        break;
                    case 2:
                        printSpaghettiRecipe();
                        break;
                    case 3:
                        callDeliveryService();
                        break;
                }

                System.out.print("\nMöchtest du weitermachen? (j/n): ");
                scanner.nextLine(); // Leert den Scanner-Puffer
                String continueChoice = scanner.nextLine();

                if (!continueChoice.equalsIgnoreCase("j")) {
                    System.out.println("Auf Wiedersehen!");
                    break;
                }
            } else {
                System.out.println("Ungültige Auswahl. Bitte wähle 1, 2 oder 3.");
            }
        }

        scanner.close();
    }

    private static void displayRecipes(String[] recipes) {
        System.out.println("\nRezepte zur Auswahl:");

        for (int i = 0; i < recipes.length; i++) {
            System.out.println((i + 1) + ". " + recipes[i]);
        }
    }

    private static void printSpiegeleiRecipe() {
        System.out.println("\n** Spiegelei **");
        System.out.println("Zutaten:");
        System.out.println("- Ei(er)");
        System.out.println("- Salz und Pfeffer nach Geschmack");
        System.out.println("Anleitung:");
        System.out.println("1. Erhitze eine Pfanne auf mittlere Hitze.");
        System.out.println("2. Schlage das Ei in die Pfanne.");
        System.out.println("3. Würze mit Salz und Pfeffer nach Geschmack.");
        System.out.println("4. Brate das Ei nach Belieben.");
    }

    private static void printSpaghettiRecipe() {
        System.out.println("\n** Spaghetti mit Tomatensoße **");
        System.out.println("Zutaten:");
        System.out.println("- Spaghetti");
        System.out.println("- Tomatensoße");
        System.out.println("- Parmesan (optional)");
        System.out.println("Anleitung:");
        System.out.println("1. Koche die Spaghetti gemäß den Anweisungen auf der Verpackung.");
        System.out.println("2. Erwärme die Tomatensoße in einer separaten Pfanne.");
        System.out.println("3. Gieße die gekochten Spaghetti ab und mische sie mit der Tomatensoße.");
        System.out.println("4. Optional: Mit Parmesan bestreuen.");
    }

    private static void callDeliveryService() {
        System.out.println("\n** Lieferdienst anrufen **");
        System.out.println("Lieferdienst: XxLieferdienst");
        System.out.println("Telefonnummer: 01234-567890");
        System.out.println("Name des Lieferdienstes: XxLieferdienst");
    }
}
