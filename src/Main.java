import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("\nChoose a decorator:");
        System.out.println("1. Asterisks");
        System.out.println("2. Arrow");
        System.out.println("3. Hashes");
        System.out.print("Option: ");

        int option = scanner.nextInt();
        TextDecorator decorator = DecoratorFactory.getDecorator(option);

        if (decorator == null) {
            System.out.println("Invalid option. Please choose 1, 2 or 3.");
            scanner.close();
            return;
        }

        System.out.println("\nResult:");
        System.out.println(decorator.decorate(text));

        scanner.close();
    }
}
