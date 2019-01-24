package conditionsarraysloops;

public class exercice1 {

    public static void main(String[] args) {

        String custName = "Mary Smith";
        String itemDesc= "Shirt";

        String message;

        //part2
        double price=22.40;
        double tax=1.23;
        int quantity=3;

        double total;

        boolean outOfStock=false;


        if(quantity>1) {
            message = custName + " wants to purchase a " + quantity + " " + itemDesc + "s." +"\n";
            System.out.println(message);

        }
        else {
            message = custName + " wants to purchase a " + quantity + " " + itemDesc;
            System.out.println(message);
        }

        if(outOfStock){
            System.out.println("The item is unvailable");
        }
        else{
            total= price * quantity * tax;
            System.out.println("Total cost with tax is: " + total);
        }


    }
}

