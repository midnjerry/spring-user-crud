package games.crusader.springusercrud.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testLombok(){
        User user = new User();
        String firstName = "test";
        user.setFirstName(firstName);
        assertEquals(firstName, user.getFirstName());
    }
}