
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        User client2 = new User("António Francisco", "92222222","tochico@hotmail.com");
        User seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");

        clients.add(client1); clients.add(client2);
        sellers.add(seller1); sellers.add(seller2);
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return this.clients;
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return this.sellers;
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return this.properties;
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return this.sells;
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(client == null)
            return false;

        clients.add(client);
        return true;
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if (seller == null)
            return false;

        sellers.add(seller);
        return true;         // dummy implementation
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(property == null)
            return false;

        properties.add(property);
        return true;         // dummy implementation
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        if(sell == null)
            return false;

        sells.add(sell);
        return true;         // dummy implementation
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        return true;
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        return 0;         // dummy implementation
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        return null;         // dummy implementation
    }

}
