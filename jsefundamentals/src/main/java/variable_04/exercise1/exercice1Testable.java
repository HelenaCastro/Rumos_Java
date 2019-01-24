package variable_04;

public class exercice1Testable {

    String custName = "Mary Smith";
    String itemDesc= "Shirt";

    String message;



    public String getCustName() {
        return custName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getMessage() {
        return message=custName + " wants to purchase a " + itemDesc;
    }
}
