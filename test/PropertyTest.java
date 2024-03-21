import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {
    @Test
    void testProperty() {
        Property property1 = new Property("T3 Monte Belo", 150000.0);
        assertEquals(150000.0, property1.getPrice());
        assertEquals("T3 Monte Belo", property1.getDescription());
    }

    @Test
    void testToString(){
        return ("Descricao       : " + description
                + "\nPreco        : " + price);
    }
}
