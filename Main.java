public class Main {
    public static void main(String[] args) {
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.displayMenu();

        try {
            foodOrder.order();
        } catch (InvalidChoiceException e) {
            System.out.println(e.getMessage());
        }
    }
}







