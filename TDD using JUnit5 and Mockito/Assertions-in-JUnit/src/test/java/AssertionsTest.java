import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        System.out.println("Running testAssertions...");

        // assertEquals
        System.out.println("Checking if 2 + 3 == 5");
        assertEquals(5, 2 + 3);

        // assertTrue
        System.out.println("Checking if 5 > 3");
        assertTrue(5 > 3);

        // assertFalse
        System.out.println("Checking if 5 < 3 is false");
        assertFalse(5 < 3);

        // assertNull
        System.out.println("Checking if null is null");
        Object obj = null;
        assertNull(obj);

        // assertNotNull
        System.out.println("Checking if object is not null");
        String text = "Cognizant";
        assertNotNull(text);

        System.out.println("All assertions passed.");
    }
}
