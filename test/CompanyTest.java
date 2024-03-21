import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company;

    @BeforeEach
    public void setUp() {
        this.company = new Company();
    }

    @Test
    void testConstructor()
    {
        assertNotNull(company.getSellers());
        assertNotNull(company.getClients());
    }

    @Test
    void testRegisterClient(){
        assertTrue(company.registerClient(company.getClients().get(0)));
    }

    @Test
    void testRegisterClients(){
        assertTrue(company.registerClient(company.getClients().get(0)));
        assertTrue(company.registerClient(company.getClients().get(1)));
    }

    @Test
    void testRegisterClientDuplicate(){
        assertFalse(company.registerClient(company.getClients().get(0)) == company.registerClient(company.getClients().get(0)));
    }

    @Test
    void testRegisterClientNull(){
        assertFalse(company.registerClient(null));
    }
}