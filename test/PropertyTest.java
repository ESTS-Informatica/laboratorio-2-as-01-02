import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {

    Property property1;
    public PropertyTest()
    {
        property1 = new Property("T3 Monte Belo", 150000.0);
    }

    @Test
    void testProperty() {
        assertEquals(150000.0, property1.getPrice());
        assertEquals("T3 Monte Belo", property1.getDescription());
    }

    @Test
    void testToString(){
        assertEquals("Descricao       : " + property1.getDescription()
                + "\nPreco        : " + property1.getPrice(), property1.toString());
    }
}
