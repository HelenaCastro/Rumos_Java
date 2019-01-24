package variable_04.exercise2;

public class ShoppingCart2 {

    public static void main(String[] args) {

        String custName = "Mary Smith";
        String itemDesc= "Shirt";

        String message;

        //part2
        double price=22.40;
        double tax=1.23;
        int quantity=1;

        double total;

        message= custName + " wants to purchase a " + quantity + " "+itemDesc;
        System.out.println(message);

        total= price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);
    }
}
