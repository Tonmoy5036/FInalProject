public class Burger extends FoodList {
    public Burger() {
        price = 120;
    }

    @Override
    public void display() {
        System.out.println("1. Burger - 120/-");
    }
}