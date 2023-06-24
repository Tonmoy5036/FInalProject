public class Pizza extends FoodList {
    public Pizza() {
        price = 650;
    }

    @Override
    public void display() {
        System.out.println("4. Pizza - 650/-");
    }
}