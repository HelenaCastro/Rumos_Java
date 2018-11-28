import dto.Employee;
import org.junit.Assert;
import org.junit.Test;
import service.DBService;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

public class DBServiceTest {

    @Test
    public void insert_validUser_returnPersistedUser() throws SQLException, ClassNotFoundException {

        DBService service= new DBService();

        Employee toSave = new Employee();
        toSave.setFirstName("Tiago");
        toSave.setLastName("Rodrigues");
        toSave.setDob("1993-12-18");
        toSave.setGender("M");

        Employee savedEmployee = service.insertEmployee(toSave);

        Assert.assertTrue(savedEmployee.getFirstName().equals(toSave.getFirstName()));

        //mais complicado- assertj

        assertThat(savedEmployee).isEqualToIgnoringGivenFields(toSave,"number", "hireDate");


    }
}
