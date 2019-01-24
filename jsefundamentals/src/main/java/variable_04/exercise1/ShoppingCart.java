package variable_04.exercise1;

public class ShoppingCart {

    public static void main(String[] args) {

        //V1

//        String custName = "Mary Smith";
//        String itemDesc= "Shirt";
//
//        String message;
//
//        message= custName + " wants to purchase a " + itemDesc;
//
//        System.out.println(message);

        //V2 declaration and initial value inline

//        String custName = "Mary Smith", itemDesc= "Shirt";
//
//        String message;
//
//        message= custName + " wants to purchase a " + itemDesc;
//
//        System.out.println(message);

        //V3

//        String custName = "Mary Smith", itemDesc= "Shirt";
//
//        String message;
//
//        message= custName.concat(" wants to purchase a ").concat(itemDesc);
//
//        System.out.println(message);

        //V4 concate strings using StringBuilder

        String custName = "Mary Smith", itemDesc= "Shirt";

        String message;

        message= new StringBuilder(custName)
                .append(" wants to purchase a ")
                .append(itemDesc)
                .toString();

        System.out.println(message);

    }


}
