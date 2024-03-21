import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company;
    User client1, client2, seller1, seller2;
    Sell sell1;
    Property property1, property2;

    public CompanyTest()
    {
        this.property1 = new Property("T3 Monte Belo", 150000.0);
        this.property2 = new Property("T4 Montijo", 250000.0);

        this.client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        this.client2 = new User("António Francisco", "92222222","tochico@hotmail.com");
        this.seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        this.seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");

        this.sell1 = new Sell(client1, seller1, property1);
    }

    @BeforeEach
    public void setUp() {
        this.company = new Company();
        company.registerClient(client1);
        company.registerClient(client2);
        company.registerSeller(seller1);
        company.registerSeller(seller2);
        company.registerProperty(property1);
        company.registerProperty(property2);
        company.registerSell(sell1);
    }

    @Test
    void testConstructor()
    {
        assertNotNull(company.getSellers());
        assertNotNull(company.getClients());
    }

    @Test
    void testCreateSell()
    {
        assertTrue(company.createSell(client2, seller2, property2));
    }

    @Test
    void testCalculateSellsOfTheYear()
    {
        assertEquals(1, company.calculateSellsOfTheYear(2024));
    }

    @Test
    void testFindSellerOfTheYear()
    {


    }
}