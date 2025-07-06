import org.junit.Test;
import static org.junit.Assert.*;

public class LockerTest {

    @Test
    public void testUnlockSuccess() {
        Locker locker = new Locker();
        assertTrue(locker.unlock("1234"));
    }

    @Test
    public void testUnlockFail() {
        Locker locker = new Locker();
        assertFalse(locker.unlock("0000"));
    }

    @Test
    public void testLockAfterUnlock() {
        Locker locker = new Locker();
        locker.unlock("1234");
        locker.lock();
        assertTrue(locker.isLocked());
    }
}
