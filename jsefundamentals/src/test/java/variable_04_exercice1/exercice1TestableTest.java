package variable_04_exercice1;

import org.junit.Assert;
import org.junit.Test;
import variable_04.exercice1Testable;

public class exercice1TestableTest {


 @Test
    public void concatenateStrings_sucess(){


        exercice1Testable exercice1 = new exercice1Testable();

        Assert.assertEquals("Mary Smith wants to purchase a Shirt",exercice1.getMessage());
    }
}
