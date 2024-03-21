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
        //assertTrue(company.registerClient());
    }
}