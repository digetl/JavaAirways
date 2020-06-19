import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;
    private Plane plane2;

    @Before
    public void before() {
        plane1 = new Plane("CS123", "CESSNA");
    }

    @Test
    public void hasName() {
        assertEquals("CS123", plane1.getName());
    }

    @Test
    public void hasPlaneTyoe() {
        assertEquals("CESSNA", plane1.getPlaneType());
    }
}
