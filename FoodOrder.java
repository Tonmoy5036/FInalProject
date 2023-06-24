import java.util.Scanner;
public class FoodOrder implements BillGenerator {
    private Scanner sc;
    private int total;
    private String again;

    public FoodOrder() {
        sc = new Scanner(System.in);
    }

    // Method to display the food menu
    public void displayMenu() {
        System.out.println("              Welcome To Diu Cafe      ");
        System.out.println("=====================================================");
        // Display the menu options using objects of food items
        new Burger().display();
        new IceCream().display();
        new Nachos().display();
        new Pizza().display();
        new SetMenu().display();
        new Soup().display();

        System.out.println("7. Exit");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }

    // Method to order a food item
    public void order() throws InvalidChoiceException {
        while (true) {
            System.out.print("Enter Your Choice: ");
            int ch = sc.nextInt();
            // Use polymorphism to handle different food items
            FoodList foodList;
            switch (ch) {
                case 1:
                    foodList = new Burger();
                    break;
                case 2:
                    foodList = new IceCream();
                    break;
                case 3:
                    foodList = new Nachos();
                    break;
                case 4:
                    foodList = new Pizza();
                    break;

                case 5:
                    foodList = new SetMenu();
                    break;
                case 6:
                    foodList = new Soup();
                    break;
                case 7:
                    generateBill();
                    System.exit(0);
                default:
                    throw new InvalidChoiceException("Invalid Choice!");
            }
            System.out.println("You have selected: ");
            foodList.display();

            System.out.print("Enter the desired Quantity: ");
            int quantity = sc.nextInt();

            total += quantity * foodList.getPrice();

            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N): ");
            again = sc.next();
            if (again.equalsIgnoreCase("N")) {
                generateBill();
                System.exit(0);
            } else if (!again.equalsIgnoreCase("Y")) {
                throw new InvalidChoiceException("Invalid Choice!");
            }
        }
    }


    // Method to generate bill
    public void generateBill() {
        System.out.println();
        System.out.println("***************** Thank you for ordering ******************");
        System.out.println("**************** Your Bill is: " + total + " *****************");
    }
}

