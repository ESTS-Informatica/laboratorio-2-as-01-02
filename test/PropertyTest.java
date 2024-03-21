import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {
    @Test
    void testProperty() {
        assertTrue(true);
    }

    @Test
    void testToString(){
        return ("Descricao       : " + description
                + "\nPreco        : " + price);
    }
}
