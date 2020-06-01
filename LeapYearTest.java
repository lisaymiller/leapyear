import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    // @Test
    // public void testingTest() {
    // LeapYear ly = new LeapYear();
    // assertEquals("thing", ly.doAThing());
    // }

    // @Test
    // public void takesAYearReturnsBoolean() {
    // LeapYear ly = new LeapYear();
    // assertEquals(true, ly.leapYear(2016));
    // }

    @Test
    public void returnsBooleanIfLeapYear() {
        LeapYear ly = new LeapYear();
        assertEquals(true, ly.leapYear(1996));
        assertEquals(false, ly.leapYear(2001));
        assertEquals(true, ly.leapYear(2000));
        assertEquals(false, ly.leapYear(1900));
    }
}