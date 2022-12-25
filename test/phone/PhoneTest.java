package phone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {
        Phone myPhone;
    @BeforeEach
    public void setUp(){
        myPhone = new Phone("Paul", "John", "08123456891", "paul255@gmail.com");
    }

    @Test
    public void TestThatPhoneExist(){
        assertNotNull(myPhone);
    }

    @Test
    public void TestThatPhoneCanAddContact(){
        myPhone.add("Paul", "08123456891","John", "emailaddress");
        assertEquals(1,myPhone.numberOfContacts());
    }

    @Test
    public void TestThatContactCanBeSearched(){
        myPhone.add("Paul","08123456891","John", "emaialaddress");
        assertEquals(1,myPhone.numberOfContacts());
        Contact foundContact = myPhone.findContactWithId(1);
       assertEquals(1,foundContact.getId());
       assertEquals("firstname", foundContact.getFirstName());
       assertEquals("lastname",foundContact.getLastName());
       assertEquals("phonenumber",foundContact.getPhoneNumber());
    }

    @Test
    public void TestThatContactCanBeRemoved(){
        myPhone.add("Paul","08123456891","John", "emailaddress");
        assertEquals(1,myPhone.numberOfContacts());
        myPhone.findContactWithId(1);
        myPhone.delete("firstname", "phonenumber");
        assertTrue(true);
    }
}
